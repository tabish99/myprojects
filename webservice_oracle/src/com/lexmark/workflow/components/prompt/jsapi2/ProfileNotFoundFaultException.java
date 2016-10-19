
/**
 * ProfileNotFoundFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public class ProfileNotFoundFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1419708328643L;
    
    private com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundFault faultMessage;

    
        public ProfileNotFoundFaultException() {
            super("ProfileNotFoundFaultException");
        }

        public ProfileNotFoundFaultException(java.lang.String s) {
           super(s);
        }

        public ProfileNotFoundFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProfileNotFoundFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundFault msg){
       faultMessage = msg;
    }
    
    public com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundFault getFaultMessage(){
       return faultMessage;
    }
}
    