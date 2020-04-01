/**
 * 
 */
package com.charjay.basic.section3.innerclass;

/**
 * @author Administrator
 *
 */
public class ChessBoard {
	
	private String   type;
	private Integer  width;
	private Integer  height;
	
	
	//内部类 （inner class)
	/*
	  当一个类和另外一个类关系密切，甚至这个类还经常需要访问另外一个类的私有属性和方法，
	 为了程序书写的便利，我们可以干脆把这个类放置到另外一个类内部，和这个类的方法和属性平级，我们称这样的的类为方法级别内部类。 
	 方法级别内部类，可以有各种访问修饰符，一个方法能用访问的修饰，它基本都能用。
	如果两个类关系密切，需要大量交互，写成内部类，能有效简化书写。
	
	静态内部类，无需外部类的实例存在，则可以创建内部类的实例
	 */
	public static class Stone{
		
		void test(){
		  System.out.println("test chessBoard stone!");	
		  //type="abc"; //静态内部类不能访问外部类实例属性和方法
		}
		
	}
	
	public class A{
		void showinfo(){
		  System.out.println("class A showinfo now!");	
		  type="abc";
		  
		}
	}
	
	public void sayHello(){
		
		//局部变量级别内部类。不能有任何访问修饰符。
		class B{
			
		  public void doIt(){
			  System.out.println("class B method doIt is invoked now!");
		  }
			
		}
		
		B b=new B();
		b.doIt();
				
	}
	
	public void sayHello2(){
		
		//匿名类(anonymous class),其是一种特殊的，一次性使用的局部变量级别内部类。
		Animal animal=new Animal(type, height){

		
			public void sound() {
			  System.out.println("I'm tiger!");
			}
					  	
		};
		
		animal.run();
		
		
//		new Object(){
//			
//			void doIt(){
//			  System.out.println("do it now!");	
//			}
//			
//		}.doIt();
		
		
		Object obj=new Object(){
			
			void doIt(){
			  System.out.println("do it now!");	
			}
			
			
			public String toString() {
				return "object work!";
			}
			
		};
		
		System.out.println(obj);
		
		
//		new Runnable(){
//		   
//			public void run(){
//			  System.out.println("Running now.");	
//			}
//			
//		}.run();
		
		Runnable r=new Runnable(){
			   
			public void run(){
			  System.out.println("Running now.");	
			}
			
		};
		
		r.run();
		r.run();
		
		
		
			
	}
	
	
	
	

}
