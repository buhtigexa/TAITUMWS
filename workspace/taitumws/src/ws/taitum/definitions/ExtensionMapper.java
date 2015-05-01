
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package ws.taitum.definitions;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "ad".equals(typeName)){
                   
                            return  ws.taitum.schemas.Ad.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "report".equals(typeName)){
                   
                            return  ws.taitum.schemas.Report.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "adType".equals(typeName)){
                   
                            return  ws.taitum.schemas.AdType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "ads".equals(typeName)){
                   
                            return  ws.taitum.schemas.Ads.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "type_type0".equals(typeName)){
                   
                            return  ws.taitum.schemas.Type_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "eventDescription".equals(typeName)){
                   
                            return  ws.taitum.schemas.EventDescription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://taitum.ws/schemas".equals(namespaceURI) &&
                  "address".equals(typeName)){
                   
                            return  ws.taitum.schemas.Address.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    