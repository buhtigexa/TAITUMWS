package ws.statistics.core.indicators.operations;

public abstract class WrapperOp extends Operation{

	Operation op;
	public WrapperOp(Operation op){
		this.op=op;
	}
	

}
