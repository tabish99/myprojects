/**
 * JobSubmission2PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lexmark.workflow.components.prompt.jsapi2;

public interface JobSubmission2PortType extends java.rmi.Remote {
    public com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionOutput submitJob(com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionInput part1) throws java.rmi.RemoteException, com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundDetail;
}
