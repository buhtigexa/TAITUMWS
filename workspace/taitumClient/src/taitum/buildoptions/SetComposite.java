package taitum.buildoptions;

import ws.taitum.schemas.Ad;


public class SetComposite extends Set{

	protected Set set1;
	protected Set set2;
	public SetComposite(Set set1,Set set2){
		this.set1=set1;
		this.set2=set2;
	}
	@Override
	public void set(Ad ad, String[] args) throws NumberFormatException {
		set1.set(ad, args);
		set2.set(ad, args);
		
	}
}
