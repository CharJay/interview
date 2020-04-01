/**
 * 
 */
package com.charjay.basic.section3.interfacedemo.example;

/**
 * @author Administrator
 *
 */
public class WebCam implements UsbDevice {

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.example.UsbDevice#plugin()
	 */
	public void plugin() {
      System.out.println("webcam:初始化图形控件，内存清理...");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.example.UsbDevice#run()
	 */
	public void run() {
	  System.out.println("webcam:正在获取连续图像，发送到显示器....");
	}

}
