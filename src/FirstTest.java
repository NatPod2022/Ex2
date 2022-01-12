import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.junit.After;



public class  FirstTest{

    private AppiumDriver driver;
    @Before
    public void setup() throws Exception
    {

        DesiredCapabilities capabilities= new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","and80");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity",".main.MainActivity");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","C:/Users/Natalia/OneDrive/Рабочий стол/JavaAppiumAutomation/apk/org.wikipedia.apk");

        driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
    @Test

    public void firstTest()
    {
        System.out.println("First test run");
    }

}
