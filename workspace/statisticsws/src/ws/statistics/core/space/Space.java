package ws.statistics.core.space;
import ws.statistics.core.indicators.ProbabilityDistribution;



public abstract class Space{

	
	public ProbabilityDistribution distr;
	int N=0;
		
	public ProbabilityDistribution getProbabilityDistribution() {
		
		distr=new ProbabilityDistribution();
		for (int i=0;i< N ;i++){ addToDistribution(i);}
		return distr;
	}
	
	

	
	public abstract Space apply();
	public abstract  int getSize();
	protected abstract void addToDistribution(int Integer_index);
	public void addToSpace(Integer integer){N++;}

	@Override
	public abstract String toString();
		
	
}
