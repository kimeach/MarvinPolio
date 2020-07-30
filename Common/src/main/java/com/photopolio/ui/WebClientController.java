/**
 * 
 */
package com.photopolio.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.core.net.server.Client;

/** 
 * 
 *  @packagename common
 *  @menuName 
 *  @RequestMapping  
 *  @filename WebClientController.java
 *  @author gmKim
 *  @since 2020. 7. 19.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 7. 19.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */
@Component
public class WebClientController {
	
//		 List<Map<String, Object>>  test = webC.get().uri("/user").accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Map.class).toStream().collect(Collectors.toList());
	
	public WebClient getUrl = WebClient.create("http://localhost:1002/polio");
	
	public List<Map<String,Object>> getListMapClient(String uri) {
		return getUrl.get().uri(uri).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Map.class).toStream().collect(Collectors.toList());
	}
	
	public List<Map<String,Object>> getListMapClient(String uri,Object data) {
		return getUrl.get().uri(uri,data).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Map.class).toStream().collect(Collectors.toList());
	}
	public List<Map<String,Object>> getListMapClient(String uri,Object data,Object data2) {
		return getUrl.get().uri(uri,data,data2).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Map.class).toStream().collect(Collectors.toList());
	}
	
	public List<Object> getListObjectClient(String uri) {
		return getUrl.get().uri(uri).accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Object.class).toStream().collect(Collectors.toList());
	}
	public Map<String,Object> getMapClient(String uri) {
		return null;
	}
	
	

}
