package ws.statistics.core.indicators.operations;

import ws.statistics.core.keys.Key;
import ws.statistics.core.keys.SimpleKey;

public  class XMinus extends Operation{

	protected double mean;

	public XMinus(double mean){
		this.mean=mean;
	}
	@Override
	public double exec(Key key) {
		
		return ((SimpleKey)key).value_x - mean;
	}
	
	

}
