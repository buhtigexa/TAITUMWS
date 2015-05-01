package ws.taitum.core.publish.data;


public class PublicationByRequest  extends Publication{


	public PublicationByRequest(ws.taitum.schemas.Ad publish){
		super(publish);
	}
	
	
	@Override
	public boolean accept(ws.taitum.core.publish.data.Publication publish) {
	
		return (publish.accept(this));
	}


	@Override
	public void save() {
		db.getOffers().add(this);
		
	}

}
