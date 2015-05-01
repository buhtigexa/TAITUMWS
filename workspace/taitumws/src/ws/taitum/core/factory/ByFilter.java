package ws.taitum.core.factory;

import ws.taitum.core.publish.data.Publication;
import ws.taitum.schemas.Ad;

public class ByFilter implements FactoryMethod{

	public ByFilter(){
		
	}
	
	@Override
	public Publication create(Ad ad) {
		return new ws.taitum.core.publish.data.PublicationByRequest(ad);
	}

}
