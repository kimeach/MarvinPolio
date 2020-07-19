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
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping
	public ModelAndView getComment() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("comment");
		return mav;
	}
	
	
	@GetMapping("/test")
	public ResponseEntity<?> test(){
		WebClient web = Builder.build();
		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();
		Mono<Object> helloMono = web.get().uri("http://localhost:1002/polio/userA").retrieve().bodyToMono(Object.class);
		
		Flux<Object> helloFlux = web.get().uri("http://localhost:1002/polio/userA").retrieve().bodyToFlux(Object.class);
				
		
		
		List<Map<String, Object>> list = web.mutate().baseUrl("http://localhost:1002/polio/userA").build().get().accept(MediaType.APPLICATION_JSON).retrieve()
								.bodyToFlux(Map.class).toStream().collect(Collectors.toList());
		
		int count =0;
		for(Map<String,Object> arr : list) {
			
			System.out.println("============"+(++count)+"==============");
			System.out.println("id : "+arr.get("id"));
			System.out.println("pw : "+arr.get("password"));
			System.out.println("name : "+arr.get("name"));
			
		}
		
		helloFlux.subscribe(s -> {
			System.out.println(s +" 까지");
			
			if(stopWatch.isRunning()) {
				stopWatch.stop();
			}
			System.out.println(stopWatch.prettyPrint());
			stopWatch.start();
		});
		
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
	
	
}
