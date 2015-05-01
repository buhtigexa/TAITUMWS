package taitum.buildoptions;

import ws.taitum.schemas.Ad;

public class SetDistance extends SetSimple{

	public SetDistance(int index) {
		super(index);
	}

	@Override
	public void set(Ad ad, String[] args) throws NumberFormatException{
		ad.setSquareDistance(Integer.parseInt(args[index]));
	}

}
