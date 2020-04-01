/**
 * 
 */
package com.charjay.basic.section3.modifierdemo.unclehome;

import com.charjay.basic.section3.modifierdemo.myhome.GrandFather;

/**
 * @author Administrator
 *
 */
public class Uncle extends GrandFather {
	

	public void showInfo(){
		//远房叔叔 只能知道爷爷的名字 （很久没来岁数，年龄，睡觉的位置都忘记了） 
		GrandFather gf=new GrandFather();
		//System.out.println(gf.age);
	}

}
