package com.thread.example;

public class ThreadDeadLockEx4Chrome {

	public static void main(String[] args) {
		final String n="hai";
		final String n1="hai hello";
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				synchronized (n) {
					System.out.println("this is resource 1..");
					
					synchronized (n1) {
						System.out.println("this is resource 2...");
						
					}
				}
			}
			
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				synchronized (n1) {
					System.out.println("this is resource2...");
					synchronized (n) {
						System.out.println("this is resource1...");
						
					}
				}
			}
			
		};
		t1.start();
		t2.start();
	
	}
}
	
	


	
//		  public static void main(String[] args) {  
//	    final String resource1 = "ratan jaiswal";  
//	    final String resource2 = "vimal jaiswal";  
//	    // t1 tries to lock resource1 then resource2  
//	    Thread t1 = new Thread() {  
//	      public void run() {  
//	          synchronized (resource1) {  
//	           System.out.println("Thread 1: locked resource 1");  
//	  
//	        //   try { Thread.sleep(100);} catch (Exception e) {}  
//	  
//	           synchronized (resource2) {  
//	            System.out.println("Thread 1: locked resource 2");  
//	           }  
//	         }  
//	      }  
//	    };  
//	  
//	    // t2 tries to lock resource2 then resource1  
//	    Thread t2 = new Thread() {  
//	      public void run() {  
//	        synchronized (resource2) {  
//	          System.out.println("Thread 2: locked resource 2");  
//	  
//	        // try { Thread.sleep(100);} catch (Exception e) {}  
//	  
//	          synchronized (resource1) {  
//	            System.out.println("Thread 2: locked resource 1");  
//	          }  
//	        }  
//	      }  
//	    };  
//	  
//	      
//	    t1.start();  
//	    t2.start();  
//	  }  
//	}       


	


