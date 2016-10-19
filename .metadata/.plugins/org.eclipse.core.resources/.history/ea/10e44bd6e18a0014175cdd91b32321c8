/**
 * JobSubmissionInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public class JobSubmissionInput  implements java.io.Serializable {
    private java.lang.String profileName;

    private java.lang.String authId;

    private com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap;

    private com.lexmark.workflow.components.prompt.jsapi2.Attachment[] attachments;

    public JobSubmissionInput() {
    }

    public JobSubmissionInput(
           java.lang.String profileName,
           java.lang.String authId,
           com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap,
           com.lexmark.workflow.components.prompt.jsapi2.Attachment[] attachments) {
           this.profileName = profileName;
           this.authId = authId;
           this.soapMap = soapMap;
           this.attachments = attachments;
    }


    /**
     * Gets the profileName value for this JobSubmissionInput.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this JobSubmissionInput.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the authId value for this JobSubmissionInput.
     * 
     * @return authId
     */
    public java.lang.String getAuthId() {
        return authId;
    }


    /**
     * Sets the authId value for this JobSubmissionInput.
     * 
     * @param authId
     */
    public void setAuthId(java.lang.String authId) {
        this.authId = authId;
    }


    /**
     * Gets the soapMap value for this JobSubmissionInput.
     * 
     * @return soapMap
     */
    public com.lexmark.workflow.components.prompt.jsapi2.NameValue[] getSoapMap() {
        return soapMap;
    }


    /**
     * Sets the soapMap value for this JobSubmissionInput.
     * 
     * @param soapMap
     */
    public void setSoapMap(com.lexmark.workflow.components.prompt.jsapi2.NameValue[] soapMap) {
        this.soapMap = soapMap;
    }


    /**
     * Gets the attachments value for this JobSubmissionInput.
     * 
     * @return attachments
     */
    public com.lexmark.workflow.components.prompt.jsapi2.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this JobSubmissionInput.
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
        if (!(obj instanceof JobSubmissionInput)) return false;
        JobSubmissionInput other = (JobSubmissionInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.authId==null && other.getAuthId()==null) || 
             (this.authId!=null &&
              this.authId.equals(other.getAuthId()))) &&
            ((this.soapMap==null && other.getSoapMap()==null) || 
             (this.soapMap!=null &&
              java.util.Arrays.equals(this.soapMap, other.getSoapMap()))) &&
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
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getAuthId() != null) {
            _hashCode += getAuthId().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(JobSubmissionInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "jobSubmissionInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "authId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "soapMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "nameValue"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "nameValue"));
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
