package ws.taitum.core;

import ws.taitum.core.data.DataBase;
import ws.taitum.core.data.Table;
import ws.taitum.core.factory.FactoryMethod;
import ws.taitum.core.searcher.Listener;
import ws.taitum.core.searcher.Searcher;
import ws.taitum.core.searcher.sync.OfferProducer;
import ws.taitum.core.searcher.sync.Producer;
import ws.taitum.core.searcher.sync.RequestProducer;
import ws.taitum.core.wsclients.EmailClient;
import ws.taitum.schemas.Ad;

public class TaitumManager {

	protected static Table offers;
	protected static Table requests;
	protected static DataBase db;
	protected static Reporter reporter=null;
	protected static EmailClient emailSys=null;
	
	
	protected Producer offerProducer,requestProducer;
	protected Listener offerListener,requestListener;
	protected static java.util.Hashtable<String,FactoryMethod> factoryMethods;
		
	public TaitumManager(){
		
		
		emailSys=new EmailClient();
		reporter=new Reporter();
		
		factoryMethods=new java.util.Hashtable<String,FactoryMethod>();
		factoryMethods.put("address",new ws.taitum.core.factory.ByAddress());
		factoryMethods.put("distance",new ws.taitum.core.factory.ByDistance());
		factoryMethods.put("price",new ws.taitum.core.factory.ByPrice());
		factoryMethods.put("offer",new ws.taitum.core.factory.ByFilter());
	
		offerProducer=new OfferProducer(emailSys);
		requestProducer=new RequestProducer(emailSys);
		offerListener=new Listener(offerProducer);
		requestListener=new Listener(requestProducer);
		
		offers=new Table();
		requests=new Table();
		offers.addObserver(offerListener);
		requests.addObserver(requestListener);
		db=new DataBase(offers, requests);
		
		populate();
		
		offers.setBroadcast(true);
		requests.setBroadcast(true);
	}	
	
	
	protected void populate(){
		
		// Uploads sale ads.
		int maxPrice;
		int distancesSquare;
		ws.taitum.schemas.Address address=null;
		ws.taitum.schemas.Ad ad=null;
		// Offer1
		maxPrice=3000;
		distancesSquare=0;
		address=new ws.taitum.schemas.Address();
		address.setCountry("Argentina");
		address.setState("Buenos Aires");
		address.setCity("Tandil");
		address.setStreet("11 de Septiembre");
		address.setHigh(943);
		ad = new Ad();
		ad.setContact("bangalore@infosys.iit.in");
		ad.setPrice(maxPrice);
		ad.setSquareDistance(distancesSquare);
		ad.setAddress(address);
		ad.setRooms(4);
		publish(ad, "offer");
		// Offer2
		maxPrice=4000;
		distancesSquare=0;
		address=new ws.taitum.schemas.Address();
		address.setCountry("Argentina");
		address.setState("Buenos Aires");
		address.setCity("Tandil");
		address.setStreet("Constitucion");
		address.setHigh(400);
		ad=new Ad();
		ad.setContact("arduino@acmicpc.fpga.no");
		ad.setPrice(maxPrice);
		ad.setSquareDistance(distancesSquare);;
		ad.setAddress(address);
		ad.setRooms(6);
		publish(ad, "offer");		
		// Offer3
		maxPrice=5000;
		distancesSquare=0;
		address=new ws.taitum.schemas.Address();
		address.setCountry("Argentina");
		address.setState("Buenos Aires");
		address.setCity("Mar del Plata");
		address.setStreet("Cordoba");
		address.setHigh(1300);
		ad=new Ad();
		ad.setContact("invap@acmicpc.ru");
		ad.setPrice(maxPrice);
		ad.setSquareDistance(distancesSquare);
		ad.setAddress(address);
		ad.setRooms(2);
		publish(ad, "offer");
		
		// Offer 4
		maxPrice=6000;
		distancesSquare=0;
		address=new ws.taitum.schemas.Address();
		address.setCountry("Argentina");
		address.setState("Buenos Aires");
		address.setCity("Tandil");
		address.setStreet("General Pinto");
		address.setHigh(399);
		ad=new Ad();
		ad.setContact("trancemusic@invap.ieee.in");
		ad.setPrice(maxPrice);
		ad.setSquareDistance(distancesSquare);
		ad.setAddress(address);
		ad.setRooms(5);
		publish(ad, "offer");
		
		
		}
	
	public boolean searchBy(String term){
		if (factoryMethods.containsKey(term)){
			return true;
		}
		return false;
	}

	public ws.taitum.schemas.Ads getOffers() {

		ws.taitum.schemas.Ads data =db.getOffers().getData();
		return data;
		
	}
	public ws.taitum.schemas.Ads search(ws.taitum.schemas.Ad ad,String field){
	
		ws.taitum.schemas.Ads data;
		FactoryMethod factory=factoryMethods.get(field);
		ws.taitum.core.publish.data.Publication publication=factory.create(ad);
		Searcher searcher=new Searcher();
		data =searcher.search(db.getOffers(),publication);
		return data;

	}
	public void publish(ws.taitum.schemas.Ad ad,String type){
		
		ws.taitum.core.factory.FactoryMethod factory=factoryMethods.get(type);
		ws.taitum.core.publish.data.Publication publication=factory.create(ad);
		publication.db=TaitumManager.db;
		publication.save();
		}
	
	protected ws.taitum.schemas.Ads getRequest(){

		ws.taitum.schemas.Ads data=(db.getRequest()).getData();
		return data;
		
	}
	
	
	public ws.taitum.schemas.Report getReport(ws.taitum.schemas.Ad ad,String field){
		
	
		ws.taitum.schemas.Ads ads;
		ads=search(ad, field);
		
		if (ads.getAd()==null){
			ads=db.getOffers().getData();
		}
		ws.taitum.schemas.Report report= reporter.getReport(ads);
		
		return report;
	}

	protected void showPubications(ws.taitum.schemas.Ads dataSet){

		ws.taitum.schemas.Ads ads=dataSet;
		
		for (int i=0;i<ads.getAd().length;i++){
			ws.taitum.schemas.Ad ad=ads.getAd()[i];
			System.out.println("Calle :" + ad.getAddress().getStreet() + ",  Altura :" +  ad.getAddress().getHigh()   +   ", Contacto " +  ad.getContact());
		}
			
		
	}
	
	
	
	
		
}
