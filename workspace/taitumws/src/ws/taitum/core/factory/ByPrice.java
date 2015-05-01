package ws.taitum.core.factory;

import ws.taitum.core.publish.data.Publication;
import ws.taitum.schemas.Ad;

public class ByPrice implements FactoryMethod{

	public ByPrice(){
		
	}
	@Override
	public Publication create(Ad ad) {
		return new ws.taitum.core.publish.data.PublicationByPrice(ad);
	}

}
