package taitum.buildoptions;

import ws.taitum.schemas.Ad;

public class SetContact extends SetSimple{

	public SetContact(int index) {
		super(index);
	}

	@Override
	public void set(Ad ad, String[] args) throws NumberFormatException {
		
		ad.setContact(args[index]);	
	}

}
