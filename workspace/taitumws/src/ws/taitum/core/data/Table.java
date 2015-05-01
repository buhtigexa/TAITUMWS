package ws.taitum.core.data;

import java.util.Observable;
import java.util.Vector;

import ws.taitum.core.publish.data.Publication;
import ws.taitum.schemas.Ads;

public class Table extends Observable{

	
	
	public Vector<ws.taitum.core.publish.data.Publication> dataSet;
	protected boolean broadcast=false;
	
	public ws.taitum.core.data.DataBase db;
	
	public Table(){
		
		dataSet=new Vector<ws.taitum.core.publish.data.Publication>();
	}
	
	public void add(ws.taitum.core.publish.data.Publication e){
	
		dataSet.add(e);
		if (broadcast){
			setChanged();
			notifyObservers(e);
		}
	}
	
	public void setBroadcast(boolean broadcast) {
		this.broadcast = broadcast;
	}

	public ws.taitum.schemas.Ads getData() {
		
		ws.taitum.schemas.Ads ads=new Ads();
		for (Publication publish:dataSet){
			ads.addAd(publish.data);
		}
		return ads;
	}
	
}
