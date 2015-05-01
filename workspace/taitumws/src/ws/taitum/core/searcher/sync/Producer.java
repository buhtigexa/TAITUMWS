package ws.taitum.core.searcher.sync;

import java.util.Observable;

import ws.taitum.core.searcher.Searcher;
import ws.taitum.core.wsclients.EmailClient;

public abstract class Producer {

	protected Searcher searcher;

	protected ws.taitum.core.data.Table table;
	protected ws.taitum.core.publish.data.Publication notifiable;
	protected ws.taitum.schemas.Ads ads;
	protected EmailClient emailSys;	
	
	public Producer(EmailClient emailClient){
	
		searcher=new Searcher();
		emailSys=emailClient;

	}
	
	
	public void setUp(Observable o,Object arg){

		table=(ws.taitum.core.data.Table)o;
		notifiable=(ws.taitum.core.publish.data.Publication)arg;
		
		
	}
	public void run(){
	
		buildData();
	}

	
	protected abstract void buildData();
}
