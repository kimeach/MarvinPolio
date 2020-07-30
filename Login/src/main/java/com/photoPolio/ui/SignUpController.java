/**
 * 
 */
package com.photoPolio.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 * 
 *  @packagename Login
 *  @menuName 
 *  @RequestMapping  
 *  @filename SignUpController.java
 *  @author gmKim
 *  @since 2020. 7. 28.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 7. 28.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */
@Controller
@RequestMapping("/signUp")
public class SignUpController {

	@GetMapping
	public ModelAndView getSignUp() {
		return new ModelAndView("SignUp");
	}
}
