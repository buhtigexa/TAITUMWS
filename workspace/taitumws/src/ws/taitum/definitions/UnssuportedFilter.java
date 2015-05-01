
/**
 * UnssuportedFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package ws.taitum.definitions;

public class UnssuportedFilter extends java.lang.Exception{

    private static final long serialVersionUID = 1393943182476L;
    
    private ws.taitum.definitions.TaitumException faultMessage;

    
        public UnssuportedFilter() {
            super("UnssuportedFilter");
        }

        public UnssuportedFilter(java.lang.String s) {
           super(s);
        }

        public UnssuportedFilter(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnssuportedFilter(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ws.taitum.definitions.TaitumException msg){
       faultMessage = msg;
    }
    
    public ws.taitum.definitions.TaitumException getFaultMessage(){
       return faultMessage;
    }
}
    