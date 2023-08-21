package com.thread.example;


class MyThread extends Thread{
	// Creating Constructor and passing Argument in Thread
	public MyThread(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	
	//This is Thread Method Used to write Thread Methods and logics
	@Override
	public void run() {
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Single thread excuted...");
			System.out.println("second thread excuted..");
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
		e.printStackTrace();
			}
		}
	}
	
}


public class ThreadEx1 {

	public static void main(String[] args) {
		MyThread m1=new MyThread(2);
		m1.start();
		MyThread m2=new MyThread(3);
		m2.start();
		//After EXcuting the Constructor main thread excuted
		//In every First excution the main thread will  be excuted
		
		System.out.println("Main thread is Excuted...");
		

	}

}
