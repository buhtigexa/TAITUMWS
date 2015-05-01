package taitum.buildoptions;

public abstract class Condition {

	protected taitum.client.Taitum taitum;
	public ws.taitum.schemas.Address address=null;
	protected int index; 
	public Condition(taitum.client.Taitum taitum, int index){
		this.taitum=taitum;
		this.index=index;
	}
	
	public abstract boolean isValid(ws.taitum.schemas.Address addressData,String[] args);
	
	
	
}
