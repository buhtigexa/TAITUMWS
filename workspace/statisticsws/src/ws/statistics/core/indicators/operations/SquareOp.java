package ws.statistics.core.indicators.operations;

import ws.statistics.core.keys.Key;

public class SquareOp extends WrapperOp{

	public SquareOp(Operation op) {
		super(op);
	}

	@Override
	public double exec(Key key) {
		double temp= op.exec(key);
		return temp*temp;
	}

}
