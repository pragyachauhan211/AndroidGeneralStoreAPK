package scrollingProductList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basicWorkFlow.baseClass;

public class getSumOfPriceOfProd extends baseClass{

	public getSumOfPriceOfProd() 
	{
		super();
	}
	
	public void sumPrice()
	{
		List<WebElement> priceList = androidDriver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	    double sum = 0;
	    
		for(int i=0; i<priceList.size(); i++)
		{
			String amountString = priceList.get(i).getText();
			Double total = Double.parseDouble(amountString.substring(1));
			sum = sum + total;
			
		}
		System.out.println("Sum is: "+sum);
	}

}
