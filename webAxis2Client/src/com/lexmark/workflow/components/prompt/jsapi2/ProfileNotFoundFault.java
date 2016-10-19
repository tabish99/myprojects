
package com.lexmark.workflow.components.prompt.jsapi2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ProfileNotFoundFault", targetNamespace = "http://jsapi2.prompt.components.workflow.lexmark.com/")
public class ProfileNotFoundFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ProfileNotFoundDetail faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ProfileNotFoundFault(String message, ProfileNotFoundDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ProfileNotFoundFault(String message, ProfileNotFoundDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundDetail
     */
    public ProfileNotFoundDetail getFaultInfo() {
        return faultInfo;
    }

}
