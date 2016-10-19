/**
 * HelloOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tabish.www;

public class HelloOutput  implements java.io.Serializable {
    private java.lang.Boolean b_out;

    private java.lang.Float f_out;

    private int i_out;

    private java.lang.Long l1_out;

    private java.lang.Long l_out;

    private java.lang.String str2_out;

    private java.lang.String str_out;

    public HelloOutput() {
    }

    public HelloOutput(
           java.lang.Boolean b_out,
           java.lang.Float f_out,
           int i_out,
           java.lang.Long l1_out,
           java.lang.Long l_out,
           java.lang.String str2_out,
           java.lang.String str_out) {
           this.b_out = b_out;
           this.f_out = f_out;
           this.i_out = i_out;
           this.l1_out = l1_out;
           this.l_out = l_out;
           this.str2_out = str2_out;
           this.str_out = str_out;
    }


    /**
     * Gets the b_out value for this HelloOutput.
     * 
     * @return b_out
     */
    public java.lang.Boolean getB_out() {
        return b_out;
    }


    /**
     * Sets the b_out value for this HelloOutput.
     * 
     * @param b_out
     */
    public void setB_out(java.lang.Boolean b_out) {
        this.b_out = b_out;
    }


    /**
     * Gets the f_out value for this HelloOutput.
     * 
     * @return f_out
     */
    public java.lang.Float getF_out() {
        return f_out;
    }


    /**
     * Sets the f_out value for this HelloOutput.
     * 
     * @param f_out
     */
    public void setF_out(java.lang.Float f_out) {
        this.f_out = f_out;
    }


    /**
     * Gets the i_out value for this HelloOutput.
     * 
     * @return i_out
     */
    public int getI_out() {
        return i_out;
    }


    /**
     * Sets the i_out value for this HelloOutput.
     * 
     * @param i_out
     */
    public void setI_out(int i_out) {
        this.i_out = i_out;
    }


    /**
     * Gets the l1_out value for this HelloOutput.
     * 
     * @return l1_out
     */
    public java.lang.Long getL1_out() {
        return l1_out;
    }


    /**
     * Sets the l1_out value for this HelloOutput.
     * 
     * @param l1_out
     */
    public void setL1_out(java.lang.Long l1_out) {
        this.l1_out = l1_out;
    }


    /**
     * Gets the l_out value for this HelloOutput.
     * 
     * @return l_out
     */
    public java.lang.Long getL_out() {
        return l_out;
    }


    /**
     * Sets the l_out value for this HelloOutput.
     * 
     * @param l_out
     */
    public void setL_out(java.lang.Long l_out) {
        this.l_out = l_out;
    }


    /**
     * Gets the str2_out value for this HelloOutput.
     * 
     * @return str2_out
     */
    public java.lang.String getStr2_out() {
        return str2_out;
    }


    /**
     * Sets the str2_out value for this HelloOutput.
     * 
     * @param str2_out
     */
    public void setStr2_out(java.lang.String str2_out) {
        this.str2_out = str2_out;
    }


    /**
     * Gets the str_out value for this HelloOutput.
     * 
     * @return str_out
     */
    public java.lang.String getStr_out() {
        return str_out;
    }


    /**
     * Sets the str_out value for this HelloOutput.
     * 
     * @param str_out
     */
    public void setStr_out(java.lang.String str_out) {
        this.str_out = str_out;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HelloOutput)) return false;
        HelloOutput other = (HelloOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.b_out==null && other.getB_out()==null) || 
             (this.b_out!=null &&
              this.b_out.equals(other.getB_out()))) &&
            ((this.f_out==null && other.getF_out()==null) || 
             (this.f_out!=null &&
              this.f_out.equals(other.getF_out()))) &&
            this.i_out == other.getI_out() &&
            ((this.l1_out==null && other.getL1_out()==null) || 
             (this.l1_out!=null &&
              this.l1_out.equals(other.getL1_out()))) &&
            ((this.l_out==null && other.getL_out()==null) || 
             (this.l_out!=null &&
              this.l_out.equals(other.getL_out()))) &&
            ((this.str2_out==null && other.getStr2_out()==null) || 
             (this.str2_out!=null &&
              this.str2_out.equals(other.getStr2_out()))) &&
            ((this.str_out==null && other.getStr_out()==null) || 
             (this.str_out!=null &&
              this.str_out.equals(other.getStr_out())));
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
        if (getB_out() != null) {
            _hashCode += getB_out().hashCode();
        }
        if (getF_out() != null) {
            _hashCode += getF_out().hashCode();
        }
        _hashCode += getI_out();
        if (getL1_out() != null) {
            _hashCode += getL1_out().hashCode();
        }
        if (getL_out() != null) {
            _hashCode += getL_out().hashCode();
        }
        if (getStr2_out() != null) {
            _hashCode += getStr2_out().hashCode();
        }
        if (getStr_out() != null) {
            _hashCode += getStr_out().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HelloOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tabish.com", "helloOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "b_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "i_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l1_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l1_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str2_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str2_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
