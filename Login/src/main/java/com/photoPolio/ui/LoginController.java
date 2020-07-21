/**
 * 
 */
package com.photoPolio.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

import com.photopolio.ui.MetroRestTemplate;
import com.photopolio.ui.RestTemplate;
import com.photopolio.ui.WebClientController;

import jdk.internal.org.jline.utils.Log;
//import com.google.gson.Gson;
import reactor.core.publisher.Mono;

/** 
 * 
 *  @packagename Login
 *  @menuName 
 *  @RequestMapping  
 *  @filename LoginController.java
 *  @author gmKim
 *  @since 2020. 7. 12.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 7. 12.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	WebClient.Builder Builder;
	
	@Autowired
	WebClientController client;
//	@Autowired(required=false)
//	MetroRestTemplate rest;
	
	@GetMapping
	public ModelAndView getLogin() {
		ModelAndView mav = new ModelAndView("Login");
		return mav;
	}
	
	
	/**
	 * @param map 
	 * @return Login 하는 Controller
	 */
	@ResponseBody
	@PostMapping("/checkLogin")
	public ResponseEntity<String> getLogin(@RequestBody Map<String,Object> map, HttpServletRequest request){
		System.out.println("get 들어옴");
		WebClient webC = WebClient.create("http://localhost:1002/polio");
		Mono<String> b = webC.get().uri("/user/{id}/{pw}",map.get("id"),map.get("pw")).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
		
		//Mono<String> c = webC.get().uri("//{id}/{pw}",map.get("id"),map.get("pw")).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
		
		if(b.block().equals("true")) {
			System.out.println("true 들어옴");
			HttpSession session = request.getSession();
			session.setAttribute("Login", b.block());
			WebClient webOauth = WebClient.create("http://localhost:1000/polio");
			Mono<String> c = webOauth.get().uri("/oauth/{id}/{pw}",map.get("id"),map.get("pw")).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
			System.out.println("c : "+c.block());
		}else {
			System.out.println("false");
			
		}
		return new ResponseEntity<String>(b.block(),HttpStatus.OK);
	}
}
