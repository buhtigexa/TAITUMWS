package ws.statistics.core;

import ws.statistics.core.space.StatisticsManager;
import ws.statistics.definitions.AddSample;
import ws.statistics.definitions.CalculateDistributionResponse;
import ws.statistics.definitions.CreateSpace;
import ws.statistics.definitions.CreateSpaceResponse;
import ws.statistics.definitions.DistributionResult;
import ws.statistics.definitions.GetAverage;
import ws.statistics.definitions.GetDeviation;
import ws.statistics.definitions.GetDistribution;
import ws.statistics.definitions.IndicatorResponse;
import ws.statistics.definitions.IndicatorValue;
import ws.statistics.definitions.SpaceNumber;
import ws.statistics.definitions.StatisticswsSkeletonInterface;
import ws.statistics.schemas.Distribution;


public class StatisticsAdapter implements StatisticswsSkeletonInterface{

	protected static StatisticsManager sm=null;
	
	public StatisticsAdapter(){
		
		sm=new StatisticsManager();
		
	}
	


	
	@Override
	public void addSample(AddSample addSample) {
		
		ws.statistics.definitions.Sample sample=addSample.getAddSample();
		
		int spaceId=sample.getSpaceId();
		int value=sample.getValue();
		sm.add(spaceId,value);
	}

	
	@Override
	public CreateSpaceResponse createSpace(CreateSpace createSpace) {
	
	
		int n=sm.createMuestralSpace(createSpace.getCreateSpace().getDescription());
		CreateSpaceResponse response=new CreateSpaceResponse();
		SpaceNumber spaceNumber=new SpaceNumber();
		spaceNumber.setSpaceId(n);
		response.setCreateSpaceResponse(spaceNumber);
		return response;
	}

	@Override
	public IndicatorResponse calculateAverage(GetAverage getAverage) {
	
		
		float indicator=sm.getAverage(getAverage.getGetAverage().getSpaceId());
		return calculateIndicator(indicator);
		}
	


	@Override
	public CalculateDistributionResponse calculateDistribution(	GetDistribution getDistribution) {

		SpaceNumber spaceNumber= getDistribution.getGetDistribution();
		Distribution distribution= sm.getProbabilityDistribution(spaceNumber.getSpaceId());
		CalculateDistributionResponse response=new CalculateDistributionResponse();
		DistributionResult result=new DistributionResult();
		result.setProbabilityDistribution(distribution);
		response.setCalculateDistributionResponse(result);
		return response;
	}
	
	@Override
	public IndicatorResponse calculateDeviation(GetDeviation getDeviation) {
		
		float indicator=sm.getDeviation(getDeviation.getGetDeviation().getSpaceId());
		return calculateIndicator(indicator);
	}


	
	protected IndicatorResponse calculateIndicator (float indicator){

		IndicatorResponse response=new IndicatorResponse();
		IndicatorValue value=new IndicatorValue();
		value.setIndicatorValue(indicator);
		response.setIndicatorResponse(value);
		return response;
	}
	

	

}
