/**
 * Helloservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tabish.www;

public interface Helloservice extends javax.xml.rpc.Service {
    public java.lang.String gethelloportAddress();

    public com.tabish.www.Hellomethod gethelloport() throws javax.xml.rpc.ServiceException;

    public com.tabish.www.Hellomethod gethelloport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
