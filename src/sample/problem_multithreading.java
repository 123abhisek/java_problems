package sample;

/*Problem: Thread Creation 

Create a Java program that utilizes the Thread class to print the numbers from 1
to 10. Implement this by extending the Thread class. Also, create a Runnable 
interface implementation that achieves the same result. Ensure proper 
synchronization to avoid race conditions.*/

// using Thread Class
/*
  class MyThreadClass1 extends Thread{
  
  public void run() { for(int i=1;i<=10;i++) { if(i % 2 != 0) {
  System.out.println("Thread 1 : "+i); try {Thread.sleep(1000);}catch(Exception
  e) {}; } } }
  
  }
  
  class MyThreadClass2 extends Thread{
  
  public void run() { for(int i=1;i<=10;i++) { if(i % 2 == 0) {
  System.out.println("Thread 2 : "+i); try {Thread.sleep(1000);}catch(Exception
  e) {}; } } }
  
  }
  
  public class problem_multithreading {
  
  public static void main(String[] args) {
  
  MyThreadClass1 obj1 = new MyThreadClass1(); MyThreadClass2 obj2 = new
  MyThreadClass2();
  
  obj1.start(); try {Thread.sleep(100);}catch(Exception e) {}; obj2.start();
  
  }
  
  }
 */

// Using Runnable Interface

//class MyThreadClass1 implements Runnable {
//
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0) {
//				System.out.println("Thread 1 : " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//				;
//			}
//		}
//	}
//}
//
//class MyThreadClass2 implements Runnable {
//
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println("Thread 2 : " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//				;
//			}
//		}
//	}
//}

//public class problem_multithreading {
//
//	public static void main(String[] args) {
//
////		MyThreadClass1 obj1 = new MyThreadClass1();
////		MyThreadClass2 obj2 = new MyThreadClass2();
////
////		Thread t1 = new Thread(obj1);
////		Thread t2 = new Thread(obj2);
////		
////		t1.start();
////		try {
////			Thread.sleep(100);
////		} catch (Exception e) {
////		}
////		t2.start();
//
//		// using Lambda Expression
//
//		Thread t1 = new Thread(() -> {
//			for (int i = 1; i <= 10; i++) {
//				if (i % 2 != 0) {
//					System.out.println("Thread 1 : " + i);
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {
//					}
//					;
//				}
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			for (int i = 1; i <= 10; i++) {
//				if (i % 2 == 0) {
//					System.out.println("Thread 2 : " + i);
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {
//					}
//					;
//				}
//			}
//		});
//
//		t1.start();
//		try {
//			Thread.sleep(100);
//		} catch (Exception e) {
//		}
//		t2.start();
//
//	}
//
//}

/*
Problem: Runnable with Lambda Expression 
Write a Java program using the Runnable interface and lambda expression to 
create three threads. Each thread should print "Hello from Thread-X" where X is the
thread number (1, 2, or 3). Ensure proper synchronization.
*/

/*
  public class problem_multithreading {
  
  public static void main(String[] args) {
  
  Thread t1 = new Thread(() -> { System.out.println("Hello from Thread - 1");
  try { Thread.sleep(1000); } catch (Exception e) { } });
  
  Thread t2 = new Thread(() -> { System.out.println("Hello from Thread - 2");
  try { Thread.sleep(1000); } catch (Exception e) { } });
  
  Thread t3 = new Thread(() -> { System.out.println("Hello from Thread - 3");
  try { Thread.sleep(1000); } catch (Exception e) { } });
  
  t1.start(); try { Thread.sleep(100); } catch (Exception e) { } t2.start();
  try { Thread.sleep(100); } catch (Exception e) { } t3.start();
  
  } }
 */

/*Problem: Thread Join 
Create a Java program that demonstrates the use of the join method. Implement 
two threads where the second thread waits for the completion of the first thread. 
Print a message before and after the join to indicate the thread's execution.
*/
/*
  public class problem_multithreading {
  
  public static void main(String[] args) throws Exception {
  
  Thread t1 = new Thread(() -> { System.out.println("Thread 1 is running"); try
  { Thread.sleep(1000); } catch (Exception e) { }
  
  System.out.println("Thread 1 is finished"); });
  
  Thread t2 = new Thread(() -> {
  System.out.println("Thread 2 is waiting for Thread 1 to finish "); try {
  Thread.sleep(1000); } catch (Exception e) { }
  
  System.out.println("Thread 2 can now proceed"); });
  
  t1.start();
  
  t2.start(); } }
 */

/*Problem: Thread Priority 
Write a Java program with three threads having different priorities. Demonstrate
the impact of thread priorities on execution by printing messages in each thread's 
run method. Use Thread.MAX_PRIORITY, Thread.NORM_PRIORITY, and Thread.MIN_PRIORITY*/

//public class problem_multithreading {
//
//	public static void main(String[] args) throws Exception {
//
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Thread with MAX_RIORITY is running");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Thread with NORM_RIORITY is running");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//
//			}
//		});
//
//		Thread t3 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Thread with MIN_RIORITY is running");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//
//			}
//		});
//
//		t1.start();
//		try {
//			Thread.sleep(100);
//		} catch (Exception e) {
//		}
//		t2.start();
//		try {
//			Thread.sleep(100);
//		} catch (Exception e) {
//		}
//		t3.start();
//
//	}
//}

/*
  Develop a Java program that checks if a thread is alive or not. Create a
  thread that sleeps for a random duration and then prints whether it is alive
  or not. Main thread should wait for the child thread to finish before
  printing a final message.
  
 */

/*
  public class problem_multithreading {
  
  public static void main(String[] args) throws Exception {
  
  Thread t1 = new Thread(new Runnable() {
  
  @Override public void run() { System.out.println("Thread is sleeping .. ");
  try {Thread.sleep(1000);}catch(Exception e) {}
  System.out.println("Thread is finished"); } });
  
  t1.start(); System.out.println("Thread is alive : "+ t1.isAlive() ); } }
 */

/*Problem: Synchronized Method 
Implement a simple counter program using multiple threads without 
synchronization. Then modify the program to use the synchronized keyword on the 
increment method to ensure thread safety.*/

class Counter1 {
	int count;

	public synchronized void increment() {
		count += 1;
	}
}

public class problem_multithreading {

	public static void main(String[] args) throws Exception {

		Counter1 c1 = new Counter1();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 2000; i++) {
					c1.increment();
				}
				
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 2000; i++) {
					c1.increment();
				}
				
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(c1.count);

	}
}