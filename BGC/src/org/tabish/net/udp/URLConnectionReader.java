package org.tabish.net.udp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader
	{
		static String inputline = " ";
		public static void main(String... s) throws Exception
			{
				URL yahoo = new URL("http://www.google.com/");
				URLConnection yc = yahoo.openConnection();
				BufferedReader in = new BufferedReader(new InputStreamReader(
				        yc.getInputStream()));

				while (inputline != null)
					{
						inputline = in.readLine();
						System.out.println(inputline);

					}
				in.close();
			}

	}