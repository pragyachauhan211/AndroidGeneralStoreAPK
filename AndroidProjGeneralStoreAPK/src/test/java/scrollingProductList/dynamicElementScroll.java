package scrollingProductList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basicWorkFlow.baseClass;

public class dynamicElementScroll extends baseClass{

	public dynamicElementScroll() 
	{
		super();
	}
	
	public void iterateProd(List<WebElement> element, List<WebElement> prodName, String name)
	{
		//int count = androidDriver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).size();
		int count = element.size();
		
		for(int i=0; i<count; i++)
		{
			
		String prodNameString =	 prodName.get(i).getText();
			//String prodNameString1	= prodName.get(i).getText();
			
		if(prodNameString.equalsIgnoreCase(name))
		{
			androidDriver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		    break;
		}
					
		}
	}

}
