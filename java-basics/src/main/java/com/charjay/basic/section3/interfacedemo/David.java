/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */
public class David implements Student {

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#enjoyHoliday()
	 */
	@Override
	public void enjoyHoliday() {
	   System.out.println("david: 在家看电视，玩游戏，一般不出门...");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#gotoSchool()
	 */
	@Override
	public void gotoSchool() {
	   System.out.println("david: 坐公交车上学!");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#test()
	 */
	@Override
	public void test() {
	   System.out.println("david: 考前突击，及格万岁!");
	}

}
