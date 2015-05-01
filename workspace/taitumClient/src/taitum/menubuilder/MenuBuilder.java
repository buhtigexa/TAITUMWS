package taitum.menubuilder;
import taitum.buildoptions.Condition;
import taitum.buildoptions.Set;
import taitum.client.Taitum;


public abstract  class MenuBuilder {

	protected Menu menu;
	protected Condition condition;
	protected Taitum taitum;
	public MenuBuilder(Taitum taitum,Set compositeSet,int index,String type){
		
		this.taitum=taitum;
		condition=getCondition(index);
	
		menu=new Menu(taitum,type,condition,compositeSet);
	}

	protected abstract Condition getCondition(int index);
	
	public boolean action(ws.taitum.schemas.Address addressData,String[] args,ws.taitum.schemas.Ad ad,ws.taitum.schemas.AdType adType){
		return menu.make(addressData, args, ad, adType);
	}

	
}
