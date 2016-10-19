package test;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.Page;

public class Posting
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

				FacebookClient facebookClient = new DefaultFacebookClient("CAACEdEose0cBAPaE7SFO4389QJUGZBWiOPau3aUbRrRwB9AMH9EjQtZCiPTNaIrWYghrOiXJTV58iwnZCL2eUOyBqRuRQvLKp289GyL9ygxmvLwTtJFG2sd1K15afoISmrKlHHZCboad0oZCBc3bILQhOC8ZAstBzFtAZAnElYyMKuqIxvOWGY1gAUUTKy9kkMZD");
				 final Page page = facebookClient.fetchObject("https://www.facebook.com/", Page.class);
			FacebookType ft=	    facebookClient.publish("me/feed", FacebookType.class, Parameter.with("message", "hlxxli there"));
				System.out.println("hu "+ ft);
				
			}

	}
