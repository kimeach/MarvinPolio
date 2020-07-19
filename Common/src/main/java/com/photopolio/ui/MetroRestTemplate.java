/**
 * 
 */
package com.photopolio.ui;

import org.springframework.stereotype.Component;

/** 
 * 
 *  @packagename common
 *  @menuName 
 *  @RequestMapping  
 *  @filename MetroRestTemplate.java
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
@Component("Rest")
public interface MetroRestTemplate {
	RestTemplate createRestTemplate();
	
}
