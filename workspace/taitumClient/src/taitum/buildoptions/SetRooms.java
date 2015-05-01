package taitum.buildoptions;

import ws.taitum.schemas.Ad;

public class SetRooms extends SetSimple{

	public SetRooms(int index) {
		super(index);
	
	}

	@Override
	public void set(Ad ad, String[] args) throws NumberFormatException {
		ad.setRooms(Integer.parseInt(args[index]));
	}
	

}