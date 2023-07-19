package toastMessage;

import java.sql.Driver;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class toastMessage extends baseClass{

	public toastMessage() 
	{
		super();
	}
	
	public void toastDisplay() throws InterruptedException
	{
		Thread.sleep(4000);		
	
		//select gender
		androidDriver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		Thread.sleep(1000);
		
		//click on LET'S SHOP
		androidDriver.findElement(By.xpath("//android.widget.Button[@class='android.widget.Button']")).click();
		Thread.sleep(1000);
		
		// get the toast message
		String toastMessageString = androidDriver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name"); // for extracting toast
			System.out.println(toastMessageString);																						// message we use
																									// this with index
																									// value instead of
																							// using getText()
																									// method
		Thread.sleep(5000);
		
	}
	
}
