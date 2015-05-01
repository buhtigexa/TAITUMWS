package ws.statistics.core.indicators.operations;

import ws.statistics.core.keys.Key;

public class NoOp extends Operation {

	@Override
	public double exec(Key key) {
		return key.get();
		
	}
	

}
