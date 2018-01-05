package br.com.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import br.com.utils.Helper;

public class RestCaller {

	 public static String [] restCaller(String auth, String uri, String method,String contentType ,String payload) throws Exception {
		 ClientResponse response = null;
		 WebResource webResource = null;
		 Client client = null;
		 String credentials [] = new String [2];
		 String output [] = new String [2];
		 try {
		 	credentials = Helper.returnCredentials(auth);
	     	HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter(credentials[0], credentials[1]);
	    	    client = Client.create();
	    	    client.addFilter(authFilter);
	    	       webResource = client.
	                    resource(Helper.URI_SERVER + uri);
			       if(method.equals("GET")) {
	        	    response = webResource.accept(contentType)
	                    .get(ClientResponse.class);
	    	       }else if (method.equals("POST")) {
	    	    	   	 if(contentType.equals("application/x-www-form-urlencoded")) {
	    	    	   		MultivaluedMapImpl formData = Helper.urlEncodedForm(payload);
	    	    	   		response = webResource.header("Content-Type", contentType).accept("application/json")
	    	   	                    .post(ClientResponse.class, formData);
	    	    	   	}else {
	    	    	    response = webResource.header("Content-Type", contentType)
	   	                    .post(ClientResponse.class, payload);
	    	    	   	}
	    	       }else if (method.equals("PUT")){
	    	    	   response = webResource.accept(contentType)
		   	                    .put(ClientResponse.class);
	    	    	   		if(contentType.equals("application/x-www-form-urlencoded")) {
	    	    	   			MultivaluedMapImpl formData = Helper.urlEncodedForm(payload);
	    	    	   			response = webResource.header("Content-Type", contentType)
	    	   	                    .post(ClientResponse.class, formData);
	    	    	   		}else {
	    	    	   			response = webResource.header("Content-Type", contentType)
	   	                    .post(ClientResponse.class, payload);
	    	    	   		}
	    	       }
	    	       output[0] = Integer.toString(response.getStatus());
	               output[1] = Helper.callResponses(response);
	         } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (response != null) {
	                    response.close();
	                }
	            } catch (Exception e) {
	                throw e;
	            }
	        }
	        return output;
	    }

	

}
