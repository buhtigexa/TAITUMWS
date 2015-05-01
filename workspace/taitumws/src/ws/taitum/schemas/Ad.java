
/**
 * Ad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package ws.taitum.schemas;
            

            /**
            *  Ad bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Ad
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ad
                Namespace URI = http://taitum.ws/schemas
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected ws.taitum.schemas.Address localAddress ;
                                

                           /**
                           * Auto generated getter method
                           * @return ws.taitum.schemas.Address
                           */
                           public  ws.taitum.schemas.Address getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(ws.taitum.schemas.Address param){
                            
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for Contact
                        */

                        
                                    protected java.lang.String localContact ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getContact(){
                               return localContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Contact
                               */
                               public void setContact(java.lang.String param){
                            
                                            this.localContact=param;
                                    

                               }
                            

                        /**
                        * field for Price
                        * This was an Attribute!
                        */

                        
                                    protected int localPrice =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("0");
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPrice(){
                               return localPrice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Price
                               */
                               public void setPrice(int param){
                            
                                            this.localPrice=param;
                                    

                               }
                            

                        /**
                        * field for PriceVariance
                        * This was an Attribute!
                        */

                        
                                    protected int localPriceVariance =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("100");
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPriceVariance(){
                               return localPriceVariance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PriceVariance
                               */
                               public void setPriceVariance(int param){
                            
                                            this.localPriceVariance=param;
                                    

                               }
                            

                        /**
                        * field for SquareDistance
                        * This was an Attribute!
                        */

                        
                                    protected int localSquareDistance =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("10");
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSquareDistance(){
                               return localSquareDistance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SquareDistance
                               */
                               public void setSquareDistance(int param){
                            
                                            this.localSquareDistance=param;
                                    

                               }
                            

                        /**
                        * field for Rooms
                        * This was an Attribute!
                        */

                        
                                    protected int localRooms =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("3");
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRooms(){
                               return localRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rooms
                               */
                               public void setRooms(int param){
                            
                                            this.localRooms=param;
                                    

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
                           namespacePrefix+":ad",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ad",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localPrice!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "price",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice), xmlWriter);

                                            
                                      }
                                    
                                                   if (localPriceVariance!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "priceVariance",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriceVariance), xmlWriter);

                                            
                                      }
                                    
                                                   if (localSquareDistance!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "squareDistance",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSquareDistance), xmlWriter);

                                            
                                      }
                                    
                                                   if (localRooms!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "rooms",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRooms), xmlWriter);

                                            
                                      }
                                    
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://taitum.ws/schemas","address"),
                                               xmlWriter);
                                        
                                    namespace = "http://taitum.ws/schemas";
                                    writeStartElement(null, namespace, "contact", xmlWriter);
                             

                                          if (localContact==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("contact cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localContact);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
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

                
                            elementList.add(new javax.xml.namespace.QName("http://taitum.ws/schemas",
                                                                      "address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://taitum.ws/schemas",
                                                                      "contact"));
                                 
                                        if (localContact != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContact));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("contact cannot be null!!");
                                        }
                                    
                            attribList.add(
                            new javax.xml.namespace.QName("","price"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","priceVariance"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriceVariance));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","squareDistance"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSquareDistance));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rooms"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRooms));
                                

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
        public static Ad parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Ad object =
                new Ad();

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
                    
                            if (!"ad".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Ad)ws.taitum.definitions.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "price"
                    java.lang.String tempAttribPrice =
                        
                                reader.getAttributeValue(null,"price");
                            
                   if (tempAttribPrice!=null){
                         java.lang.String content = tempAttribPrice;
                        
                                                 object.setPrice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribPrice));
                                            
                    } else {
                       
                                           object.setPrice(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("price");
                    
                    // handle attribute "priceVariance"
                    java.lang.String tempAttribPriceVariance =
                        
                                reader.getAttributeValue(null,"priceVariance");
                            
                   if (tempAttribPriceVariance!=null){
                         java.lang.String content = tempAttribPriceVariance;
                        
                                                 object.setPriceVariance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribPriceVariance));
                                            
                    } else {
                       
                                           object.setPriceVariance(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("priceVariance");
                    
                    // handle attribute "squareDistance"
                    java.lang.String tempAttribSquareDistance =
                        
                                reader.getAttributeValue(null,"squareDistance");
                            
                   if (tempAttribSquareDistance!=null){
                         java.lang.String content = tempAttribSquareDistance;
                        
                                                 object.setSquareDistance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribSquareDistance));
                                            
                    } else {
                       
                                           object.setSquareDistance(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("squareDistance");
                    
                    // handle attribute "rooms"
                    java.lang.String tempAttribRooms =
                        
                                reader.getAttributeValue(null,"rooms");
                            
                   if (tempAttribRooms!=null){
                         java.lang.String content = tempAttribRooms;
                        
                                                 object.setRooms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribRooms));
                                            
                    } else {
                       
                                           object.setRooms(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("rooms");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://taitum.ws/schemas","address").equals(reader.getName())){
                                
                                                object.setAddress(ws.taitum.schemas.Address.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://taitum.ws/schemas","contact").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"contact" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setContact(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    