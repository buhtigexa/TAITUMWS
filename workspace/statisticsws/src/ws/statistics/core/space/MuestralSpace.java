package ws.statistics.core.space;
import java.util.Vector;

import ws.statistics.core.keys.SimpleKey;
import ws.statistics.core.randomvar.NoRandomVar;
import ws.statistics.core.randomvar.RandomVar;


public class MuestralSpace extends Space{

	
	public  Vector<Integer> data;
	public RandomVar va;
	protected String id;
	
	public MuestralSpace (String id){
		this.id=id;
		data = new Vector<Integer>();
		va=new NoRandomVar();
	}

	public void addToSpace(Integer Integer) {
		super.addToSpace(Integer);
		data.add(Integer);
		
	}
	
	@Override
	public String toString() {
	
		String str=new String("");
		for (int s=0; s < data.size();s++){
			str+="\n " + data.get(s);
		}
		
		return str;
	}


	@Override
	public Space apply() {
		Space subSpace=new MuestralSpace(va.id);
		for (int s=0;s<data.size();s++){
			if (va.accept(data.get(s))){ subSpace.addToSpace(data.get(s));	}
		}
		return subSpace;

	}

	
	@Override
	protected void addToDistribution(int Integer_index) {
			distr.add( new SimpleKey( data.get(Integer_index) ));
	}

	@Override
	public int getSize() {
		return data.size();
	}

	
	

 }

