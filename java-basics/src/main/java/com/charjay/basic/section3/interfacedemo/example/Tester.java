/**
 * 
 */
package com.charjay.basic.section3.interfacedemo.example;

/**
 * @author Administrator
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer computer=new Computer();
		
		computer.putUsbDevice(new PortableHD());
		computer.runUsbDevice();
		
	}

}
