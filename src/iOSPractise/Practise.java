package iOSPractise;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Practise {
	static IOSDriver<IOSElement> driver ;


	public static IOSDriver<IOSElement> capabilities() throws IOException
	{
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
	    IOSDriver<IOSElement> swipe;
		DesiredCapabilities d = new DesiredCapabilities();
	    d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
	    d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	    d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
	    d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
	    d.setCapability(MobileCapabilityType.APP, "//Users//jdommasandra//Desktop//AutomationBuild//UIKitCatalog.app");
	    driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
