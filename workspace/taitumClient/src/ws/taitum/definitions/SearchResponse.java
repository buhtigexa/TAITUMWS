
package ws.taitum.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.taitum.schemas.Ads;


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
 *         &lt;element name="ads" type="{http://taitum.ws/schemas}ads" form="unqualified"/>
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
    "ads"
})
@XmlRootElement(name = "searchResponse")
public class SearchResponse {

    @XmlElement(required = true, nillable = true)
    protected Ads ads;

    /**
     * Gets the value of the ads property.
     * 
     * @return
     *     possible object is
     *     {@link Ads }
     *     
     */
    public Ads getAds() {
        return ads;
    }

    /**
     * Sets the value of the ads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ads }
     *     
     */
    public void setAds(Ads value) {
        this.ads = value;
    }

}
