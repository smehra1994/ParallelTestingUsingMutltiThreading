package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
	
	//page actions:
		public void googleSearchTest(){
			
		    WebElement e1=driver.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi' and text()='Sign in']"));
			e1.click();
			
			/*
			 * WebElement e1=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			 * e1.clear(); WebElement
			 * e2=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			 * e2.sendKeys("naveen automationlabs"); WebElement
			 * e3=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")); e3.submit();
			 */
			//WebElement a=driver.findElements(By.xpath("//h3"));
		}
		
		public void tearDown(){
			driver.quit();
		}

}
