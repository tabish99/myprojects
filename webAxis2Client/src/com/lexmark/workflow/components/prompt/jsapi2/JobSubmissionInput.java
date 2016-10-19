
package com.lexmark.workflow.components.prompt.jsapi2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobSubmissionInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobSubmissionInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soapMap" type="{http://jsapi2.prompt.components.workflow.lexmark.com/}soapMap"/>
 *         &lt;element name="attachments" type="{http://jsapi2.prompt.components.workflow.lexmark.com/}attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobSubmissionInput", propOrder = {
    "profileName",
    "authId",
    "soapMap",
    "attachments"
})
public class JobSubmissionInput {

    @XmlElement(required = true)
    protected String profileName;
    @XmlElement(required = true)
    protected String authId;
    @XmlElement(required = true)
    protected SoapMap soapMap;
    protected List<Attachment> attachments;

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the authId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * Sets the value of the authId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthId(String value) {
        this.authId = value;
    }

    /**
     * Gets the value of the soapMap property.
     * 
     * @return
     *     possible object is
     *     {@link SoapMap }
     *     
     */
    public SoapMap getSoapMap() {
        return soapMap;
    }

    /**
     * Sets the value of the soapMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapMap }
     *     
     */
    public void setSoapMap(SoapMap value) {
        this.soapMap = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

}
