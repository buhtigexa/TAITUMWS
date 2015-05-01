package ws.taitum.core;

import ws.taitum.definitions.GetAds;
import ws.taitum.definitions.GetAdsResponse;
import ws.taitum.definitions.GetReport;
import ws.taitum.definitions.GetReportResponse;
import ws.taitum.definitions.Publish;
import ws.taitum.definitions.Search;
import ws.taitum.definitions.SearchResponse;
import ws.taitum.definitions.TaitumwsSkeletonInterface;
import ws.taitum.definitions.UnssuportedFilter;


public class TaitumAdapter implements TaitumwsSkeletonInterface{

	protected static TaitumManager tm;
	
	public TaitumAdapter(){
		
		tm=new TaitumManager();
		
	}

	@Override
	public GetAdsResponse getAds(GetAds getAds) {
	
		GetAdsResponse response=new GetAdsResponse();
		ws.taitum.schemas.Ads ads= tm.getOffers();	
		response.setAds(ads);
		return response;
	
	}


	@Override
	public SearchResponse search(Search search) throws UnssuportedFilter {
		
		SearchResponse response=new SearchResponse();
		ws.taitum.schemas.Ads ads=new ws.taitum.schemas.Ads();
		String term=search.getAdType().getType().getValue();
		if (!tm.searchBy(term)){
			throw new UnssuportedFilter("El criterio de busqueda o categoria de publicación no está implementado aún");
		}
		ads=tm.search(search.getAd(),term);
		response.setAds(ads);
		return response;
	
	}

	
	@Override
	public void publish(Publish publish) {
		
		String term=publish.getAdType().getType().getValue();
		
		if (tm.searchBy(term)){
			tm.publish(publish.getAd(), term);
		}
	}

	
	@Override
	public GetReportResponse getReport(GetReport getReport)	throws UnssuportedFilter {

		GetReportResponse response=new GetReportResponse();
		ws.taitum.schemas.Report report;
		String term=getReport.getAdType().getType().getValue();
		if ((term.length()>=1)&& (!tm.searchBy(term))){
			throw new UnssuportedFilter("El criterio de busqueda o categoria de publicación no está implementado aún");
		}
		report=tm.getReport(getReport.getAd(),term);
		response.setReport(report);
		return response;

	}
}


	
	


	
	

	
	


