/**
 * 
 */
package com.charjay.basic.section3.interfacedemo.example;

/**
 * @author Administrator
 * 移动硬盘
 */
public class PortableHD implements UsbDevice {

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.example.UsbDevice#plugin()
	 */
	public void plugin() {
       System.out.println("移动硬盘 ：正在进行磁盘检测，对坏道进行隔离....");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.example.UsbDevice#run()
	 */
	public void run() {
	   System.out.println("移动硬盘 ：正在进行磁盘文件读写....");
	}

}
