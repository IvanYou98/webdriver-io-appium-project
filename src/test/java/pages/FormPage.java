package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;


public class FormPage extends BasePage{
    public void typeInputField(String msg) {
        driver.findElement(AppiumBy.accessibilityId("text-input"))
                .sendKeys(msg);
    }

    public String getInputMsg() {
        return driver.findElement(AppiumBy.accessibilityId("input-text-result"))
                .getText();
    }


    public void clickOnSwitch() {
        driver.findElement(AppiumBy.accessibilityId("switch"))
                .click();
    }

    public String getTurnoffMsg() {
        return driver.findElement(AppiumBy.accessibilityId("switch-text"))
                .getText();
    }

    public void chooseFromDropdown(String optionName) {
        WebElement dropdownList = driver.findElement(AppiumBy.accessibilityId("text_input"));
        dropdownList.click();
        driver.findElement(AppiumBy.className("XCUIElementTypePickerWheel"))
                .sendKeys(optionName);
    }

    public String getDropdownSelection() {
        return driver.findElement(AppiumBy.accessibilityId("text_input")).getText();
    }


    public void clickActiveButton() {
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Active' AND accessible == true"))
                .click();
        driver.findElement(AppiumBy.accessibilityId("Ask me later"))
                .click();
    }

    public void clickDoneBtn() {
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'done_button'"))
                .click();
    }

}
