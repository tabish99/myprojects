/**
 * HelloInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tabish.www;

public class HelloInput  implements java.io.Serializable {
    private java.lang.Boolean b;

    private java.lang.Float f;

    private int i;

    private java.lang.Long l;

    private java.lang.Long l1;

    private java.lang.String str;

    private java.lang.String str2;

    public HelloInput() {
    }

    public HelloInput(
           java.lang.Boolean b,
           java.lang.Float f,
           int i,
           java.lang.Long l,
           java.lang.Long l1,
           java.lang.String str,
           java.lang.String str2) {
           this.b = b;
           this.f = f;
           this.i = i;
           this.l = l;
           this.l1 = l1;
           this.str = str;
           this.str2 = str2;
    }


    /**
     * Gets the b value for this HelloInput.
     * 
     * @return b
     */
    public java.lang.Boolean getB() {
        return b;
    }


    /**
     * Sets the b value for this HelloInput.
     * 
     * @param b
     */
    public void setB(java.lang.Boolean b) {
        this.b = b;
    }


    /**
     * Gets the f value for this HelloInput.
     * 
     * @return f
     */
    public java.lang.Float getF() {
        return f;
    }


    /**
     * Sets the f value for this HelloInput.
     * 
     * @param f
     */
    public void setF(java.lang.Float f) {
        this.f = f;
    }


    /**
     * Gets the i value for this HelloInput.
     * 
     * @return i
     */
    public int getI() {
        return i;
    }


    /**
     * Sets the i value for this HelloInput.
     * 
     * @param i
     */
    public void setI(int i) {
        this.i = i;
    }


    /**
     * Gets the l value for this HelloInput.
     * 
     * @return l
     */
    public java.lang.Long getL() {
        return l;
    }


    /**
     * Sets the l value for this HelloInput.
     * 
     * @param l
     */
    public void setL(java.lang.Long l) {
        this.l = l;
    }


    /**
     * Gets the l1 value for this HelloInput.
     * 
     * @return l1
     */
    public java.lang.Long getL1() {
        return l1;
    }


    /**
     * Sets the l1 value for this HelloInput.
     * 
     * @param l1
     */
    public void setL1(java.lang.Long l1) {
        this.l1 = l1;
    }


    /**
     * Gets the str value for this HelloInput.
     * 
     * @return str
     */
    public java.lang.String getStr() {
        return str;
    }


    /**
     * Sets the str value for this HelloInput.
     * 
     * @param str
     */
    public void setStr(java.lang.String str) {
        this.str = str;
    }


    /**
     * Gets the str2 value for this HelloInput.
     * 
     * @return str2
     */
    public java.lang.String getStr2() {
        return str2;
    }


    /**
     * Sets the str2 value for this HelloInput.
     * 
     * @param str2
     */
    public void setStr2(java.lang.String str2) {
        this.str2 = str2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HelloInput)) return false;
        HelloInput other = (HelloInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.b==null && other.getB()==null) || 
             (this.b!=null &&
              this.b.equals(other.getB()))) &&
            ((this.f==null && other.getF()==null) || 
             (this.f!=null &&
              this.f.equals(other.getF()))) &&
            this.i == other.getI() &&
            ((this.l==null && other.getL()==null) || 
             (this.l!=null &&
              this.l.equals(other.getL()))) &&
            ((this.l1==null && other.getL1()==null) || 
             (this.l1!=null &&
              this.l1.equals(other.getL1()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.str2==null && other.getStr2()==null) || 
             (this.str2!=null &&
              this.str2.equals(other.getStr2())));
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
        if (getB() != null) {
            _hashCode += getB().hashCode();
        }
        if (getF() != null) {
            _hashCode += getF().hashCode();
        }
        _hashCode += getI();
        if (getL() != null) {
            _hashCode += getL().hashCode();
        }
        if (getL1() != null) {
            _hashCode += getL1().hashCode();
        }
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getStr2() != null) {
            _hashCode += getStr2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HelloInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tabish.com", "helloInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b");
        elemField.setXmlName(new javax.xml.namespace.QName("", "b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i");
        elemField.setXmlName(new javax.xml.namespace.QName("", "i"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str2"));
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
