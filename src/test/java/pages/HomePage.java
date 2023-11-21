package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    public void clickLoginTab() {
        driver.findElement(AppiumBy.accessibilityId("Login")).click();
    }

    public void clickFormTab() {
        driver.findElement(AppiumBy.accessibilityId("Forms")).click();
    }

    public void clickDragAndDropTab() {
        driver.findElement(AppiumBy.accessibilityId("Drag")).click();
    }



}
