package ws.taitum.core.wsclients;

import java.io.IOException;
import java.util.List;

import ws.email.definitions.Emailws;
import ws.email.definitions.Emailws_Service;

public class EmailClient {

	protected static int Max=3;
	protected Emailws_Service stub;
	protected Emailws emailSystem;
	
	public EmailClient() {
		
			stub=new Emailws_Service();
			emailSystem=stub.getEmailws();
	}
	
	public boolean sendEmail(ws.email.schemas.Email email){
		boolean success=true;
		try{
			email.setIsSent(false);
			email.setSubject("Esta propiedad te puede interesar");
			emailSystem.sendEmail(email);
			
		}
		catch(Exception  e){
			success=false;
		}
		return success;
	}
	
	public List<ws.email.schemas.Email> retrieveEmails(ws.email.schemas.Criteria filter){
		
		ws.email.schemas.Emails relevants=emailSystem.getEmails(filter);
		List<ws.email.schemas.Email> emails= relevants.getEmail();
		return emails;
	}
	
	

}
