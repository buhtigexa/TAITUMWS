
package ws.taitum.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     			Represents a home's publication to search or sale. It is
 *     			indicates the location address, price, responsible
 *     			contact addresses, etc..
 *     		
 * 
 * <p>Java class for ad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://taitum.ws/schemas}address"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="priceVariance" type="{http://www.w3.org/2001/XMLSchema}int" default="100" />
 *       &lt;attribute name="squareDistance" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
 *       &lt;attribute name="rooms" type="{http://www.w3.org/2001/XMLSchema}int" default="3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ad", propOrder = {
    "address",
    "contact"
})
public class Ad {

    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected String contact;
    @XmlAttribute(name = "price")
    protected Integer price;
    @XmlAttribute(name = "priceVariance")
    protected Integer priceVariance;
    @XmlAttribute(name = "squareDistance")
    protected Integer squareDistance;
    @XmlAttribute(name = "rooms")
    protected Integer rooms;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrice() {
        if (price == null) {
            return  0;
        } else {
            return price;
        }
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrice(Integer value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceVariance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPriceVariance() {
        if (priceVariance == null) {
            return  100;
        } else {
            return priceVariance;
        }
    }

    /**
     * Sets the value of the priceVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceVariance(Integer value) {
        this.priceVariance = value;
    }

    /**
     * Gets the value of the squareDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSquareDistance() {
        if (squareDistance == null) {
            return  10;
        } else {
            return squareDistance;
        }
    }

    /**
     * Sets the value of the squareDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSquareDistance(Integer value) {
        this.squareDistance = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRooms() {
        if (rooms == null) {
            return  3;
        } else {
            return rooms;
        }
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRooms(Integer value) {
        this.rooms = value;
    }

}
