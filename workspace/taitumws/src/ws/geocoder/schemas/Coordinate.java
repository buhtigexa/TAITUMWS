
package ws.geocoder.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographical coordinates: latitude, longitude.
 * 
 * 
 * <p>Java class for coordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" default="-38.020933" />
 *       &lt;attribute name="longtitude" type="{http://www.w3.org/2001/XMLSchema}double" default="-57.560017" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinate")
public class Coordinate {

    @XmlAttribute(name = "latitude")
    protected Double latitude;
    @XmlAttribute(name = "longtitude")
    protected Double longtitude;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getLatitude() {
        if (latitude == null) {
            return -38.020933D;
        } else {
            return latitude;
        }
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longtitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getLongtitude() {
        if (longtitude == null) {
            return -57.560017D;
        } else {
            return longtitude;
        }
    }

    /**
     * Sets the value of the longtitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongtitude(Double value) {
        this.longtitude = value;
    }

}
