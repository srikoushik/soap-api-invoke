package com.scribbler;

public class Main {

	public static void main(String[] args) {
		
		// set the proxy when it is required.
//		System.setProperty("java.net.userSystemProxies", "true");
		
		GeoIPService geoIpService = new GeoIPService();
		GeoIPServiceSoap geoIpServiceSoap = geoIpService.getGeoIPServiceSoap();
		String result = geoIpServiceSoap.getIpLocation("103.101.68.14");
		System.out.println(result);
	}

}
