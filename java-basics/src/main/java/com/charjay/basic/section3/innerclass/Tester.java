/**
 * 
 */
package com.charjay.basic.section3.innerclass;

/**
 * @author Administrator
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//静态内部类创建实例，无需外部类实例的存在，即可创建内部类实例。
		ChessBoard.Stone s=new ChessBoard.Stone();
		s.test();
		
		//实例内部创建实例，必须确保有外部类的实例存在。
		ChessBoard board=new ChessBoard();
		ChessBoard.A a=board.new A();
		a.showinfo();
		
		ChessBoard.A  a2=new ChessBoard().new A();
		a2.showinfo();
		
		
		board.sayHello();
		board.sayHello2();
		
	}

}
