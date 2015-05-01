package ws.statistics.core.keys;

public class SimpleKey extends Key{

	public int value_x;

	public SimpleKey(int x){
		this.value_x=x;
	}
	
	@Override
	public int hashCode(){	

		return (int)value_x*31;
	}

	@Override
	public boolean equals(Object o){
		if (o==null) return false;
		if (!(o instanceof SimpleKey)  )return false;
		if (((SimpleKey)o).value_x!=this.value_x)return false;
		return true;
	}
	
	@Override
	public int get() {return this.value_x;
	}
	@Override
	public String toString(){
		return " " + value_x;
	}
	
}
