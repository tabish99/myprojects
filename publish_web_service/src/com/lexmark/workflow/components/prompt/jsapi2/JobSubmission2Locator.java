/**
 * JobSubmission2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public class JobSubmission2Locator extends org.apache.axis.client.Service implements com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2 {

    public JobSubmission2Locator() {
    }


    public JobSubmission2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JobSubmission2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JobSubmission2SOAP11port_http
    private java.lang.String JobSubmission2SOAP11port_http_address = "http://localhost:8081/TestJobSubmission/services/JobSubmission2SOAP11port_http";

    public java.lang.String getJobSubmission2SOAP11port_httpAddress() {
        return JobSubmission2SOAP11port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JobSubmission2SOAP11port_httpWSDDServiceName = "JobSubmission2SOAP11port_http";

    public java.lang.String getJobSubmission2SOAP11port_httpWSDDServiceName() {
        return JobSubmission2SOAP11port_httpWSDDServiceName;
    }

    public void setJobSubmission2SOAP11port_httpWSDDServiceName(java.lang.String name) {
        JobSubmission2SOAP11port_httpWSDDServiceName = name;
    }

    public com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType getJobSubmission2SOAP11port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JobSubmission2SOAP11port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJobSubmission2SOAP11port_http(endpoint);
    }

    public com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType getJobSubmission2SOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2SOAP11BindingStub _stub = new com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2SOAP11BindingStub(portAddress, this);
            _stub.setPortName(getJobSubmission2SOAP11port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJobSubmission2SOAP11port_httpEndpointAddress(java.lang.String address) {
        JobSubmission2SOAP11port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2SOAP11BindingStub _stub = new com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2SOAP11BindingStub(new java.net.URL(JobSubmission2SOAP11port_http_address), this);
                _stub.setPortName(getJobSubmission2SOAP11port_httpWSDDServiceName());
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
        if ("JobSubmission2SOAP11port_http".equals(inputPortName)) {
            return getJobSubmission2SOAP11port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmission2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmission2SOAP11port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JobSubmission2SOAP11port_http".equals(portName)) {
            setJobSubmission2SOAP11port_httpEndpointAddress(address);
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
