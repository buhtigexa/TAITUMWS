package ws.taitum.core;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import ws.taitum.core.wsclients.StatisticsClient;
import ws.taitum.schemas.Ad;

public class Reporter {

	protected StatisticsClient statistics;
	
	public Reporter(){
		statistics=new StatisticsClient();
	}
	

	public ws.taitum.schemas.Report getReport(ws.taitum.schemas.Ads ads){
	
		ws.taitum.schemas.Report report;
		HashMap < Integer, String> map;
		int idpsace;

		report=new ws.taitum.schemas.Report();

		if (ads.getAd()==null){
			return report;
		}
		
		map=new HashMap<Integer,String>();
		idpsace=statistics.createSpace("");
	
		
		Ad[] dataSet=ads.getAd();
			for (int i=0; i < dataSet.length;i++){
				ws.taitum.schemas.Ad ad=dataSet[i];
				String str=ad.getAddress().getStreet() + ","  +  ad.getAddress().getHigh() +  "," +  ad.getAddress().getCity() + ". $:" + ad.getPrice();
				int value=toInt(str);
				map.put(value,str);
				statistics.add(idpsace, value);
					
			}
		List<ws.statistics.schemas.Event> distribution= statistics.calculateDistributuion(idpsace);
		ws.taitum.schemas.EventDescription eventDescription;
		for (ws.statistics.schemas.Event e:distribution){
			float probability=e.getProbability();
			int value=e.getValue();
			String str=map.get(value);
			eventDescription=new ws.taitum.schemas.EventDescription();
			eventDescription.setDescription(str);
			eventDescription.setProbability(probability);
			report.addEvents(eventDescription);
		}
		float average=statistics.calculateAverage(idpsace);
		float deviation=statistics.calculateDeviation(idpsace);
		report.setAverage(average);
		report.setVariance(deviation);
		return report;
	}
	
	
	protected int toInt(String str){
		
		 StringBuilder sb = new StringBuilder();
	    for (char c : str.toCharArray()){
	    	sb.append((int)c);
	    }
		 BigInteger mInt = new BigInteger(sb.toString());
		 int ascii=(mInt.intValue()%Byte.MAX_VALUE);
		 ascii=ascii<0?-ascii:ascii;
		 return ascii;
	}
	
}
