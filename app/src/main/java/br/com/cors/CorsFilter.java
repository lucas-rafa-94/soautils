package br.com.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter{
	
	static HttpServletRequest httpServletRequest;
	static HttpServletResponse httpServletResponse; 

	public void destroy() {}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		httpServletRequest = (HttpServletRequest) req;
		httpServletResponse = (HttpServletResponse) res;
		
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		httpServletResponse.setHeader("Access-Control-Max-Age", "86400");
	    
		httpServletResponse.setHeader("Allow", "GET, HEAD, POST, TRACE, OPTIONS");
		
		if (httpServletRequest.getMethod().equals("OPTIONS")){
			httpServletResponse.setStatus(HttpServletResponse.SC_OK);
	        return;
		}
		
		chain.doFilter(httpServletRequest, httpServletResponse);
		
	}

	public void init(FilterConfig arg0) throws ServletException {}

}
