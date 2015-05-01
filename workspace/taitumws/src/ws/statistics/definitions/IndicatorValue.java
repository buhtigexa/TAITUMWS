
package ws.statistics.definitions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indicatorValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicatorValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicatorValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicatorValue", propOrder = {
    "indicatorValue"
})
public class IndicatorValue {

    protected float indicatorValue;

    /**
     * Gets the value of the indicatorValue property.
     * 
     */
    public float getIndicatorValue() {
        return indicatorValue;
    }

    /**
     * Sets the value of the indicatorValue property.
     * 
     */
    public void setIndicatorValue(float value) {
        this.indicatorValue = value;
    }

}
