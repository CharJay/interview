/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */
public class Tom implements Student {

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#enjoyHoliday()
	 */
	@Override
	public void enjoyHoliday() {
       System.out.println("Tom: 打点暑期工，为来年赚点学费。");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#gotoSchool()
	 */
	@Override
	public void gotoSchool() {
       System.out.println("Tom: 基本走路上学，环保健康...");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#test()
	 */
	@Override
	public void test() {
	   System.out.println("Tom: 认真复习，努力考试，争取奖学金。");	
	}

}
