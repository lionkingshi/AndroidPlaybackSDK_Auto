/**
* @Title:			Testlink
* @Package:			com.dolby.test.annotation
* @Description:		N/A  
* @author:			Alex LI
* @date:			2014/03/19
* @COPYRIGHT:		2014 Dolby Labs. All rights reserved
*/

package com.dolby.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Testlink 
{
	public String Id() default "NA";
	public String Title() default "NA";
}
