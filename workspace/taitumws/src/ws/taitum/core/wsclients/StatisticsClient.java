package ws.taitum.core.wsclients;

import java.util.List;

import ws.statistics.definitions.IndicatorValue;
import ws.statistics.definitions.SpaceNumber;
import ws.statistics.definitions.Statisticsws;
import ws.statistics.definitions.Statisticsws_Service;

public class StatisticsClient {

	protected Statisticsws_Service stub;
	protected Statisticsws service;
	
	public StatisticsClient(){
		
		stub=new Statisticsws_Service();
		service=stub.getStatisticsws();
	}
	
	public void add(int space,int value){
		
		service.addSample(value,space);

	}
	
	public int createSpace(String experimentDescription){
		return service.createSpace(experimentDescription);
	}
	
	
	public float calculateAverage(int space){
		
		ws.statistics.definitions.SpaceNumber spaceId=new SpaceNumber();
		ws.statistics.definitions.IndicatorValue indicatorValue=new IndicatorValue();
		spaceId.setSpaceId(space);
		indicatorValue=service.calculateAverage(spaceId);
		return indicatorValue.getIndicatorValue();
		
	}
	
	public float calculateDeviation(int space){
		
		ws.statistics.definitions.SpaceNumber spaceId=new SpaceNumber();
		ws.statistics.definitions.IndicatorValue indicatorValue=new IndicatorValue();
		spaceId.setSpaceId(space);
		indicatorValue=service.calculateDeviation(spaceId);
		return indicatorValue.getIndicatorValue();
		
	}
	
	public List<ws.statistics.schemas.Event> calculateDistributuion(int space){

		ws.statistics.definitions.SpaceNumber spaceId=new SpaceNumber();
		spaceId.setSpaceId(space);
		ws.statistics.definitions.DistributionResult distribution;
		distribution=service.calculateDistribution(spaceId);
		return (distribution.getProbabilityDistribution()).getEvent();
		
	}

}
