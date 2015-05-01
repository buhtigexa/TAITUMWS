package ws.taitum.core.searcher;

import java.util.Observable;
import java.util.Observer;

import ws.taitum.core.searcher.sync.Producer;

public class Listener implements Observer{

	protected Producer producer;
	
	public Listener(Producer thread){
		
		producer=thread;
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		producer.setUp(o,arg);
		producer.run();
	}
}
