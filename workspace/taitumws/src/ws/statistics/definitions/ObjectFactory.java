
package ws.statistics.definitions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.statistics.definitions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAverage_QNAME = new QName("http://statistics.ws/definitions", "getAverage");
    private final static QName _GetDeviation_QNAME = new QName("http://statistics.ws/definitions", "getDeviation");
    private final static QName _GetDistribution_QNAME = new QName("http://statistics.ws/definitions", "getDistribution");
    private final static QName _CalculateDistributionResponse_QNAME = new QName("http://statistics.ws/definitions", "calculateDistributionResponse");
    private final static QName _CreateSpace_QNAME = new QName("http://statistics.ws/definitions", "createSpace");
    private final static QName _AddSample_QNAME = new QName("http://statistics.ws/definitions", "addSample");
    private final static QName _CreateSpaceResponse_QNAME = new QName("http://statistics.ws/definitions", "createSpaceResponse");
    private final static QName _IndicatorResponse_QNAME = new QName("http://statistics.ws/definitions", "indicatorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.statistics.definitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpaceNumber }
     * 
     */
    public SpaceNumber createSpaceNumber() {
        return new SpaceNumber();
    }

    /**
     * Create an instance of {@link Sample }
     * 
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link IndicatorValue }
     * 
     */
    public IndicatorValue createIndicatorValue() {
        return new IndicatorValue();
    }

    /**
     * Create an instance of {@link SpaceDescription }
     * 
     */
    public SpaceDescription createSpaceDescription() {
        return new SpaceDescription();
    }

    /**
     * Create an instance of {@link DistributionResult }
     * 
     */
    public DistributionResult createDistributionResult() {
        return new DistributionResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "getAverage")
    public JAXBElement<SpaceNumber> createGetAverage(SpaceNumber value) {
        return new JAXBElement<SpaceNumber>(_GetAverage_QNAME, SpaceNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "getDeviation")
    public JAXBElement<SpaceNumber> createGetDeviation(SpaceNumber value) {
        return new JAXBElement<SpaceNumber>(_GetDeviation_QNAME, SpaceNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "getDistribution")
    public JAXBElement<SpaceNumber> createGetDistribution(SpaceNumber value) {
        return new JAXBElement<SpaceNumber>(_GetDistribution_QNAME, SpaceNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "calculateDistributionResponse")
    public JAXBElement<DistributionResult> createCalculateDistributionResponse(DistributionResult value) {
        return new JAXBElement<DistributionResult>(_CalculateDistributionResponse_QNAME, DistributionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "createSpace")
    public JAXBElement<SpaceDescription> createCreateSpace(SpaceDescription value) {
        return new JAXBElement<SpaceDescription>(_CreateSpace_QNAME, SpaceDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sample }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "addSample")
    public JAXBElement<Sample> createAddSample(Sample value) {
        return new JAXBElement<Sample>(_AddSample_QNAME, Sample.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpaceNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "createSpaceResponse")
    public JAXBElement<SpaceNumber> createCreateSpaceResponse(SpaceNumber value) {
        return new JAXBElement<SpaceNumber>(_CreateSpaceResponse_QNAME, SpaceNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statistics.ws/definitions", name = "indicatorResponse")
    public JAXBElement<IndicatorValue> createIndicatorResponse(IndicatorValue value) {
        return new JAXBElement<IndicatorValue>(_IndicatorResponse_QNAME, IndicatorValue.class, null, value);
    }

}
