/**
 * HelloserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tabish.www;

public class HelloserviceLocator extends org.apache.axis.client.Service implements com.tabish.www.Helloservice {

    public HelloserviceLocator() {
    }


    public HelloserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for helloport
    private java.lang.String helloport_address = "http://localhost:7001//Webservice_bottomup_service_first/helloservice";

    public java.lang.String gethelloportAddress() {
        return helloport_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String helloportWSDDServiceName = "helloport";

    public java.lang.String gethelloportWSDDServiceName() {
        return helloportWSDDServiceName;
    }

    public void sethelloportWSDDServiceName(java.lang.String name) {
        helloportWSDDServiceName = name;
    }

    public com.tabish.www.Hellomethod gethelloport() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(helloport_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gethelloport(endpoint);
    }

    public com.tabish.www.Hellomethod gethelloport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tabish.www.HelloportBindingStub _stub = new com.tabish.www.HelloportBindingStub(portAddress, this);
            _stub.setPortName(gethelloportWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void sethelloportEndpointAddress(java.lang.String address) {
        helloport_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.tabish.www.Hellomethod.class.isAssignableFrom(serviceEndpointInterface)) {
                com.tabish.www.HelloportBindingStub _stub = new com.tabish.www.HelloportBindingStub(new java.net.URL(helloport_address), this);
                _stub.setPortName(gethelloportWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("helloport".equals(inputPortName)) {
            return gethelloport();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.tabish.com", "helloservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.tabish.com", "helloport"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("helloport".equals(portName)) {
            sethelloportEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
