import java.net.MalformedURLException;
import java.net.URL;

import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmission2PortType;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionInput;
import com.lexmark.workflow.components.prompt.jsapi2.JobSubmissionOutput;
import com.lexmark.workflow.components.prompt.jsapi2.ProfileNotFoundFault;


public class Test
	{

		/**
		 * @param args
		 * @throws ProfileNotFoundFault 
		 * @throws MalformedURLException 
		 */
		public static void main(String[] args) throws ProfileNotFoundFault, MalformedURLException
			{
				// TODO Auto-generated method stub
				
				JobSubmissionInput input = new JobSubmissionInput();
		JobSubmission2 jobsubmit =	new JobSubmission2();
		//URL url =new URL("http://localhost:7001/webAxis2Job/services/JobSubmission2?wsdl");
				
		     JobSubmission2PortType port =   jobsubmit.getJobSubmission2SOAP11PortHttp();
	    JobSubmissionOutput out = port.submitJob(input);
	    System.out.println("heloo");
			}

	}
