package steps;

import drivers.DriverFactory;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;

public class BaseSteps {
    @After
    public void closeApp() {
        IOSDriver iosDriver = DriverFactory.getIOSDriver();
        iosDriver.terminateApp("org.wdioNativeDemoApp");
    }
}
