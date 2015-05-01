
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package ws.email.definitions;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://email.ws/schemas".equals(namespaceURI) &&
                  "email".equals(typeName)){
                   
                            return  ws.email.schemas.Email.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://email.ws/schemas".equals(namespaceURI) &&
                  "criteria".equals(typeName)){
                   
                            return  ws.email.schemas.Criteria.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://email.ws/schemas".equals(namespaceURI) &&
                  "emails".equals(typeName)){
                   
                            return  ws.email.schemas.Emails.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    