
package ws.email.definitions;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ws.email.schemas.Criteria;
import ws.email.schemas.Email;
import ws.email.schemas.Emails;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "emailws", targetNamespace = "http://email.ws./definitions")
@XmlSeeAlso({
    ws.email.definitions.ObjectFactory.class,
    ws.email.schemas.ObjectFactory.class
})
public interface Emailws {


    /**
     * Send an email; issues the shipping status.
     * 
     * @param data
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://email.ws./definitions/sendEmail")
    @WebResult(name = "isSent", targetNamespace = "")
    @RequestWrapper(localName = "sendEmail", targetNamespace = "http://email.ws./definitions", className = "ws.email.definitions.SendEmail")
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "http://email.ws./definitions", className = "ws.email.definitions.SendEmailResponse")
    public boolean sendEmail(
        @WebParam(name = "data", targetNamespace = "")
        Email data);

    /**
     * Gets a list of emails that check certain values ​​over their metadata. 
     * 
     * @param filter
     * @return
     *     returns ws.email.schemas.Emails
     */
    @WebMethod(action = "http://email.ws./definitions/getEmails")
    @WebResult(name = "relevants", targetNamespace = "")
    @RequestWrapper(localName = "getEmails", targetNamespace = "http://email.ws./definitions", className = "ws.email.definitions.GetEmails")
    @ResponseWrapper(localName = "getEmailsResponse", targetNamespace = "http://email.ws./definitions", className = "ws.email.definitions.GetEmailsResponse")
    public Emails getEmails(
        @WebParam(name = "filter", targetNamespace = "")
        Criteria filter);

}
