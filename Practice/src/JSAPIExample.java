

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSAPIExample
{

	private static String LDD_SERVER = "10.1.1.5";	//LDD Server Address
	private static String JSAPI_BASE_URI = "http://" + LDD_SERVER + ":9780/lmc/rws/jsapi";	//URI of the Base REST API  - This URI could use HTTPS if so then the port would be 443
	private static String SUBMIT_JOB_URI = JSAPI_BASE_URI + "/v1/jobs";	//URI use to execute the LDD profile
	private static String GET_STATUS_URI = JSAPI_BASE_URI + "/v1/jobs/{jobId}"; //URI used to retrieve the status of the SubmitJob method

	public static void main(String[] args)
	{
		String status = "failed";
		try
		{
			int jobId = submitJob();

			System.out.println("jobId: " + jobId);
			if (jobId > 0) status = getStatus(jobId);
			System.out.println("status of submitted job: " + status);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static int submitJob() throws Exception
	{
		PostMethod post = new PostMethod(SUBMIT_JOB_URI);
		int jobId = -1;

		try
		{
			int stringPartLength = 4;

			Part[] parts = new Part[stringPartLength];
			parts[0] = new StringPart("profileName", "CreateScanRequest"); 	//This is the name of LDD Profile to execute
			parts[1] = new StringPart("authId", "Symphony");	//Userid that is requesting to execute the LDD Profile
			parts[2] = new StringPart("applicationNumber", "1234567890");	//Additional Metadata to send along with the Submit Job call
			parts[3] = new StringPart("branchNumber", "1234");	//Additional Metadata to send along with the Submit Job call

			post.setRequestEntity(new MultipartRequestEntity(parts, post.getParams()));

			HttpClient client = createHttpClient(null, 80);
			client.setConnectionTimeout(30000);

			int result = client.executeMethod(post);
			String jobResp = post.getResponseBodyAsString();     
			if (result != 201)
			{
				jobId = -1;
			}
			else
			{
				String jobIdStr = (String) extractData(jobResp, "jobId");
				jobId = Integer.parseInt(jobIdStr);
			}
		}
		finally
		{
			post.releaseConnection();
		}
		return jobId;
	}

	private static String getStatus(int jobId) throws Exception
	{
		boolean cont = true;
		int statusResult = 200;
		String jobState = null;

		GetMethod statusPost = new GetMethod(GET_STATUS_URI.replace("{jobId}", String.valueOf(jobId)));

		while (statusResult == 200 && cont)
		{
			try
			{
				HttpClient client = createHttpClient(null, 80);
				client.setConnectionTimeout(30000);

				statusResult = client.executeMethod(statusPost);
				InputStream is = statusPost.getResponseBodyAsStream();
				String statusResp = getStringFromInputStream(is);

				if(statusResult == 200)
				{
					jobState = (String) extractData(statusResp, "state");
					if(!jobState.equals("Running"))    
					{
						cont = false;
					}
				}
				else
				{
					cont = false;
					jobState = "NetworkError";
				}
			}
			finally
			{
				statusPost.releaseConnection();
			}
		}	
		return jobState;
	}

	private static Object extractData(final String input, final String id)
	{
		JSONObject json = (JSONObject) JSONValue.parse(input);
		return json.get(id);
	}

	private static HttpClient createHttpClient(final String proxyHost, final int port)
	{
		HttpClient rtnObj = null;
		rtnObj = (HttpClient) AccessController.doPrivileged(new PrivilegedAction()
		{
			public Object run()
			{
				HttpClient client = new HttpClient();
				if (proxyHost != null && !"".equals(proxyHost))
				{
					client.getHostConfiguration().setProxy(proxyHost, port);
				}
				return ((Object) client);
			}
		});
		return rtnObj;
	}

	private static String getStringFromInputStream(InputStream is) 
	{

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try 
		{

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) 
			{
				sb.append(line);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if (br != null) 
			{
				try 
				{
					br.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
}
