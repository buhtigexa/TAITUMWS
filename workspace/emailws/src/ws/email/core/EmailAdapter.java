package ws.email.core;

import ws.email.definitions.EmailwsSkeletonInterface;
import ws.email.definitions.GetEmails;
import ws.email.definitions.GetEmailsResponse;
import ws.email.definitions.SendEmail;
import ws.email.definitions.SendEmailResponse;



public class EmailAdapter implements EmailwsSkeletonInterface {

	protected static EmailManager em;
	
	public EmailAdapter(){
		em=new EmailManager("taitumws@gmail.com", "tpfinalcos2013");
	
	}

	@Override
	public GetEmailsResponse getEmails(GetEmails getEmails) {
	
		ws.email.schemas.Criteria criteria=  getEmails.getFilter();
		ws.email.schemas.Emails emails= em.getMails(criteria);
		GetEmailsResponse response=new GetEmailsResponse();
		response.setRelevants(emails);
		return response;
	
	}

	@Override
	public SendEmailResponse sendEmail(SendEmail sendEmail) {
	
		ws.email.schemas.Email email= sendEmail.getData();
		boolean isSent=em.sendMail(email);
		SendEmailResponse response=new SendEmailResponse();
		response.setIsSent(isSent);
		return response;
	}
	
	

	

}
