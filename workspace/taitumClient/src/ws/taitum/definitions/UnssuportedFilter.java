
package ws.taitum.definitions;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TaitumException", targetNamespace = "http://taitum.ws/definitions")
public class UnssuportedFilter
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private String faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnssuportedFilter(String message, String faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnssuportedFilter(String message, String faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: java.lang.String
     */
    public String getFaultInfo() {
        return faultInfo;
    }

}
