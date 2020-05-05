/**
 * 
 */
package com.photopolio.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 * 
 *  @packagename myPortpolio
 *  @menuName 
 *  @RequestMapping  
 *  @filename myportPolioController.java
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
@RequestMapping("/myPortPolio")
public class myportPolioController {

	@GetMapping
	public ModelAndView getMyPortPolio() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("myPortPolio");
		return mav;
	}
	
	
}
