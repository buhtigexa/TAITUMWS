
/**
 * GeocoderwsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package ws.geocoder.definitions;

        /**
        *  GeocoderwsMessageReceiverInOut message receiver
        */

        public class GeocoderwsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GeocoderwsSkeletonInterface skel = (GeocoderwsSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAddress".equals(methodName)){
                
                ws.geocoder.definitions.GetAddressResponse getAddressResponse7 = null;
	                        ws.geocoder.definitions.GetAddress wrappedParam =
                                                             (ws.geocoder.definitions.GetAddress)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.geocoder.definitions.GetAddress.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAddressResponse7 =
                                                   
                                                   
                                                         skel.getAddress(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAddressResponse7, false, new javax.xml.namespace.QName("http://geocoder.ws/definitions",
                                                    "getAddress"));
                                    } else 

            if("getDistance".equals(methodName)){
                
                ws.geocoder.definitions.GetDistanceResponse getDistanceResponse9 = null;
	                        ws.geocoder.definitions.GetDistance wrappedParam =
                                                             (ws.geocoder.definitions.GetDistance)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.geocoder.definitions.GetDistance.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDistanceResponse9 =
                                                   
                                                   
                                                         skel.getDistance(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDistanceResponse9, false, new javax.xml.namespace.QName("http://geocoder.ws/definitions",
                                                    "getDistance"));
                                    } else 

            if("getCoordinate".equals(methodName)){
                
                ws.geocoder.definitions.GetCoordinateResponse getCoordinateResponse11 = null;
	                        ws.geocoder.definitions.GetCoordinate wrappedParam =
                                                             (ws.geocoder.definitions.GetCoordinate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.geocoder.definitions.GetCoordinate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCoordinateResponse11 =
                                                   
                                                   
                                                         skel.getCoordinate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCoordinateResponse11, false, new javax.xml.namespace.QName("http://geocoder.ws/definitions",
                                                    "getCoordinate"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetAddress param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetAddress.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetAddressResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetAddressResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetDistance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetDistance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetDistanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetDistanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetCoordinate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetCoordinate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.geocoder.definitions.GetCoordinateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.geocoder.definitions.GetCoordinateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.geocoder.definitions.GetAddressResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.geocoder.definitions.GetAddressResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.geocoder.definitions.GetAddressResponse wrapgetAddress(){
                                ws.geocoder.definitions.GetAddressResponse wrappedElement = new ws.geocoder.definitions.GetAddressResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.geocoder.definitions.GetDistanceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.geocoder.definitions.GetDistanceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.geocoder.definitions.GetDistanceResponse wrapgetDistance(){
                                ws.geocoder.definitions.GetDistanceResponse wrappedElement = new ws.geocoder.definitions.GetDistanceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.geocoder.definitions.GetCoordinateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.geocoder.definitions.GetCoordinateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.geocoder.definitions.GetCoordinateResponse wrapgetCoordinate(){
                                ws.geocoder.definitions.GetCoordinateResponse wrappedElement = new ws.geocoder.definitions.GetCoordinateResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (ws.geocoder.definitions.GetAddress.class.equals(type)){
                
                           return ws.geocoder.definitions.GetAddress.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.geocoder.definitions.GetAddressResponse.class.equals(type)){
                
                           return ws.geocoder.definitions.GetAddressResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.geocoder.definitions.GetDistance.class.equals(type)){
                
                           return ws.geocoder.definitions.GetDistance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.geocoder.definitions.GetDistanceResponse.class.equals(type)){
                
                           return ws.geocoder.definitions.GetDistanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.geocoder.definitions.GetCoordinate.class.equals(type)){
                
                           return ws.geocoder.definitions.GetCoordinate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.geocoder.definitions.GetCoordinateResponse.class.equals(type)){
                
                           return ws.geocoder.definitions.GetCoordinateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    