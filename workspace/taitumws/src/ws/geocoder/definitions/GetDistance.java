
package ws.geocoder.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws.geocoder.schemas.Coordinate;


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
 *         &lt;element name="coordinateSrc" type="{http://geocoder.ws/schemas}coordinate" form="unqualified"/>
 *         &lt;element name="coordinateDst" type="{http://geocoder.ws/schemas}coordinate" form="unqualified"/>
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
    "coordinateSrc",
    "coordinateDst"
})
@XmlRootElement(name = "getDistance")
public class GetDistance {

    @XmlElement(required = true, nillable = true)
    protected Coordinate coordinateSrc;
    @XmlElement(required = true, nillable = true)
    protected Coordinate coordinateDst;

    /**
     * Gets the value of the coordinateSrc property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getCoordinateSrc() {
        return coordinateSrc;
    }

    /**
     * Sets the value of the coordinateSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setCoordinateSrc(Coordinate value) {
        this.coordinateSrc = value;
    }

    /**
     * Gets the value of the coordinateDst property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinate }
     *     
     */
    public Coordinate getCoordinateDst() {
        return coordinateDst;
    }

    /**
     * Sets the value of the coordinateDst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinate }
     *     
     */
    public void setCoordinateDst(Coordinate value) {
        this.coordinateDst = value;
    }

}
