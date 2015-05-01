package ws.statistics.core.indicators;

import java.util.Enumeration;
import java.util.Hashtable;

import ws.statistics.core.indicators.operations.Operation;
import ws.statistics.core.keys.Key;
import ws.statistics.schemas.Distribution;
import ws.statistics.schemas.Event;


public class ProbabilityDistribution {

	protected Hashtable<Key,Float> distr;
	protected Hashtable<Key,Float> cdistr;
	protected int n;
	
	public Hashtable<Key, Float> getDistr() {
		return distr;
	}

	public ProbabilityDistribution(){
		
		n=0;
		distr=new Hashtable<Key,Float>();
		distr.clear();
	}
	
	public void add(Key key){
		
		float freq=1;
		n++;
		if ( !(distr.containsKey(key) ) ){
			distr.put(key,freq);
			return;
		}
		freq+=distr.get(key);
		distr.remove(key);
		distr.put(key,freq);
	}
	
	
	
	protected Hashtable<Key,Float> calculate(){
		
		float value=0;
		cdistr=new Hashtable<Key,Float>();
		Enumeration<Key> it  = distr.keys();
		while (it.hasMoreElements()){
				Key key=it.nextElement();
				value= distr.get(key);
				cdistr.put(key,(value/n));
		}
		return cdistr;

	}
		
	
	public float applyOperation(Operation op){
		
		float value=0;
		calculate();
	
		Enumeration<Key> it   = cdistr.keys();
		while (it.hasMoreElements()){
				Key key=it.nextElement();
				value+= (cdistr.get(key)*(op.exec(key)));// f(x)..p(x) or f(x,y).p(x,y).
				}
		return value;
	}
		


	public ws.statistics.schemas.Distribution cast() {
	
		ws.statistics.schemas.Distribution distribution=new Distribution();
		ws.statistics.schemas.Event event;
		calculate();
		Enumeration<Key> it   = cdistr.keys();
		while (it.hasMoreElements()){
				Key key=it.nextElement();
				event=new Event();
				event.setProbability(cdistr.get(key));
				event.setValue(key.get());
				distribution.addEvent(event);
			}
	
		return distribution;
	
	}

}
