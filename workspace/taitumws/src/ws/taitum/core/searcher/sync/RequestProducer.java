package ws.taitum.core.searcher.sync;

import java.util.List;

import ws.email.schemas.Email;
import ws.taitum.core.wsclients.EmailClient;

public class RequestProducer extends Producer{

	public RequestProducer (EmailClient emailClient){
		super(emailClient);
	}

	protected void buildData(){
	
		ads=searcher.search(table.db.getOffers(), notifiable);
		if (ads.getAd()==null){
			return;
		}

		String contents=new String("");
		
		for (int i=0;i<ads.getAd().length;i++ ){
			ws.taitum.schemas.Ad ad=ads.getAd()[i];
				contents+="\n " + ad.getAddress().getState() + "," + ad.getAddress().getCity() +"," + ad.getAddress().getStreet() + "," + ad.getAddress().getHigh() + " Comunicate con :" + ad.getContact();
		}
				ws.email.schemas.Email email=new Email();
				email.setBody(contents);
				List<String> recipient= email.getRecipient();
				recipient.add(notifiable.data.getContact());
				emailSys.sendEmail(email);

	}	


}