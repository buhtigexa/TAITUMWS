
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package ws.geocoder.definitions;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://geocoder.ws/schemas".equals(namespaceURI) &&
                  "address".equals(typeName)){
                   
                            return  ws.geocoder.schemas.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geocoder.ws/schemas".equals(namespaceURI) &&
                  "coordinate".equals(typeName)){
                   
                            return  ws.geocoder.schemas.Coordinate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://geocoder.ws/schemas".equals(namespaceURI) &&
                  "distance".equals(typeName)){
                   
                            return  ws.geocoder.schemas.Distance.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    