
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.lexmark.workflow.components.prompt.jsapi2;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "soapMap".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.SoapMap.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "attachment".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.Attachment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "jobSubmissionOutput".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionOutput.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "taskInfo".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.TaskInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "profileNotFoundDetail".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundDetail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "jobSubmissionInput".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionInput.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://jsapi2.prompt.components.workflow.lexmark.com/".equals(namespaceURI) &&
                  "nameValue".equals(typeName)){
                   
                            return  com.lexmark.workflow.components.prompt.jsapi2.NameValue.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    