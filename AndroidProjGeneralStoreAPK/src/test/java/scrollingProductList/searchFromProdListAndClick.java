package scrollingProductList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicWorkFlow.baseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;

public class searchFromProdListAndClick extends baseClass{

	public searchFromProdListAndClick() 
	{
		super();
	}
	
	dynamicElementScroll obj = new dynamicElementScroll();
	getExplicitWait explicitObj = new getExplicitWait();
	
	public void scrollProdList() throws InterruptedException
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
		
		Thread.sleep(2000);
		
		// scroll down until that web element(Jordan 6 Rings is my text until where it has to be scrolled)
		androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		
		Thread.sleep(1000);
		
		// click on add card to add into cart list		
		obj.iterateProd();
		
		Thread.sleep(1000);
		
		// click on add cart icon to view your selected product into the queue in CART screen
		androidDriver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		// get cart screen name title
		explicitObj.explicit();
		
		
	}

	public static void main(String[] args) throws Exception {
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		searchFromProdListAndClick scrollObj = new searchFromProdListAndClick();
		scrollObj.scrollProdList();

	}

}
