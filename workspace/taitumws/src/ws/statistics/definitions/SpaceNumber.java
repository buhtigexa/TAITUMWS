
package ws.statistics.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spaceNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spaceNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spaceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spaceNumber", propOrder = {
    "spaceId"
})
public class SpaceNumber {

    protected int spaceId;

    /**
     * Gets the value of the spaceId property.
     * 
     */
    public int getSpaceId() {
        return spaceId;
    }

    /**
     * Sets the value of the spaceId property.
     * 
     */
    public void setSpaceId(int value) {
        this.spaceId = value;
    }

}
