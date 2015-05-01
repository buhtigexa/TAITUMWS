package ws.taitum.core.searcher;

import java.util.Vector;

import ws.taitum.core.publish.data.Publication;
import ws.taitum.schemas.Ads;

public  class Searcher {

	protected ws.taitum.schemas.Ads ads;
	
	public Searcher(){
		
	}
	
	
	public ws.taitum.schemas.Ads search(ws.taitum.core.data.Table table,ws.taitum.core.publish.data.Publication filter){
		
		ws.taitum.schemas.Ads ads=new Ads();
		
		Vector<Publication> directory=table.dataSet;
		for (int i=0;i<directory.size();i++){
			Publication  item = directory.get(i);
			if (filter.accept(item)){
				ads.addAd(item.data);
			}
		}
		return ads;
	}
	
	




				

}
