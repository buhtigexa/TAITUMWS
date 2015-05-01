
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package ws.statistics.definitions;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://statistics.ws/definitions".equals(namespaceURI) &&
                  "sample".equals(typeName)){
                   
                            return  ws.statistics.definitions.Sample.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/definitions".equals(namespaceURI) &&
                  "spaceDescription".equals(typeName)){
                   
                            return  ws.statistics.definitions.SpaceDescription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/definitions".equals(namespaceURI) &&
                  "spaceNumber".equals(typeName)){
                   
                            return  ws.statistics.definitions.SpaceNumber.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/definitions".equals(namespaceURI) &&
                  "indicatorValue".equals(typeName)){
                   
                            return  ws.statistics.definitions.IndicatorValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/schemas".equals(namespaceURI) &&
                  "Distribution".equals(typeName)){
                   
                            return  ws.statistics.schemas.Distribution.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/schemas".equals(namespaceURI) &&
                  "Event".equals(typeName)){
                   
                            return  ws.statistics.schemas.Event.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.ws/definitions".equals(namespaceURI) &&
                  "distributionResult".equals(typeName)){
                   
                            return  ws.statistics.definitions.DistributionResult.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    