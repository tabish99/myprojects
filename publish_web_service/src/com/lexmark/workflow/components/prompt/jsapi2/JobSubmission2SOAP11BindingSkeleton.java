/**
 * JobSubmission2SOAP11BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public class JobSubmission2SOAP11BindingSkeleton implements com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType, org.apache.axis.wsdl.Skeleton {
    private com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmissionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "jobSubmissionInput"), com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionInput.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("submitJob", _params, new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmissionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "jobSubmissionOutput"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "submitJob"));
        _oper.setSoapAction("submitJob");
        _myOperationsList.add(_oper);
        if (_myOperations.get("submitJob") == null) {
            _myOperations.put("submitJob", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("submitJob")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "ProfileNotFoundFault"));
        _fault.setClassName("com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundDetail");
        _fault.setXmlType(new javax.xml.namespace.QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "profileNotFoundDetail"));
        _oper.addFault(_fault);
    }

    public JobSubmission2SOAP11BindingSkeleton() {
        this.impl = new com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2SOAP11BindingImpl();
    }

    public JobSubmission2SOAP11BindingSkeleton(com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType impl) {
        this.impl = impl;
    }
    public com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionOutput submitJob(com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionInput part1) throws java.rmi.RemoteException, com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundDetail
    {
        com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionOutput ret = impl.submitJob(part1);
        return ret;
    }

}
