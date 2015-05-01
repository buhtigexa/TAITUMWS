package taitum.menubuilder;
import taitum.buildoptions.Condition;
import taitum.buildoptions.Set;
import taitum.buildoptions.TrueCondition;
import taitum.client.Taitum;


public class TMenuBuiler extends MenuBuilder{

	

	public TMenuBuiler(Taitum taitum, Set compositeSet, int index, String type) {
		super(taitum, compositeSet, index, type);
	}

	@Override
	protected Condition getCondition(int index) {
		return new TrueCondition(this.taitum, index);
	}

}
