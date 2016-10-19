package com.lexmark.workflow.components.prompt.jsapi2;

import java.io.File;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.Attachment;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.JobSubmissionInput;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.JobSubmissionRequest;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.JobSubmissionResponse;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.NameValue;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2Stub.SoapMap;
public class Test
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				JobSubmissionRequest req = new JobSubmissionRequest();
				JobSubmissionInput jobSubmissionInput = new JobSubmissionInput();
				jobSubmissionInput.setAuthId("as");
				jobSubmissionInput.setProfileName("ok profile");
				SoapMap soapMap = new SoapMap();
				NameValue n1 = new NameValue();
				n1.setKey("key");
				n1.setValue("value");
				NameValue n2 = new NameValue();
				n2.setKey("key");
				n2.setValue("value");
				NameValue nv[] =
					{n1, n2};
				soapMap.setNameValue(nv);
				Attachment att = new Attachment();

				att.setFileName("v");
				Attachment att1 = new Attachment();

				att1.setFileName("a");
				Attachment atta[] =
					{att, att1};
				jobSubmissionInput.setAttachments(atta);
				jobSubmissionInput.setSoapMap(soapMap);

				req.setJobSubmissionRequest(jobSubmissionInput);

				try
					{

						JobSubmissionResponse response = new JobSubmission2Stub()
						        .submitJob(req);
						System.out.println("asdnm " + response.toString());

					} catch (AxisFault e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ProfileNotFoundFaultException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}

	}
