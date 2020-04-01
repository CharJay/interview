package com.charjay.thread.communication;

/**
 * http://blog.csdn.net/javazejian/article/details/50878665
 * 
 * @author taomk 2017年6月21日 下午3:41:51
 *
 */
public class JoinDemo {

	
	public static void main(String[] args) throws InterruptedException {
		join();
	}


	private static void join() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}) ;
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running2");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}) ;

		t1.start();
		t2.start();

		//等待线程1终止
		t1.join();

		//等待线程2终止
		t2.join();

		System.out.println("main over");
	}

}

