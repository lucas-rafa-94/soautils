package br.com.cors;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rest.RestCaller;


public class CorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CorsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String authResponse [] = new String [2];
		
		try {
			if(request.getHeader("Authorization") == null) {
				response.getWriter().append("{\"status\": \"Unauthorized\"}");
				response.setStatus(401);
			}else{
				authResponse = RestCaller.restCaller(request.getHeader("Authorization"), request.getRequestURI().replace(request.getContextPath(), ""), "GET", request.getHeader("Content-Type") ,"");
				response.setStatus(Integer.parseInt(authResponse[0]));
				response.getWriter().append(authResponse[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.addHeader("Content-Type", "application/json");
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String authResponse [] = new String [2];
		String body = request.getReader().lines()
			    .reduce("", (accumulator, actual) -> accumulator + actual);
		System.out.println(body);
		try {
			if(request.getHeader("Authorization") == null) {
				response.getWriter().append("{\"status\": \"Unauthorized\"}");
				response.setStatus(401);
			}else {
				authResponse = RestCaller.restCaller(request.getHeader("Authorization"), request.getRequestURI().replace( request.getContextPath(), ""), "POST",request.getHeader("Content-Type"), body);
				response.setStatus(Integer.parseInt(authResponse[0]));
				response.getWriter().append(authResponse[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.addHeader("Content-Type", "application/json");
	
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String body = request.getReader().lines()
			    .reduce("", (accumulator, actual) -> accumulator + actual);
	    String authResponse [] = new String [2];
		
		try {
			if(request.getHeader("Authorization") == null) {
				response.getWriter().append("{\"status\": \"Unauthorized\"}");
				response.setStatus(401);
			}else{
				authResponse = RestCaller.restCaller(request.getHeader("Authorization"), request.getRequestURI().replace(request.getContextPath(), ""), "PUT", request.getHeader("Content-Type") ,body);
				response.setStatus(Integer.parseInt(authResponse[0]));
				response.getWriter().append(authResponse[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.addHeader("Content-Type", "application/json");
	}

}
