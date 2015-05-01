package taitum.menubuilder;
import taitum.buildoptions.Condition;
import taitum.buildoptions.ParseCondition;
import taitum.buildoptions.Set;
import taitum.client.Taitum;


public  class PMenuBuilder extends MenuBuilder{

	
	public PMenuBuilder(Taitum taitum, Set compositeSet, int index, String type) {
		super(taitum, compositeSet, index, type);
	
	}

	@Override
	protected Condition getCondition(int index) {
		return new ParseCondition(this.taitum,index);
	}

}
