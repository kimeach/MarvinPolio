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

	@GetMapping
	public ModelAndView getComment() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("comment");
		return mav;
	}
}
