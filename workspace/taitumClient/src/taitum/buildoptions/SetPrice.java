package taitum.buildoptions;

import ws.taitum.schemas.Ad;

public class SetPrice extends SetSimple{

	public SetPrice(int index) {
		super(index);
	
	}

	@Override
	public void set(Ad ad, String[] args) throws NumberFormatException {
		ad.setPrice(Integer.parseInt(args[index]));
	}
	

}
