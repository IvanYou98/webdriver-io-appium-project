package pages;

import io.appium.java_client.AppiumBy;

public class LoginPage extends BasePage{

    public void enterEmail(String email) {
        driver.findElement(AppiumBy.accessibilityId("input-email"))
                .sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(AppiumBy.accessibilityId("input-password"))
                .sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'LOGIN' AND accessible = true"))
                .click();
    }
    public void closePopWindow() {
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
    }

}
