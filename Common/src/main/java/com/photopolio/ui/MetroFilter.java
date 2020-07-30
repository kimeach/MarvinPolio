package com.photopolio.ui;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;


import reactor.core.publisher.Mono;

@Component
public class MetroFilter implements Filter{
	
	@Autowired
	WebClientController Client;
	
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException , ServletException {
		System.out.println("filter 시작");
		
		
		
		chain.doFilter(request, response);
	}
}
