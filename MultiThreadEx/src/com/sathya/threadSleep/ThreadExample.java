package com.sathya.threadSleep;

class Mythread extends Thread
{
	int n;

	public Mythread(int n) {
	this.n = n;
	}
	@Override
	public synchronized void  run() {
		for(int i=1;i<=10;i++) {
		 System.out.println(n+"*"+i+"="+n*i);
		 try {Thread.sleep(1000);} 
		 catch (InterruptedException e)
		 {e.printStackTrace();}
		
	}
		
}

	
}
public class ThreadExample {

	public static void main(String[] args) {
   Mythread t1 =new Mythread(5);
        t1.start();
        System.out.println("thread is working");
        Mythread t2=new Mythread(10);
        t2.start();
	}

}


