/**
 * 
 */
package com.charjay.basic.section3.modifierdemo.myhome;

/**
 * @author Administrator
 *
 */
public class GrandFather {
	
	private Integer money; //（爷爷的钱）只有本类可以访问
	String sleepLocation; //（爷爷睡觉的地方）只有本包类可以访问。 什么访问修饰符都不写，就是包访问级别，也就是默认访问级别。
	protected Integer age; //（爷爷的岁数）本包类以及异包子类可见
	public String name; //（爷爷的名字）所有类均可见
	
	public void showInfo(){
		
		GrandFather gf=new GrandFather();
	}


}
