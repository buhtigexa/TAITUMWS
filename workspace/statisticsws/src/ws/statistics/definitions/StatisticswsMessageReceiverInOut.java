
/**
 * StatisticswsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package ws.statistics.definitions;

        /**
        *  StatisticswsMessageReceiverInOut message receiver
        */

        public class StatisticswsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        StatisticswsSkeletonInterface skel = (StatisticswsSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("calculateDistribution".equals(methodName)){
                
                ws.statistics.definitions.CalculateDistributionResponse calculateDistributionResponse11 = null;
	                        ws.statistics.definitions.GetDistribution wrappedParam =
                                                             (ws.statistics.definitions.GetDistribution)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.statistics.definitions.GetDistribution.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculateDistributionResponse11 =
                                                   
                                                   
                                                         skel.calculateDistribution(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculateDistributionResponse11, false, new javax.xml.namespace.QName("http://statistics.ws/definitions",
                                                    "calculateDistribution"));
                                    } else 

            if("calculateDeviation".equals(methodName)){
                
                ws.statistics.definitions.IndicatorResponse indicatorResponse13 = null;
	                        ws.statistics.definitions.GetDeviation wrappedParam =
                                                             (ws.statistics.definitions.GetDeviation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.statistics.definitions.GetDeviation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               indicatorResponse13 =
                                                   
                                                   
                                                         skel.calculateDeviation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), indicatorResponse13, false, new javax.xml.namespace.QName("http://statistics.ws/definitions",
                                                    "calculateDeviation"));
                                    } else 

            if("calculateAverage".equals(methodName)){
                
                ws.statistics.definitions.IndicatorResponse indicatorResponse15 = null;
	                        ws.statistics.definitions.GetAverage wrappedParam =
                                                             (ws.statistics.definitions.GetAverage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.statistics.definitions.GetAverage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               indicatorResponse15 =
                                                   
                                                   
                                                         skel.calculateAverage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), indicatorResponse15, false, new javax.xml.namespace.QName("http://statistics.ws/definitions",
                                                    "calculateAverage"));
                                    } else 

            if("createSpace".equals(methodName)){
                
                ws.statistics.definitions.CreateSpaceResponse createSpaceResponse17 = null;
	                        ws.statistics.definitions.CreateSpace wrappedParam =
                                                             (ws.statistics.definitions.CreateSpace)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    ws.statistics.definitions.CreateSpace.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createSpaceResponse17 =
                                                   
                                                   
                                                         skel.createSpace(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createSpaceResponse17, false, new javax.xml.namespace.QName("http://statistics.ws/definitions",
                                                    "createSpace"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.GetDistribution param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.GetDistribution.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.CalculateDistributionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.CalculateDistributionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.GetDeviation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.GetDeviation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.IndicatorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.IndicatorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.GetAverage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.GetAverage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.CreateSpace param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.CreateSpace.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.CreateSpaceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.CreateSpaceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ws.statistics.definitions.AddSample param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ws.statistics.definitions.AddSample.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.statistics.definitions.CalculateDistributionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.statistics.definitions.CalculateDistributionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.statistics.definitions.CalculateDistributionResponse wrapcalculateDistribution(){
                                ws.statistics.definitions.CalculateDistributionResponse wrappedElement = new ws.statistics.definitions.CalculateDistributionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.statistics.definitions.IndicatorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.statistics.definitions.IndicatorResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.statistics.definitions.IndicatorResponse wrapcalculateDeviation(){
                                ws.statistics.definitions.IndicatorResponse wrappedElement = new ws.statistics.definitions.IndicatorResponse();
                                return wrappedElement;
                         }
                    
                         private ws.statistics.definitions.IndicatorResponse wrapcalculateAverage(){
                                ws.statistics.definitions.IndicatorResponse wrappedElement = new ws.statistics.definitions.IndicatorResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ws.statistics.definitions.CreateSpaceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ws.statistics.definitions.CreateSpaceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ws.statistics.definitions.CreateSpaceResponse wrapcreateSpace(){
                                ws.statistics.definitions.CreateSpaceResponse wrappedElement = new ws.statistics.definitions.CreateSpaceResponse();
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
        
                if (ws.statistics.definitions.GetDistribution.class.equals(type)){
                
                           return ws.statistics.definitions.GetDistribution.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.CalculateDistributionResponse.class.equals(type)){
                
                           return ws.statistics.definitions.CalculateDistributionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.GetDeviation.class.equals(type)){
                
                           return ws.statistics.definitions.GetDeviation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.IndicatorResponse.class.equals(type)){
                
                           return ws.statistics.definitions.IndicatorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.GetAverage.class.equals(type)){
                
                           return ws.statistics.definitions.GetAverage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.IndicatorResponse.class.equals(type)){
                
                           return ws.statistics.definitions.IndicatorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.CreateSpace.class.equals(type)){
                
                           return ws.statistics.definitions.CreateSpace.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.CreateSpaceResponse.class.equals(type)){
                
                           return ws.statistics.definitions.CreateSpaceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ws.statistics.definitions.AddSample.class.equals(type)){
                
                           return ws.statistics.definitions.AddSample.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    