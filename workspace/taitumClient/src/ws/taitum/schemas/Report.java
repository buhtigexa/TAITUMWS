
package ws.taitum.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A statistical report about all ads that matches a criteria.
 * 
 * <p>Java class for report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="events" type="{http://taitum.ws/schemas}eventDescription" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="average" type="{http://www.w3.org/2001/XMLSchema}float" default="0" />
 *       &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}float" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report", propOrder = {
    "events"
})
public class Report {

    @XmlElement(required = true)
    protected List<EventDescription> events;
    @XmlAttribute(name = "average")
    protected Float average;
    @XmlAttribute(name = "variance")
    protected Float variance;

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDescription }
     * 
     * 
     */
    public List<EventDescription> getEvents() {
        if (events == null) {
            events = new ArrayList<EventDescription>();
        }
        return this.events;
    }

    /**
     * Gets the value of the average property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getAverage() {
        if (average == null) {
            return  0.0F;
        } else {
            return average;
        }
    }

    /**
     * Sets the value of the average property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverage(Float value) {
        this.average = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getVariance() {
        if (variance == null) {
            return  0.0F;
        } else {
            return variance;
        }
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVariance(Float value) {
        this.variance = value;
    }

}
