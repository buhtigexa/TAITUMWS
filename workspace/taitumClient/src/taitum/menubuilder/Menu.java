package taitum.menubuilder;

import taitum.buildoptions.Condition;
import taitum.buildoptions.Set;
import taitum.client.Taitum;
import taitum.client.Utils;


public class Menu {

	protected Taitum taitum;
	protected String type;
	protected int ndexInt;
	protected Set setup;
	protected Condition condition;
	
	public Menu(Taitum taitum,String type,Condition condition,Set setUp){

		this.taitum=taitum;

		this.type=type;
		this.condition=condition;
		this.setup=setUp;
	}
	
	public boolean make (ws.taitum.schemas.Address addressData,String[] args,ws.taitum.schemas.Ad ad,ws.taitum.schemas.AdType adType){

		boolean isValid=false;
		try{			
			
			
			isValid=condition.isValid(addressData,args);
			if (!isValid){ 
				Utils.usage();
				return false;
			}
			
			setup.set(ad, args);
			ad.setAddress(condition.address);
			adType.setType(type);	//I know this from the autogenerated AdType class.
		  }
		catch(NumberFormatException|ArrayIndexOutOfBoundsException e){
				Utils.usage();
				return false;
		}
		isValid=true;
		return isValid;
		}	
//	
	
}
	


