package ws.taitum.core.publish.data;



public abstract class Publication  {

	public ws.taitum.schemas.Ad data;
	public ws.taitum.core.data.DataBase db;
	
	
	public Publication(ws.taitum.schemas.Ad publish){
		this.data=publish;
		
	}

	

	public abstract void save();
	
	@Override
	public String toString(){
		return	data.toString();
		
	}
	
	public abstract boolean accept(ws.taitum.core.publish.data.Publication publish);
	
	
}
