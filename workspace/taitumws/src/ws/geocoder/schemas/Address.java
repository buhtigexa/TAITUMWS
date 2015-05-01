
package ws.geocoder.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A location address in format: street,high,city,state and country.
 * 
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" default="General Pinto" />
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" default="Tandil" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" default="Buenos Aires" />
 *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" default="Argentina" />
 *       &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}int" default="399" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address")
public class Address {

    @XmlAttribute(name = "street")
    protected String street;
    @XmlAttribute(name = "city")
    protected String city;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "high")
    protected Integer high;

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        if (street == null) {
            return "General Pinto";
        } else {
            return street;
        }
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        if (city == null) {
            return "Tandil";
        } else {
            return city;
        }
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        if (state == null) {
            return "Buenos Aires";
        } else {
            return state;
        }
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        if (country == null) {
            return "Argentina";
        } else {
            return country;
        }
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHigh() {
        if (high == null) {
            return  399;
        } else {
            return high;
        }
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHigh(Integer value) {
        this.high = value;
    }

}
