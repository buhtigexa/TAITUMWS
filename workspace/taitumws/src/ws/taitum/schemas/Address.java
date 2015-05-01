
/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package ws.taitum.schemas;
            

            /**
            *  Address bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Address
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = address
                Namespace URI = http://taitum.ws/schemas
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Street
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStreet =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString("General Pinto");
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreet(){
                               return localStreet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Street
                               */
                               public void setStreet(java.lang.String param){
                            
                                            this.localStreet=param;
                                    

                               }
                            

                        /**
                        * field for City
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCity =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Tandil");
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCity(){
                               return localCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param City
                               */
                               public void setCity(java.lang.String param){
                            
                                            this.localCity=param;
                                    

                               }
                            

                        /**
                        * field for State
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localState =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Buenos Aires");
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(java.lang.String param){
                            
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for Country
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCountry =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString("Argentina");
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCountry(){
                               return localCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Country
                               */
                               public void setCountry(java.lang.String param){
                            
                                            this.localCountry=param;
                                    

                               }
                            

                        /**
                        * field for High
                        * This was an Attribute!
                        */

                        
                                    protected int localHigh =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("399");
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getHigh(){
                               return localHigh;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param High
                               */
                               public void setHigh(int param){
                            
                                            this.localHigh=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://taitum.ws/schemas");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":address",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "address",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localStreet != null){
                                        
                                                writeAttribute("",
                                                         "street",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreet), xmlWriter);

                                            
                                      }
                                    
                                            if (localCity != null){
                                        
                                                writeAttribute("",
                                                         "city",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCity), xmlWriter);

                                            
                                      }
                                    
                                            if (localState != null){
                                        
                                                writeAttribute("",
                                                         "state",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState), xmlWriter);

                                            
                                      }
                                    
                                            if (localCountry != null){
                                        
                                                writeAttribute("",
                                                         "country",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountry), xmlWriter);

                                            
                                      }
                                    
                                                   if (localHigh!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "high",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHigh), xmlWriter);

                                            
                                      }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://taitum.ws/schemas")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            attribList.add(
                            new javax.xml.namespace.QName("","street"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreet));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","city"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","state"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","country"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountry));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","high"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHigh));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Address parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Address object =
                new Address();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"address".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Address)ws.taitum.definitions.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "street"
                    java.lang.String tempAttribStreet =
                        
                                reader.getAttributeValue(null,"street");
                            
                   if (tempAttribStreet!=null){
                         java.lang.String content = tempAttribStreet;
                        
                                                 object.setStreet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStreet));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("street");
                    
                    // handle attribute "city"
                    java.lang.String tempAttribCity =
                        
                                reader.getAttributeValue(null,"city");
                            
                   if (tempAttribCity!=null){
                         java.lang.String content = tempAttribCity;
                        
                                                 object.setCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("city");
                    
                    // handle attribute "state"
                    java.lang.String tempAttribState =
                        
                                reader.getAttributeValue(null,"state");
                            
                   if (tempAttribState!=null){
                         java.lang.String content = tempAttribState;
                        
                                                 object.setState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribState));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("state");
                    
                    // handle attribute "country"
                    java.lang.String tempAttribCountry =
                        
                                reader.getAttributeValue(null,"country");
                            
                   if (tempAttribCountry!=null){
                         java.lang.String content = tempAttribCountry;
                        
                                                 object.setCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCountry));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("country");
                    
                    // handle attribute "high"
                    java.lang.String tempAttribHigh =
                        
                                reader.getAttributeValue(null,"high");
                            
                   if (tempAttribHigh!=null){
                         java.lang.String content = tempAttribHigh;
                        
                                                 object.setHigh(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribHigh));
                                            
                    } else {
                       
                                           object.setHigh(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("high");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    