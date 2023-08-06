package scrollingProductList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import basicWorkFlow.baseClass;

public class longPressOnTermsCondi extends baseClass{

	public longPressOnTermsCondi() 
	{
		super();
	}
	
	public void longPr()
	{
		WebElement element = androidDriver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		
		((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 2000));
	}

}
