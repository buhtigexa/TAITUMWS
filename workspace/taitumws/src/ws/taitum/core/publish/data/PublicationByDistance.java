package ws.taitum.core.publish.data;

import ws.geocoder.schemas.Address;
import ws.taitum.core.wsclients.GeocoderClient;

public class PublicationByDistance extends Publication{

	protected  ws.taitum.core.wsclients.GeocoderClient geocoderSys;
	protected ws.geocoder.schemas.Address src,dest;
	
	public PublicationByDistance(ws.taitum.schemas.Ad publish) {
		super(publish);
		geocoderSys=new GeocoderClient();
		src=new Address();
		src.setCity(this.data.getAddress().getCity());
		src.setStreet(this.data.getAddress().getStreet());
		src.setHigh(this.data.getAddress().getHigh());
	}


	@Override
	public boolean accept(ws.taitum.core.publish.data.Publication publish) {
		
		boolean success=true;
		dest=new Address();
		dest.setCity(publish.data.getAddress().getCity());
		dest.setStreet(publish.data.getAddress().getStreet());
		dest.setHigh(publish.data.getAddress().getHigh());
		try{
			int d=(int)geocoderSys.getDistance(src, dest)*10;
			int distance=(d>=0)?d:-d; // Distance can't be negative!.
			success=(this.data.getSquareDistance()+1 >= distance);
		}
		catch(Exception e){
			success=false;
		}
		return 	success;
				
	}


	@Override
	public void save() {
		db.getRequest().add(this);
		
	}


}
