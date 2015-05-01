package taitum.buildoptions;

import taitum.client.Taitum;
import ws.taitum.schemas.Address;

public class TrueCondition extends Condition{

	
	public TrueCondition(Taitum taitum,int index) {
		super(taitum, index);
	}

	
	public boolean isValid(Address addressData, String[] args) {
		address=addressData;
		return true;
	}

}
