package org.tabi;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 1)
		{
		System.out.println("provide one ip address");
		}
		else
		{             // this would be remote web service call
		String ipAddress = args[0];
   /*  we need to call SEI ,  JAVA PROVIDES TOOLS( wsimport ) WHICH GENERATES SEI (stub)
      we call method on stub  
    
		*/
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap  ipServiceSoap = ipService.getGeoIPServiceSoap();  //(this is stub)
		GeoIP geoIp =ipServiceSoap.getGeoIP(ipAddress);
		System.out.println("country name : " +geoIp.getCountryName());
		
		System.out.println("country code :" + geoIp.getCountryCode());
		System.out.println("return code :" + geoIp.getReturnCode());
		System.out.println("return code details : " + geoIp.getReturnCodeDetails());
		
		
		}		
	}

}
