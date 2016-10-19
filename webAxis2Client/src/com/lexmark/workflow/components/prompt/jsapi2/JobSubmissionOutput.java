
package com.lexmark.workflow.components.prompt.jsapi2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobSubmissionOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobSubmissionOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soapMap" type="{http://jsapi2.prompt.components.workflow.lexmark.com/}soapMap"/>
 *         &lt;element name="taskInfo" type="{http://jsapi2.prompt.components.workflow.lexmark.com/}taskInfo"/>
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
@XmlType(name = "jobSubmissionOutput", propOrder = {
    "soapMap",
    "taskInfo",
    "attachments"
})
public class JobSubmissionOutput {

    @XmlElement(required = true)
    protected SoapMap soapMap;
    @XmlElement(required = true)
    protected TaskInfo taskInfo;
    protected List<Attachment> attachments;

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
     * Gets the value of the taskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfo }
     *     
     */
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    /**
     * Sets the value of the taskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfo }
     *     
     */
    public void setTaskInfo(TaskInfo value) {
        this.taskInfo = value;
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
