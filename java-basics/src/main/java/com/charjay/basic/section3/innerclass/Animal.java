/**
 * 
 */
package com.charjay.basic.section3.innerclass;

/**
 * @author Administrator
 *
 */
public class Animal {
	
	private String breed;
	private Integer age;
		
	public Animal(String breed, Integer age) {
		super();
		this.breed = breed;
		this.age = age;
	}
	


	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void run(){
		System.out.println(this.age+"岁的"+this.breed+"在奔跑....");	
	}
	
	public void sound(){
	  System.out.println("Animal is sounding now");
	}
	
	

}
