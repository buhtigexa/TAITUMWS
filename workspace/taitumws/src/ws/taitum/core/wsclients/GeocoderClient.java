package ws.taitum.core.wsclients;

import ws.geocoder.definitions.Geocoderws;
import ws.geocoder.definitions.Geocoderws_Service;
import ws.geocoder.schemas.Distance;


public class GeocoderClient {

	protected Geocoderws_Service stub;
	protected Geocoderws geocoder;
	
	public GeocoderClient(){
	
		stub=new Geocoderws_Service();
		geocoder=stub.getGeocoderws();
	}
	
	public ws.geocoder.schemas.Coordinate getCoordinate(ws.geocoder.schemas.Address address){
		
		return geocoder.getCoordinate(address);
	}
	
	public ws.geocoder.schemas.Address getAddress(ws.geocoder.schemas.Coordinate coordinate){

		return geocoder.getAddress(coordinate);
	}
	
	public double getDistance(ws.geocoder.schemas.Address src, ws.geocoder.schemas.Address dest){
	
		ws.geocoder.schemas.Coordinate coordSrc=geocoder.getCoordinate(src);
		ws.geocoder.schemas.Coordinate coordDest=geocoder.getCoordinate(dest);
		ws.geocoder.schemas.Distance distance=new Distance();
		distance=geocoder.getDistance(coordSrc, coordDest);
		return distance.getValue();
	}
	
	
}
