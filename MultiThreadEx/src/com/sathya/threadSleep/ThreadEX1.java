package com.sathya.threadSleep;

import java.util.Arrays;
import java.util.List;

class MyrunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0)
				System.out.println("even no--> " + i);

		}
	}
}

class MyRunThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			boolean isprime = true;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isprime = false;
					break;

				}
			}
			if (isprime == true) {
				System.out.println("this is prime no " + i);
			} else {
				System.out.println("this is not prime--> " + i);
			}

		}
	}
}

class MyRunThread3 implements Runnable {

	@Override
	public void run() {
		List<String> names = Arrays.asList("santhosh", "kalyan", "Venky", "sai pawan", "shiva");
		for (String name : names) {
			System.out.println(name);
		}
	}
}

public class ThreadEX1 {

	public static void main(String[] args) {
		new Thread(new MyrunThread()).start();

		new Thread(new MyRunThread2()).start();
		new Thread(new MyRunThread3()).start();
		new Thread(() -> System.out.println("this is Lamda Thread")).start();

	}

}
