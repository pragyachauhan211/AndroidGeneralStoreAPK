package basicWorkFlow;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class baseClass {
	
	
	
	protected static AndroidDriver androidDriver;
	protected static RemoteWebDriver webDriverDriver;
	DesiredCapabilities cab;
	
	
	public void capabilities() throws Exception

	{
		cab = new DesiredCapabilities();
		cab.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cab.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 FE 5G");
		cab.setCapability("app", "C:\\Users\\pragy\\eclipse-workspace\\AndroidProjGeneralStoreAPK\\src\\test\\resources\\General-Store.apk");
		//cab.setCapability("appPackage", "com.androidsample.generalstore");
		//cab.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		cab.setCapability("ignoreHiddenApiPolicyError", "true");
		cab.setCapability("noReset", "true");
		cab.setCapability("setWebContentsDebuggingEnabled", "true");
		cab.setCapability("chromedriverExecutable","C:\\Users\\pragy\\eclipse-workspace\\AndroidProjGeneralStoreAPK\\Driver\\chromedriver.exe");
		//cab.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false)); 	
		androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cab);

		System.out.println("Application launched successfully.");
		
	//	androidDriver.get("google.com");
	    
	
	}
}
