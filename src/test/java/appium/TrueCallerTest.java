package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TrueCallerTest {
	static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	cap.setCapability(MobileCapabilityType.UDID, "c65975c9");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");	
	cap.setCapability("appPackage", "com.truecaller");
	cap.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");
	
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url, cap);
	
	MobileElement startapp = (MobileElement) driver.findElement(By.id("com.truecaller:id/nextButton"));
	startapp.click();
	
	MobileElement cancelbutton = (MobileElement) driver.findElement (By.id("android:id/button2"));
	cancelbutton.click();
	
	MobileElement Continuebutton = (MobileElement) driver.findElement (By.id("android:id/button1"));
	Continuebutton.click();
	
	MobileElement ContactAllow = (MobileElement) driver.findElement (By.id("com.android.permissioncontroller:id/permission_allow_button"));
	ContactAllow.click();
	
	MobileElement CallAllow = (MobileElement) driver.findElement (By.id("com.android.permissioncontroller:id/permission_allow_button"));
	CallAllow.click();
	
	MobileElement LogsAllow = (MobileElement) driver.findElement (By.id("com.android.permissioncontroller:id/permission_allow_button"));
	LogsAllow.click();
	
	MobileElement SmsDeny = (MobileElement) driver.findElement (By.id("com.android.permissioncontroller:id/permission_deny_button"));
	SmsDeny.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	MobileElement AcceptPolicy = (MobileElement) driver.findElement (By.id("com.truecaller:id/agreeButton"));
	AcceptPolicy.click();
	
	MobileElement Next1 = (MobileElement) driver.findElement (By.id("com.truecaller:id/next"));
	Next1.click();
	
	MobileElement Next2 = (MobileElement) driver.findElement (By.id("com.truecaller:id/next"));
	Next2.click();
	
	MobileElement Next3 = (MobileElement) driver.findElement (By.id("com.truecaller:id/next"));
	Next3.click();
	
	MobileElement Next4 = (MobileElement) driver.findElement (By.id("com.truecaller:id/next"));
	Next4.click();
	
	MobileElement SmsCancel = (MobileElement) driver.findElement (By.id("android:id/button2"));
	SmsCancel.click();
	
	MobileElement SpamMsg = (MobileElement) driver.findElement (By.id("android:id/button2"));
	SpamMsg.click();
	
	MobileElement GotIt = (MobileElement) driver.findElement (By.id("com.truecaller:id/next"));
	GotIt.click();
	
			
			

	}

}
