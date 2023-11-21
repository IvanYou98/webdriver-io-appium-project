package steps;

import drivers.DriverFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.DragAndDropPage;
import pages.HomePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DragAndDropSteps {
    @Given("I am on the drag and drop page")
    public void visitDragAndDropPage() {
        new HomePage().clickDragAndDropTab();
    }

    @When("I drag and drop some elements")
    public void dragAndDrop() throws Exception{
        IOSDriver driver = DriverFactory.getIOSDriver();
//        driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Drag'")).click();
        List<String> dragIds = new ArrayList<>(Arrays.asList("drag-l1", "drag-l2", "drag-l3"));
        List<String> dropIds = new ArrayList<>(Arrays.asList("drop-l1", "drop-l2", "drop-l3"));
        for (int i = 0; i < dragIds.size(); i++) {
            WebElement draggable = driver.findElement(AppiumBy.accessibilityId(dragIds.get(i)));
            WebElement droppable = driver.findElement(AppiumBy.accessibilityId(dropIds.get(i)));
            new DragAndDropPage().dragAndDrop(draggable, droppable);
        }
        Thread.sleep(2000);
    }
}
