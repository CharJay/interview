/**
 * 
 */
package com.charjay.basic.section3.interfacedemo.example;

/**
 * @author Administrator
 *
 */
public class Computer {
	
	private UsbDevice device;
	
	public void putUsbDevice(UsbDevice device){
		this.device=device;
		this.device.plugin();
	}
	
	public void runUsbDevice(){
		this.device.run();
	}
	

}
