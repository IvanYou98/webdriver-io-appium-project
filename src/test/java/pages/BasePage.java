package pages;

import com.google.common.collect.ImmutableList;
import drivers.DriverFactory;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage {
    protected IOSDriver driver;

    public BasePage() {
        driver = DriverFactory.getIOSDriver();
        PageFactory.initElements(driver, this);
    }

    public void swipe(Point start, Point end, Duration duration) {
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence actions = new Sequence(input, 0)
                .addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y))
                .addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y))
                .addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(actions));
    }

    public void dragAndDrop(WebElement draggable, WebElement droppable, Duration duration) {
        swipe(getCenter(draggable), getCenter(droppable), duration);
    }

    protected static Point getCenter(WebElement element) {
        Point location = element.getLocation();
        Dimension size = element.getSize();
        return new Point(location.x + size.getWidth() / 2, location.y + size.getHeight() / 2);
    }
}
