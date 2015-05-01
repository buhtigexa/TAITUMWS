package ws.taitum.core.publish.data;




public class PublicationByPrice  extends Publication{

	
	 public PublicationByPrice(ws.taitum.schemas.Ad publish) {
		
		super(publish);
	}

	@Override
	public boolean accept(ws.taitum.core.publish.data.Publication publish) {
		return (publish.data.getPrice() <= (this.data.getPrice()+this.data.getPriceVariance())); 

		
	}

	@Override
	public void save() {
		db.getRequest().add(this);
		
	}	
		
	

	
	
}
