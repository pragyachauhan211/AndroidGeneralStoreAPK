package scrollingProductList;

import org.openqa.selenium.By;

import basicWorkFlow.baseClass;

public class dynamicElementScroll extends baseClass{

	public dynamicElementScroll() 
	{
		super();
	}
	
	public void iterateProd()
	{
		int count = androidDriver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).size();
	
		for(int i=0; i<count; i++)
		{
			
		String prodNameString =	 androidDriver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		
		if(prodNameString.equalsIgnoreCase("Jordan 6 Rings"))
		{
			androidDriver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		    break;
		}
					
		}
	}

}
