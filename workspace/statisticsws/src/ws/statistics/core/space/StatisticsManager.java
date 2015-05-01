package ws.statistics.core.space;
import java.util.Vector;

import ws.statistics.core.indicators.ProbabilityDistribution;
import ws.statistics.core.indicators.operations.NoOp;
import ws.statistics.core.indicators.operations.SquareOp;
import ws.statistics.core.indicators.operations.XMinus;


public class StatisticsManager {

	protected static Vector<MuestralSpace> spaces;
	
	public StatisticsManager(){
		spaces=new Vector<MuestralSpace>();
	}
	
	public int createMuestralSpace(String spaceDescription){
		
		spaces.add(new MuestralSpace(spaceDescription));
		int spaceCount=(spaces.size())-1;
		return spaceCount;
	}
	
	public void add(int spaceId,int value){
		
		if (spaceId<(spaces.size())){
			Space space=spaces.get(spaceId);
			space.addToSpace(value);
		}
		}
	
	public ws.statistics.schemas.Distribution getProbabilityDistribution(int spaceNumber){
		
		return ((calculateDistribution(spaceNumber)).cast());

	}
	
	public float getAverage(int spaceNumber){
	
		float average= (calculateDistribution(spaceNumber)).applyOperation(new NoOp());
		return average;
	
	}
	
	public float getDeviation(int spaceNumber){
		
		float average=getAverage(spaceNumber);
		float sqrdev= (calculateDistribution(spaceNumber)).applyOperation(new SquareOp(new XMinus(average)));
		return (float)Math.sqrt(sqrdev);
		
	}
	
	protected ws.statistics.core.indicators.ProbabilityDistribution calculateDistribution(int idSpace){
		
		
		ProbabilityDistribution pd=((spaces.get(idSpace)).apply()).getProbabilityDistribution();
		return pd;
	}
	
	
	
	
	
		
	
}

