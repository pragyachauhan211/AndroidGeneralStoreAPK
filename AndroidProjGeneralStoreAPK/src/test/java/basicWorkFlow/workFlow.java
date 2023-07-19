package basicWorkFlow;

import java.sql.Driver;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class workFlow extends baseClass{

	public workFlow() 
	{
		super();
	}
	
	public void enterName() throws InterruptedException
	{
		Thread.sleep(4000);
		
		// enter name
		androidDriver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pragya");
		
		Thread.sleep(1000);
		
		androidDriver.hideKeyboard(); // keyboard get hidden
		
		Thread.sleep(1000);
		
		//select gender
		androidDriver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(1000);
		
		//click on country drop down
		androidDriver.findElement(By.id("android:id/text1")).click();
		
		Thread.sleep(1000);
		
		// scroll down until that web element(India is my text until where it has to be scrolled)
		androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		
		Thread.sleep(1000);
		
		// after scrolling down click on that option
		androidDriver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		
		Thread.sleep(1000);
		
		//click on LET'S SHOP
		androidDriver.findElement(By.xpath("//android.widget.Button[@class='android.widget.Button']")).click();
		Thread.sleep(5000);
		
		
		
	}
	
}
