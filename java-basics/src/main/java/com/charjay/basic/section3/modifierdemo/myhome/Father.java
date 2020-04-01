/**
 * 
 */
package com.charjay.basic.section3.modifierdemo.myhome;

/**
 * @author Administrator
 *
 */
public class Father extends GrandFather {
	
	
  	public void showInfo(){
        //父亲可以知道爷爷的 名字，岁数，年龄，睡觉的位置
  		GrandFather gf=new GrandFather();
  		gf.sleepLocation=null;
	}
	

}
