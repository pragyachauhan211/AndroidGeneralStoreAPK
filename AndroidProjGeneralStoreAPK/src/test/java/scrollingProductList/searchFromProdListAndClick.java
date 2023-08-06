package scrollingProductList;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import basicWorkFlow.baseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.SupportsContextSwitching;

public class searchFromProdListAndClick extends baseClass{

	public searchFromProdListAndClick() 
	{
		super();
	}
	
	dynamicElementScroll obj = new dynamicElementScroll();
	getExplicitWait explicitObj = new getExplicitWait();
	getSumOfPriceOfProd sumObj = new getSumOfPriceOfProd();
	longPressOnTermsCondi longPrObj = new longPressOnTermsCondi();
	getContext contextObj = new getContext();
	
	String nameString;
	
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
		
		List<WebElement> addCart = androidDriver.findElements(By.id("com.androidsample.generalstore:id/productAddCart"));
		
		List<WebElement> prodNameList =	 androidDriver.findElements(By.id("com.androidsample.generalstore:id/productName"));
		
		nameString = "Jordan 6 Rings";
		
		obj.iterateProd(addCart, prodNameList, nameString); // click on AddCart of this product
		
		Thread.sleep(1000);
		
		nameString = "Jordan Lift Off";
		
		obj.iterateProd(addCart, prodNameList, nameString); // click on AddCart of this product
		
		Thread.sleep(1000);
		
		// click on add cart icon to view your selected product into the queue in CART screen
		androidDriver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		Thread.sleep(1000);
		
		// get cart screen name title
		explicitObj.explicit();		
		
		sumObj.sumPrice(); // get total sum of price of all products from add card screen
		
		Thread.sleep(1000);
		
		longPrObj.longPr(); // long press on terms and condition option
		Thread.sleep(1000);
		androidDriver.findElement(By.id("android:id/button1")).click(); // click on close button of
		                                                                // terms and condition
		Thread.sleep(1000);
		androidDriver.findElement(AppiumBy.className("android.widget.CheckBox")).click(); // tick on checkbox
		Thread.sleep(1000);
		androidDriver.findElement(AppiumBy.className("android.widget.Button")).click(); // click on button
		Thread.sleep(5000);
		
		contextObj.contextToWeb(); // switch to web context

		Thread.sleep(2000);
		androidDriver.findElement(By.name("q")).sendKeys("Pragya"); // enter pragya on hybrid chrome google search bar
		
		//androidDriver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Pragya"); // enter pragya on hybrid chrome google search bar
		Thread.sleep(1000);
		androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER); // press enter
		androidDriver.pressKey(new KeyEvent(AndroidKey.BACK)); // go back to your previous latest native screen
		
		contextObj.contextToNative(); // switch to native context
	}

	public static void main(String[] args) throws Exception {
		baseClass baseClass = new baseClass();
		baseClass.capabilities();
		searchFromProdListAndClick scrollObj = new searchFromProdListAndClick();
		scrollObj.scrollProdList();

	}

}
