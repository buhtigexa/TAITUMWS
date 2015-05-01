
package ws.statistics.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ws.statistics.schemas.Distribution;


/**
 * <p>Java class for distributionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distributionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="probabilityDistribution" type="{http://statistics.ws/schemas}Distribution"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distributionResult", propOrder = {
    "probabilityDistribution"
})
public class DistributionResult {

    @XmlElement(required = true)
    protected Distribution probabilityDistribution;

    /**
     * Gets the value of the probabilityDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link Distribution }
     *     
     */
    public Distribution getProbabilityDistribution() {
        return probabilityDistribution;
    }

    /**
     * Sets the value of the probabilityDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribution }
     *     
     */
    public void setProbabilityDistribution(Distribution value) {
        this.probabilityDistribution = value;
    }

}
