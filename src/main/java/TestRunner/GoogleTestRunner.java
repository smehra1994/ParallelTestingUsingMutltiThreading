package TestRunner;

import Threads.GoogleThread;

public class GoogleTestRunner {

	public static void main(String ar[]) {

		// top casting :Thread class is super class of googlethread
		// child class object can be referred by parent class object
		// below code is for launching 1 instance of both browsers

		Thread t1 = new GoogleThread("chrome thread", "chrome");
		Thread t2 = new GoogleThread("firefox thread", "firefox");

		System.out.println("threads started----------");

		t1.start();
		t2.start();

		// below code is for launching user defined number of instances of both browsers

		/*
		 * int chromeCount = Integer.parseInt(System.getProperty("chrome")); int
		 * firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		 * 
		 * System.out.println("total chrome : " + chromeCount + " and " +
		 * "total firefox : " + firefoxCount);
		 * 
		 * for (int i = 0, j = 0; i < chromeCount || j < firefoxCount; i++, j++) {
		 * System.out.println("threads started.....");
		 * 
		 * new GoogleThread("chrome thread", "chrome").start(); new
		 * GoogleThread("firefox thread", "firefox").start();
		 * 
		 * System.out.println("thread got ended...."); }
		 */
	}
}