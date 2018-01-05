package br.com.utils;

import java.nio.charset.Charset;
import java.util.Base64;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class Helper {
	
	public final static String URI_SERVER = "http://oc-129-144-158-115.compute.oraclecloud.com";
	public static String [] returnCredentials(String auth) {
		
		String[] values = new String [2];
		
		if (auth!= null && auth.startsWith("Basic")) {
		 String base64Credentials = auth.substring("Basic".length()).trim();
         String credentials = new String(Base64.getDecoder().decode(base64Credentials),
                 Charset.forName("UTF-8"));
        
         values = credentials.split(":",2);
 	    }
		
		return values;
	}
	
	public static String callResponses (ClientResponse response) {
		String responsePayload = null;
		if (response.getStatus() == 401) {
			responsePayload =  "{\"status\": \"Unauthorized\"}";
        }
		else if (response.getStatus() == 404){
	    	    responsePayload =  "{\"status\": \"Page Not Found\"}";
        }
		else if (response.getStatus() >= 500){

	        	responsePayload =  "{\"status\": \"Internal Server Error\"}";
        }
		else if (response.getStatus() == 400){
	     	responsePayload =  "{\"status\": \"Bad Request\"}";
	    }
		else if (response.getStatus() == 405){
	     	responsePayload =  "{\"status\": \"Method not Allowed\"}";
	    }
		else{
	     	responsePayload =  response.getEntity(String.class);
        }
	    return responsePayload;
	}
	
	public static MultivaluedMapImpl urlEncodedForm(String payload) {
        String[] payloadVector = payload.split("&");
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
		for(int i = 0; i < payloadVector.length; i++) {
			String[] v = payloadVector[i].split("=");
			formData.add(v[0], v[1]);
		}
		return formData;
	}


}
