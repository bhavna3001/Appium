package Calculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorTest { 


    public AppiumDriver<MobileElement> driver;


    @Test
    public void launchCalc() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi");
        cap.setCapability("udid", "c2c34e1d7d28");
        cap.setCapability("platformName","Android" );
        cap.setCapability("platformVersion","8.1.0");


        cap.setCapability("appPackage","com.miui.calculator");
        cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");

        driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }




}
