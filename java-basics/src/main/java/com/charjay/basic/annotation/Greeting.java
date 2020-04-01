package com.charjay.basic.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author taomk 2017年7月26日 下午8:28:16
 *
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Greeting {

	/**
	 * 自定义信息
	 * @return
	 */
	public String message() default "~";
	
	/**
	 * 打招呼
	 * @return
	 */
	public String sayHi() default "Hi~";
}
