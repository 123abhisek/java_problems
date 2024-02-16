package sample;

// MultiThreading using Thread Class

/*
 * class Hi extends Thread { public void run() { for (int i = 0; i < 5; i++) {
 * System.out.println("Hi"); try { Thread.sleep(1000); } catch (Exception e) { }
 * } } }
 * 
 * class Hello extends Thread { public void run() { for (int i = 0; i < 5; i++)
 * { System.out.println("Hello"); try { Thread.sleep(1000); } catch (Exception
 * e) { } } } }
 * 
 * public class Practice_Multi_Threading {
 * 
 * public static void main(String[] args) {
 * 
 * Hi obj1 = new Hi(); Hello obj2 = new Hello();
 * 
 * obj1.start(); try { Thread.sleep(10); } catch (Exception e) { } obj2.start();
 * 
 * }
 * 
 * }
 */

//MultiThreading using Runnable Interface

//class Hi implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hi");
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
//		}
//	}
//}
//
//class Hello implements Runnable {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello");
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
//		}
//	}
//}
//
//public class Practice_Multi_Threading {
//
//	public static void main(String[] args) {
//
//		Hi obj1 = new Hi();
//		Hello obj2 = new Hello();
//
//		Thread t1 = new Thread(obj1);
//		Thread t2 = new Thread(obj2);
//		
//		t1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		}
//		t2.start();
//
//	}
//}

// MultiThreading using Lambda Expression

//public class Practice_Multi_Threading {
//
//	public static void main(String[] args) {
//
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hello");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		t1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		}
//		t2.start();
//
//	}
//}

// Join | isAlive method  

//public class Practice_Multi_Threading {
//
//	public static void main(String[] args) throws Exception {
//
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hello");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		t1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		}
//		t2.start();
//		
//		System.out.println(t1.isAlive());
//		// isAlive() method is used to check whether the thread is in running state or not ..
//		t1.join(); // Join() Method will make main thread to wait 
//		t2.join();
//		System.out.println(t1.isAlive());
//		System.out.println("Byee");
//
//	}
//}

// Thread Priority 

//public class Practice_Multi_Threading {
//
//	public static void main(String[] args) throws Exception {
//
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hello");
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//				}
//			}
//		});
//		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//
////		t1.setName("Hii Thread");
////		t2.setName("Hello Thread");
//
////		System.out.println(t1.getName());
////		System.out.println(t2.getName());
//
//		t1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		}
//		t2.start();
//
//		t1.join();
//		t2.join();
//		System.out.println(t1.isAlive());
//		System.out.println("Byee");
//
//	}
//}

// MutiThreading Synchronization

//class Counter1 {
//	int count;
//
//	public synchronized void increment() {
//		count++;
//	}
//}
//
//public class Practice_Multi_Threading {
//
//	public static void main(String[] args) throws Exception {
//
//		Counter1 c = new Counter1();
//
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//
//				for (int i = 0; i < 100; i++) {
//					c.increment();
//				}
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//
//				for (int i = 0; i < 100; i++) {
//					c.increment();
//				}
//			}
//		});
//
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println(c.count);
//	}
//
//}