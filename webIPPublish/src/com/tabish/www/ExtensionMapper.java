
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.tabish.www;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "add1".equals(typeName)){
                   
                            return  com.tabish.www.Add1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "add".equals(typeName)){
                   
                            return  com.tabish.www.Add.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "helloOutput".equals(typeName)){
                   
                            return  com.tabish.www.HelloOutput.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "helloInput".equals(typeName)){
                   
                            return  com.tabish.www.HelloInput.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "add1Response".equals(typeName)){
                   
                            return  com.tabish.www.Add1Response.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.tabish.com".equals(namespaceURI) &&
                  "addResponse".equals(typeName)){
                   
                            return  com.tabish.www.AddResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    