package ws.taitum.core.publish.data;


public class PublicationByAddress extends Publication{

	public PublicationByAddress(ws.taitum.schemas.Ad publish) {
		super(publish);
	
	}

	@Override
	public void save() {
		db.getRequest().add(this);
		
	}

	@Override
	public boolean accept(Publication publish) {
		boolean street=data.getAddress().getStreet().contains(publish.data.getAddress().getStreet()) || 
					   data.getAddress().getStreet().equalsIgnoreCase(publish.data.getAddress().getStreet());
		boolean city=  data.getAddress().getCity().contains(publish.data.getAddress().getCity()) || 
				 	   data.getAddress().getCity().equalsIgnoreCase(publish.data.getAddress().getCity());
		if (street && city){
			return true;
		}
		else if (street) return true;
		return false;
			
	}

	

}
