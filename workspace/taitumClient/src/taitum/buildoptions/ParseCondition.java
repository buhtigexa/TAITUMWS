package taitum.buildoptions;

import taitum.client.Taitum;
import taitum.client.Utils;
import ws.taitum.schemas.Address;

public class ParseCondition extends Condition{

	
	public ParseCondition(Taitum taitum,int indexToParse) {
		super(taitum,indexToParse);
	
	}

	@Override
	public boolean isValid(Address addressData, String[] args) {
		address=Utils.parseAddress(args[index]);
		if (address==null){
			return false;
		}
		return true;
	
	}

}
