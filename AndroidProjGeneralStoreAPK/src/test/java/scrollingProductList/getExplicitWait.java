package scrollingProductList;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicWorkFlow.baseClass;

public class getExplicitWait extends baseClass{

	public getExplicitWait() 
	{
		super();
	}
	
	public void explicit()
	{
		// use explicit wait to reach to the CART screen
				WebElement cartTitleElement = androidDriver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title"));
				WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.attributeContains(cartTitleElement, "text", "Cart"));
				
				// get cart screen name title
				System.out.println(cartTitleElement.getText());
	}

}
