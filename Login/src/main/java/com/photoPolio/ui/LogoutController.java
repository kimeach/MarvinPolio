/**
 * 
 */
package com.photoPolio.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * 
 *  @packagename Login
 *  @menuName 
 *  @RequestMapping  
 *  @filename LogoutController.java
 *  @author gmKim
 *  @since 2020. 7. 20.
 *  <PRE>
 *  DATE            AUTHOR      NOTE
 *  -------------   ---------   --------------
 *  2020. 7. 20.        gmKim   최초 생성
 *  
 *  
 *  
 *  
 *  </PRE> 
 */
@Controller
@RequestMapping("/Logout")
public class LogoutController {

	@GetMapping
	public ResponseEntity<String> getLogout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute("Login");
		
		return new ResponseEntity<String>("OK",HttpStatus.OK);
	}
}
