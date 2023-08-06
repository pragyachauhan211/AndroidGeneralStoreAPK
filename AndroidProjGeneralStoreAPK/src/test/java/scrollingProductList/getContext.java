package scrollingProductList;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import basicWorkFlow.baseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.SupportsContextSwitching;

public class getContext extends baseClass{

	public getContext() 
	{
		super();
	}
	
	public void contextToWeb() throws InterruptedException
	{
		Set<String> handles = androidDriver.getContextHandles();
		androidDriver.context((String) handles.toArray()[1]);
		Thread.sleep(1000);
		System.out.println("After switching current context is: "+androidDriver.getContext());		
	}
	
	public void contextToNative() throws InterruptedException
	{
		Set<String> handles = androidDriver.getContextHandles();
		androidDriver.context((String) handles.toArray()[0]);
		Thread.sleep(1000);
		System.out.println("After switching current context is: "+androidDriver.getContext());		
	}

	
	

	
	
	
	
	

	

		

		 

		
}
