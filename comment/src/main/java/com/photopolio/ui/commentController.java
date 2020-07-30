/**
 * 
 */
package com.photopolio.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** 
 * 
 *  @packagename comment
 *  @menuName 
 *  @RequestMapping  
 *  @filename commentController.java
 *  @author gmKim
 *  @since 2020. 5. 4.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 5. 4.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */
@Controller
@RequestMapping("/comment")
public class commentController {

	@Autowired
	WebClient.Builder Builder;
	
	@Autowired
	WebClientController client;
	@GetMapping
	public ModelAndView getComment() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("comment");
		return mav;
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> postComment(@RequestBody Map<String, Object> map){
		System.out.println("들어옴");
		System.out.println("map : "+map);
		//Mono<String> b = client.getUrl.get().uri("/Login/{id}/{pw}",map.get("id"),map.get("pw")).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
		
		
		return new ResponseEntity<>("OK",HttpStatus.OK);
	}
	
}
