package ws.taitum.core.searcher.sync;

import java.util.List;

import ws.email.schemas.Email;
import ws.taitum.core.wsclients.EmailClient;

public class OfferProducer extends Producer{
	
	public OfferProducer(EmailClient emailClient){
		super(emailClient);

	}
	
	protected void buildData(){
		
	
		ads=searcher.search(table.db.getRequest(), notifiable);
		if (ads.getAd()==null){
			return;
		}
		
		ws.email.schemas.Email email;
		String msg=new String("");
	
		int n=ads.getAd().length;
		for (int i=0;i<n;i++ ){
			
			msg+="\n " + notifiable.data.getAddress().getState() + "," + notifiable.data.getAddress().getCity() +"," + notifiable.data.getAddress().getStreet() + "," + notifiable.data.getAddress().getHigh() + " Comunicate con :" + notifiable.data.getContact();
			
			email=new Email();
			email.setBody(msg);
			ws.taitum.schemas.Ad ad=ads.getAd()[i];
			List<String> recipient= email.getRecipient();
			recipient.add(ad.getContact());
			emailSys.sendEmail(email);
		}

	}


}
