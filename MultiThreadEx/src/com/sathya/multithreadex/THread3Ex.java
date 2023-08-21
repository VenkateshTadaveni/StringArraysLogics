package com.sathya.multithreadex;

class MyThread123 extends Thread{
	int n;

	public MyThread123(int n) {
		this.n = n;
	}
 @Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			//int sum = n * i;
			System.out.println(n+ "*" +i + "=" +n*i);
		 try {
			 Thread.sleep(1000);}
		 catch (InterruptedException e) {
			 e.printStackTrace();}
	}
}


}





public class THread3Ex {

	public static void main(String[] args) {
		MyThread123 t1 = new MyThread123(5);
		t1.start();
//		MyThread t2 = new MyThread(10);
//		t2.start();
//		
	}

}



