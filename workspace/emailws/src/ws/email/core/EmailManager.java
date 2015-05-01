package ws.email.core;

import java.util.Properties;
import java.util.Vector;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import ws.email.schemas.Email;
import ws.email.schemas.Emails;


@SuppressWarnings("serial")
public class EmailManager extends Vector<ws.email.schemas.Email>{
	boolean success=true;
	protected  String user;
    protected  String pass;
    protected java.util.Hashtable<String,ws.email.core.filters.EmailFilter > filters;
    
   
	public EmailManager(String username,String password){
	
		super();
		user=username;
		pass=password;
		filters=new java.util.Hashtable<String,ws.email.core.filters.EmailFilter>();
		setUp();
	}
	
	public boolean sendMails(){
		success=true;
		for (int m=0;m < this.size();m++){
			ws.email.schemas.Email  email=get(m);
			if (!email.getIsSent() ){
				success=sendMail(email);
				}
		}
		return success;
	}
	
	
	protected  boolean sendMail(ws.email.schemas.Email  email){
		 
		success=true;
	
	    this.add(email);
	    
	    Properties props = System.getProperties();
	    String host = "smtp.gmail.com";
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.user", user);
	    props.put("mail.smtp.password", pass);
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.auth", "true");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);
    	
	    try {

    	   	message.setFrom(new InternetAddress(user));
           String[] addresses=email.getRecipient();
    	   	InternetAddress[] toAddress = new InternetAddress[addresses.length];
           
            for (int i=0;i<toAddress.length;i++){
            		String eaddr=addresses[i];
            		toAddress[i]=new InternetAddress(eaddr);
            }
           
            for (int i=0;i<toAddress.length;i++){
            	 message.addRecipient(Message.RecipientType.TO, toAddress[i]);
             }
           
            message.setSubject(email.getSubject());
	        message.setText(email.getBody());
	        Transport transport = session.getTransport("smtp");
	        transport.connect(host, user, pass);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	        catch (Exception  e) {
	            success=false;
	        }
	
	return success;
	}


	public ws.email.schemas.Emails getMails(ws.email.schemas.Criteria criteria) //throws ws.core.emailsystem.InvalidInputException{
	{
		
		ws.email.schemas.Emails emails=new Emails();
		ws.email.schemas.Email email=new Email();
		String metadata=criteria.getMetadata();
		ws.email.core.filters.EmailFilter filter;
	
		if (filters.containsKey(metadata)){
			filter=filters.get(metadata);
			filter.target=criteria.getExpectedValue();
			for (int ipending=0; ipending< this.size();ipending++ ){
					email=get(ipending);
					if (filter.accept(get(ipending))){
						emails.addEmail(email);	
					}
			}
				return emails;
		}
		return emails;
	}			
		
		
	protected void setUp(){
		
		
		filters.put("subject", new ws.email.core.filters.EmailFilterBySubject());
		filters.put("body",new ws.email.core.filters.EmailFilterByBody());
		
	}
	
}
