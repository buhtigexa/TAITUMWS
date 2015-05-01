package ws.taitum.core.factory;

import ws.taitum.core.publish.data.Publication;
import ws.taitum.schemas.Ad;

public class ByDistance implements FactoryMethod{

	public ByDistance(){
		
	}
	@Override
	public Publication create(Ad ad) {
		return new ws.taitum.core.publish.data.PublicationByDistance(ad);
	}

}
