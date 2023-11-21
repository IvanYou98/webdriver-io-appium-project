package pages;

import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DragAndDropPage extends BasePage{
    public void dragAndDrop(WebElement draggable, WebElement droppable) {
        dragAndDrop(draggable, droppable, Duration.ofSeconds(1));
    }
}
