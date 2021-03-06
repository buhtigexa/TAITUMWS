
/**
 * TaitumwsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package ws.taitum.definitions;

        /**
        *  TaitumwsMessageReceiverInOut message receiver
        */

        public class TaitumwsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TaitumwsSkeletonInterface skel = (TaitumwsSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAds".equals(methodName)){
                
                ws.taitum.definitions.GetAdsResponse getAdsResponse8 = null;
	                        ws.taitum.definitions.GetAds wrappedParam =
                                                             (ws.taitum.definitions.GetAds)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.taitum.definitions.GetAds.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdsResponse8 =
                                                   
                                                   
                                                         skel.getAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdsResponse8, false, new javax.xml.namespace.QName("http://taitum.ws/definitions",
                                                    "getAds"));
                                    } else 

            if("search".equals(methodName)){
                
                ws.taitum.definitions.SearchResponse searchResponse10 = null;
	                        ws.taitum.definitions.Search wrappedParam =
                                                             (ws.taitum.definitions.Search)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.taitum.definitions.Search.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               searchResponse10 =
                                                   
                                                   
                                                         skel.search(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), searchResponse10, false, new javax.xml.namespace.QName("http://taitum.ws/definitions",
                                                    "search"));
                                    } else 

            if("getReport".equals(methodName)){
                
                ws.taitum.definitions.GetReportResponse getReportResponse12 = null;
	                        ws.taitum.definitions.GetReport wrappedParam =
                                                             (ws.taitum.definitions.GetReport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.taitum.definitions.GetReport.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getReportResponse12 =
                                                   
                                                   
                                                         skel.getReport(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getReportResponse12, false, new javax.xml.namespace.QName("http://taitum.ws/definitions",
                                                    "getReport"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (UnssuportedFilter e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"TaitumException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.GetAds param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.GetAds.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.GetAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.GetAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.Search param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.Search.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.SearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.SearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.TaitumException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.TaitumException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.Publish param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.Publish.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.GetReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.GetReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.taitum.definitions.GetReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.taitum.definitions.GetReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.taitum.definitions.GetAdsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.taitum.definitions.GetAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.taitum.definitions.GetAdsResponse wrapgetAds(){
                                ws.taitum.definitions.GetAdsResponse wrappedElement = new ws.taitum.definitions.GetAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.taitum.definitions.SearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.taitum.definitions.SearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.taitum.definitions.SearchResponse wrapsearch(){
                                ws.taitum.definitions.SearchResponse wrappedElement = new ws.taitum.definitions.SearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.taitum.definitions.GetReportResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.taitum.definitions.GetReportResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.taitum.definitions.GetReportResponse wrapgetReport(){
                                ws.taitum.definitions.GetReportResponse wrappedElement = new ws.taitum.definitions.GetReportResponse();
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
        
                if (ws.taitum.definitions.GetAds.class.equals(type)){
                
                           return ws.taitum.definitions.GetAds.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.GetAdsResponse.class.equals(type)){
                
                           return ws.taitum.definitions.GetAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.Search.class.equals(type)){
                
                           return ws.taitum.definitions.Search.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.SearchResponse.class.equals(type)){
                
                           return ws.taitum.definitions.SearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.TaitumException.class.equals(type)){
                
                           return ws.taitum.definitions.TaitumException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.Publish.class.equals(type)){
                
                           return ws.taitum.definitions.Publish.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.GetReport.class.equals(type)){
                
                           return ws.taitum.definitions.GetReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.GetReportResponse.class.equals(type)){
                
                           return ws.taitum.definitions.GetReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.taitum.definitions.TaitumException.class.equals(type)){
                
                           return ws.taitum.definitions.TaitumException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    