
package ws.email.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * .This data type is useful as a filter, for comparison against email's metadata.
 * 
 * <p>Java class for criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="metadata" type="{http://www.w3.org/2001/XMLSchema}string" default="subject" />
 *       &lt;attribute name="expectedValue" type="{http://www.w3.org/2001/XMLSchema}string" default="ieee" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criteria")
public class Criteria {

    @XmlAttribute(name = "metadata")
    protected String metadata;
    @XmlAttribute(name = "expectedValue")
    protected String expectedValue;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        if (metadata == null) {
            return "subject";
        } else {
            return metadata;
        }
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the expectedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedValue() {
        if (expectedValue == null) {
            return "ieee";
        } else {
            return expectedValue;
        }
    }

    /**
     * Sets the value of the expectedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedValue(String value) {
        this.expectedValue = value;
    }

}
