import drivers.DriverFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class Playground {
    public static void main(String[] args) throws Exception{
        IOSDriver driver = DriverFactory.getIOSDriver();
        driver.findElement(AppiumBy.accessibilityId("Login")).click();
        System.out.println();
        DriverFactory.tearDownDriver();
    }
}
