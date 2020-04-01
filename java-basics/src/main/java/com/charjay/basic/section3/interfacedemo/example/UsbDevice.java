/**
 * 
 */
package com.charjay.basic.section3.interfacedemo.example;

/**
 * @author Administrator
 *
 */
public interface UsbDevice {
	
	/**
	 * USB设备，插入初始化操作
	 */
	void plugin();
	/**
	 * USB设备工作
	 */
	void run();

}
