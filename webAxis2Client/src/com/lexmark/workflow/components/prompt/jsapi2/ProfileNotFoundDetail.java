
package com.lexmark.workflow.components.prompt.jsapi2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profileNotFoundDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileNotFoundDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientIP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileNotFoundDetail", propOrder = {
    "profileName",
    "clientIP"
})
public class ProfileNotFoundDetail {

    protected int profileName;
    protected int clientIP;

    /**
     * Gets the value of the profileName property.
     * 
     */
    public int getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     */
    public void setProfileName(int value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the clientIP property.
     * 
     */
    public int getClientIP() {
        return clientIP;
    }

    /**
     * Sets the value of the clientIP property.
     * 
     */
    public void setClientIP(int value) {
        this.clientIP = value;
    }

}
