package drivers;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    private static final ThreadLocal<IOSDriver> iosDriverThreadLocal = new ThreadLocal<>();

    public static IOSDriver getIOSDriver() {

        if (iosDriverThreadLocal.get() == null) {
            XCUITestOptions options = new XCUITestOptions();
            options.setDeviceName("iPhone 15 Pro")
                    .setPlatformVersion("17.0")
                    .setBundleId("org.wdioNativeDemoApp");
            IOSDriver iosDriver = null;
            try {
                iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            iosDriver.hideKeyboard();
            iosDriverThreadLocal.set(iosDriver);
        }
        return iosDriverThreadLocal.get();
    }

    public static void tearDownDriver() {
        if (iosDriverThreadLocal.get() != null) {
            iosDriverThreadLocal.get().quit();
            iosDriverThreadLocal.remove();
        }
    }



}
