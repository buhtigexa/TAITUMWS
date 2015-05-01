package ws.statistics.core.randomvar;


public class CmpRandomVar extends RandomVar{
	
	public static Integer Minor=-1;
	public static Integer Equal=0;
	public static Integer Greater=-1;
	public Integer condition=Equal;

	
	public Integer target;

	
	public CmpRandomVar(Integer target,Integer condition){
		this.target=target;
		this.condition=condition;
	}
	
	@Override
	public boolean accept(Integer s) {
		return (s.compareTo(target) == condition); 
	}

}
