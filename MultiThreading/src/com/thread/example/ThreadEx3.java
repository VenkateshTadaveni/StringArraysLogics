package com.thread.example;

 class ThreadEx3 implements Runnable {
  
	@Override
	public void run() {
		System.out.println("Implements Runnable Interface...");
		
		
	}
	public void run1() {
		System.out.println("long milliseconds");
		
	}


	public static void main(String[] args) {
		
		Runnable runnable=new ThreadEx3();
		Thread t2=new Thread(runnable);
		Thread t3=new Thread("This is t3 thread...");
	
		//Thread t1=new Thread(runnable,"This Is passing String Thread");	
		t2.start();
		t3.start();
		ThreadEx3 ex3=new ThreadEx3();
		
		//String str=t2.getName();
		//System.out.println(str);
		boolean flag =t2.isAlive();
		try {
		
			t2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex3.run1();
		int n=t2.getPriority();
		StackTraceElement[] arr=t2.getStackTrace();
	
	System.out.println(n);
	System.out.println(arr);
	System.out.println(flag);
    try {
		t3.join(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 String s=t3.getName();
	System.out.println(s);	
		
		
	
		
//		Thread thread=new Thread("Venkatesh This is Thread...");
//		thread.start();
//		String s =thread.getName();
//System.out.println(s);
	}

}
