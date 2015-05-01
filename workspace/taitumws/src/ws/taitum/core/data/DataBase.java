package ws.taitum.core.data;



public class DataBase {

	protected Table offers;
	protected Table requests;

	public DataBase(Table offers,Table requests){
		
		this.offers=offers;
		this.requests=requests;
		this.offers.db=this;
		this.requests.db=this;
	}


	public Table getOffers() {
		return offers;
	}


	public Table getRequest() {
		return requests;
	}




	
}

