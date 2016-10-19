
package com.lexmark.workflow.components.prompt.jsapi2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lexmark.workflow.components.prompt.jsapi2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProfileNotFoundFault_QNAME = new QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "ProfileNotFoundFault");
    private final static QName _JobSubmissionRequest_QNAME = new QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmissionRequest");
    private final static QName _JobSubmissionResponse_QNAME = new QName("http://jsapi2.prompt.components.workflow.lexmark.com/", "JobSubmissionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lexmark.workflow.components.prompt.jsapi2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JobSubmissionOutput }
     * 
     */
    public JobSubmissionOutput createJobSubmissionOutput() {
        return new JobSubmissionOutput();
    }

    /**
     * Create an instance of {@link ProfileNotFoundDetail }
     * 
     */
    public ProfileNotFoundDetail createProfileNotFoundDetail() {
        return new ProfileNotFoundDetail();
    }

    /**
     * Create an instance of {@link JobSubmissionInput }
     * 
     */
    public JobSubmissionInput createJobSubmissionInput() {
        return new JobSubmissionInput();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link SoapMap }
     * 
     */
    public SoapMap createSoapMap() {
        return new SoapMap();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link TaskInfo }
     * 
     */
    public TaskInfo createTaskInfo() {
        return new TaskInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileNotFoundDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jsapi2.prompt.components.workflow.lexmark.com/", name = "ProfileNotFoundFault")
    public JAXBElement<ProfileNotFoundDetail> createProfileNotFoundFault(ProfileNotFoundDetail value) {
        return new JAXBElement<ProfileNotFoundDetail>(_ProfileNotFoundFault_QNAME, ProfileNotFoundDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobSubmissionInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jsapi2.prompt.components.workflow.lexmark.com/", name = "JobSubmissionRequest")
    public JAXBElement<JobSubmissionInput> createJobSubmissionRequest(JobSubmissionInput value) {
        return new JAXBElement<JobSubmissionInput>(_JobSubmissionRequest_QNAME, JobSubmissionInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobSubmissionOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jsapi2.prompt.components.workflow.lexmark.com/", name = "JobSubmissionResponse")
    public JAXBElement<JobSubmissionOutput> createJobSubmissionResponse(JobSubmissionOutput value) {
        return new JAXBElement<JobSubmissionOutput>(_JobSubmissionResponse_QNAME, JobSubmissionOutput.class, null, value);
    }

}
