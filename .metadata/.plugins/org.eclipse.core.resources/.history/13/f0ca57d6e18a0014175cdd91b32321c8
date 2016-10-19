/**
 * JobSubmissionOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public class JobSubmissionOutput  implements java.io.Serializable {
    private com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap;

    private com.lexmark.workflow.components.prompt.jsapi2.TaskInfo taskInfo;

    private com.lexmark.workflow.components.prompt.jsapi2.Attachment[] attachments;

    public JobSubmissionOutput() {
    }

    public JobSubmissionOutput(
           com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap,
           com.lexmark.workflow.components.prompt.jsapi2.TaskInfo taskInfo,
           com.lexmark.workflow.components.prompt.jsapi2.Attachment[] attachments) {
           this.soapMap = soapMap;
           this.taskInfo = taskInfo;
           this.attachments = attachments;
    }


    /**
     * Gets the soapMap value for this JobSubmissionOutput.
     * 
     * @return soapMap
     */
    public com.lexmark.workflow.components.prompt.jsapi2.NameValue[] getSoapMap() {
        return soapMap;
    }


    /**
     * Sets the soapMap value for this JobSubmissionOutput.
     * 
     * @param soapMap
     */
    public void setSoapMap(com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap) {
        this.soapMap = soapMap;
    }


    /**
     * Gets the taskInfo value for this JobSubmissionOutput.
     * 
     * @return taskInfo
     */
    public com.lexmark.workflow.components.prompt.jsapi2.TaskInfo getTaskInfo() {
        return taskInfo;
    }


    /**
     * Sets the taskInfo value for this JobSubmissionOutput.
     * 
     * @param taskInfo
     */
    public void setTaskInfo(com.lexmark.workflow.components.prompt.jsapi2.TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }


    /**
     * Gets the attachments value for this JobSubmissionOutput.
     * 
     * @return attachments
     */
    public com.lexmark.workflow.components.prompt.jsapi2.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this JobSubmissionOutput.
     * 
     * @param attachments
     */
    public void setAttachments(com.lexmark.workflow.components.prompt.jsapi2.Attachment[] attachments) {
        this.attachments = attachments;
    }

    public com.lexmark.workflow.components.prompt.jsapi2.Attachment getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.lexmark.workflow.components.prompt.jsapi2.Attachment _value) {
        this.attachments[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSubmissionOutput)) return false;
        JobSubmissionOutput other = (JobSubmissionOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soapMap==null && other.getSoapMap()==null) || 
             (this.soapMap!=null &&
              java.util.Arrays.equals(this.soapMap, other.getSoapMap()))) &&
            ((this.taskInfo==null && other.getTaskInfo()==null) || 
             (this.taskInfo!=null &&
              this.taskInfo.equals(other.getTaskInfo()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSoapMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoapMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoapMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskInfo() != null) {
            _hashCode += getTaskInfo().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobSubmissionOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "jobSubmissionOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "soapMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "nameValue"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "nameValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "taskInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "taskInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
