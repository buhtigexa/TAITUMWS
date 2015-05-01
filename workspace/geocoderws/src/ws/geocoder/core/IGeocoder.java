package ws.geocoder.core;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import ws.geocoder.schemas.Coordinate;


public class IGeocoder {

	protected static int radius = 6371; 
	
	
	public ws.geocoder.schemas.Coordinate getCoordinate(ws.geocoder.schemas.Address  address )  throws IOException, XPathExpressionException, ParserConfigurationException, SAXException  {

		
		 ws.geocoder.schemas.Coordinate coordinate=new Coordinate();
		 String geoxml = "http://maps.google.com/maps/api/geocode/xml";
		 IAddress iaddress=new IAddress(address);
		 
		 URL url = new URL(geoxml + "?address=" + URLEncoder.encode(iaddress.toString(), "UTF-8") + "&sensor=false");
		 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
  	     Document geocoderResultDocument = null;
		  try {
			  connection.connect();
		      InputSource geocoderResultInputSource = new InputSource(connection.getInputStream());
		      geocoderResultDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(geocoderResultInputSource);
		    }  finally {connection.disconnect(); }
		    XPath xpath = XPathFactory.newInstance().newXPath();
		    NodeList resultNodeList = null;
		    resultNodeList = (NodeList) xpath.evaluate("/GeocodeResponse/result/formatted_address", geocoderResultDocument, XPathConstants.NODESET);
		    resultNodeList = (NodeList) xpath.evaluate("/GeocodeResponse/result[1]/address_component[type/text()='locality']/long_name", geocoderResultDocument, XPathConstants.NODESET);
		    resultNodeList = (NodeList) xpath.evaluate("/GeocodeResponse/result[1]/geometry/location/*", geocoderResultDocument, XPathConstants.NODESET);
		    double latitude=Double.NaN;
		    double longitude=Double.NaN;
		    for(int i=0; i<resultNodeList.getLength(); ++i) {
		    	
		    		Node node = resultNodeList.item(i);
		    		if("lat".equals(node.getNodeName())) latitude = Double.parseDouble(node.getTextContent());
		    		if("lng".equals(node.getNodeName())) longitude= Double.parseDouble(node.getTextContent());
		    }
		   coordinate.setLatitude(latitude);
		   coordinate.setLongtitude(longitude);
		   return coordinate;
	  }

	public ws.geocoder.schemas.Address getAddress(ws.geocoder.schemas.Coordinate coordinate){
		
		ws.geocoder.schemas.Address  iaddress=new IAddress();
		String coordinateStr=coordinate.getLatitude()+","+coordinate.getLongtitude();
		String response = "";
		String gURL = "http://maps.google.com/maps/api/geocode/xml?latlng=" + coordinateStr + "&sensor=true"; 
		try {
				DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				Document dom = documentBuilder.parse(gURL);
				Element docEl = dom.getDocumentElement();
				NodeList nl = docEl.getElementsByTagName("result");
				if (nl != null && nl.getLength() > 0){
					response=((Element)nl.item(0)).getElementsByTagName("formatted_address").item(0).getTextContent();
			}
		} 
			catch (Exception ex) {		
				ex.printStackTrace();
			}
	
		
		((ws.geocoder.core.IAddress) iaddress).parseAddress(response);
		System.out.println(iaddress);
		return iaddress;
	}
		
	public double distanceTo(ws.geocoder.schemas.Coordinate src, ws.geocoder.schemas.Coordinate dest){
			
		 double dLat = Math.toRadians( src.getLatitude() - dest.getLatitude() );
	    double dLon = Math.toRadians(src.getLongtitude() - dest.getLongtitude());
	    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
	       Math.cos(Math.toRadians(src.getLatitude())) * Math.cos(Math.toRadians(dest.getLatitude())) 
	      * Math.sin(dLon / 2) * Math.sin(dLon / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = radius * c;
	    return distance;
	}
	

}
