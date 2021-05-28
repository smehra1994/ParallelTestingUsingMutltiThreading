package Threads;

import Pages.BasePage;
import Pages.GooglePage;

public class GoogleThread extends Thread {

		public String browserName;
		GooglePage googlePage;
		BasePage basePage;

		public GoogleThread(String threadName, String browserName) {
			super(threadName);     //using super constructor and whtever threadname u r using i'll pass it to Thread Class so it will automatically print in constructor
			this.browserName = browserName;
			googlePage = new GooglePage();
			basePage=new BasePage();
		}

		@Override
		public void run() {                         //run method in thread class

			System.out.println("thread -- started " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
				basePage.setUp(this.browserName);
				googlePage.googleSearchTest();
				//googlePage.setUp(this.browserName);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				googlePage.tearDown();
			}

			System.out.println("thread - ended " + Thread.currentThread().getName());
		}
}
