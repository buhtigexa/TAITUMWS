
package ws.geocoder.definitions;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.geocoder.definitions package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.geocoder.definitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDistance }
     * 
     */
    public GetDistance createGetDistance() {
        return new GetDistance();
    }

    /**
     * Create an instance of {@link GetCoordinateResponse }
     * 
     */
    public GetCoordinateResponse createGetCoordinateResponse() {
        return new GetCoordinateResponse();
    }

    /**
     * Create an instance of {@link GetAddressResponse }
     * 
     */
    public GetAddressResponse createGetAddressResponse() {
        return new GetAddressResponse();
    }

    /**
     * Create an instance of {@link GetCoordinate }
     * 
     */
    public GetCoordinate createGetCoordinate() {
        return new GetCoordinate();
    }

    /**
     * Create an instance of {@link GetDistanceResponse }
     * 
     */
    public GetDistanceResponse createGetDistanceResponse() {
        return new GetDistanceResponse();
    }

    /**
     * Create an instance of {@link GetAddress }
     * 
     */
    public GetAddress createGetAddress() {
        return new GetAddress();
    }

}
