
package ws.email.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.email.schemas.Emails;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relevants" type="{http://email.ws/schemas}emails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relevants"
})
@XmlRootElement(name = "getEmailsResponse")
public class GetEmailsResponse {

    @XmlElement(required = true)
    protected Emails relevants;

    /**
     * Gets the value of the relevants property.
     * 
     * @return
     *     possible object is
     *     {@link Emails }
     *     
     */
    public Emails getRelevants() {
        return relevants;
    }

    /**
     * Sets the value of the relevants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Emails }
     *     
     */
    public void setRelevants(Emails value) {
        this.relevants = value;
    }

}
