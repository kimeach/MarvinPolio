package com.photoPolio.ui.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 /** 
 * 
 *  @packagename index
 *  @menuName 
 *  @RequestMapping  
 *  @filename indexController.java
 *  @author gmKim
 *  @since 2020. 4. 29.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 4. 29.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */
@Controller


@RequestMapping("/index")
public class indexController {

	@GetMapping
	public ModelAndView getIndex(HttpServletRequest request) {
		//ModelAndView mav = new ModelAndView("index");
		ModelAndView mav = new ModelAndView("test");
		HttpSession session = request.getSession();
		
		System.out.println("session : "+session.getAttribute("session"));
		return mav;
	}
}
