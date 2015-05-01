package ws.geocoder.core;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import ws.geocoder.definitions.GeocoderwsSkeletonInterface;
import ws.geocoder.definitions.GetAddress;
import ws.geocoder.definitions.GetAddressResponse;
import ws.geocoder.definitions.GetCoordinate;
import ws.geocoder.definitions.GetCoordinateResponse;
import ws.geocoder.definitions.GetDistance;
import ws.geocoder.definitions.GetDistanceResponse;
import ws.geocoder.schemas.Coordinate;
import ws.geocoder.schemas.Distance;


public class GeocoderAdapter implements GeocoderwsSkeletonInterface{

	protected static IGeocoder geocoder;
	
	public GeocoderAdapter(){
		geocoder=new IGeocoder();
	}

	@Override
	public GetAddressResponse getAddress(GetAddress getAddress) {
		
		ws.geocoder.schemas.Coordinate coordinate= getAddress.getCoordinate();
		ws.geocoder.schemas.Address address= geocoder.getAddress(coordinate);
		GetAddressResponse response=new GetAddressResponse();
		response.setAddress(address);
		return response;
		
	}

	@Override
	public GetDistanceResponse getDistance(GetDistance getDistance) {
	
			ws.geocoder.schemas.Coordinate source= getDistance.getCoordinateSrc();
			ws.geocoder.schemas.Coordinate destiny= getDistance.getCoordinateDst();
			double d= geocoder.distanceTo(source, destiny);
			GetDistanceResponse response=new GetDistanceResponse();
		    ws.geocoder.schemas.Distance distance=new Distance();
		    distance.setValue(d);
		    response.setDistance(distance);
		    return response;
	}

	@Override
	public GetCoordinateResponse getCoordinate(GetCoordinate getCoordinate) {
		
		ws.geocoder.schemas.Address address= getCoordinate.getAddress();
		ws.geocoder.schemas.Coordinate coordinate = new Coordinate();
		ws.geocoder.definitions.GetCoordinateResponse response=new GetCoordinateResponse();
		try {
	  	  coordinate= geocoder.getCoordinate(address);
  
		} catch (XPathExpressionException | IOException| ParserConfigurationException | SAXException e) {
				e.printStackTrace();
		}
		response.setCoordinate(coordinate);
		return response;
	}

	
}
