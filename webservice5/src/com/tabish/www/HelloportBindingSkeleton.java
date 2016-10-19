/**
 * HelloportBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tabish.www;

public class HelloportBindingSkeleton implements com.tabish.www.Hellomethod, org.apache.axis.wsdl.Skeleton {
    private com.tabish.www.Hellomethod impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tabish.com", "helloInput"), com.tabish.www.HelloInput.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.tabish.com", "helloOutput"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.tabish.com", "add"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add") == null) {
            _myOperations.put("add", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tabish.com", "helloInput"), com.tabish.www.HelloInput.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add1", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.tabish.com", "helloOutput"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.tabish.com", "add1"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add1") == null) {
            _myOperations.put("add1", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add1")).add(_oper);
    }

    public HelloportBindingSkeleton() {
        this.impl = new com.tabish.www.HelloportBindingImpl();
    }

    public HelloportBindingSkeleton(com.tabish.www.Hellomethod impl) {
        this.impl = impl;
    }
    public com.tabish.www.HelloOutput add(com.tabish.www.HelloInput arg0) throws java.rmi.RemoteException
    {
        com.tabish.www.HelloOutput ret = impl.add(arg0);
        return ret;
    }

    public com.tabish.www.HelloOutput add1(com.tabish.www.HelloInput arg0) throws java.rmi.RemoteException
    {
        com.tabish.www.HelloOutput ret = impl.add1(arg0);
        return ret;
    }

}
