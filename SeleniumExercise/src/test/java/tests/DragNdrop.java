package tests;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNdrop extends CommonAPI {

    @Test
    public void testDragNDrop() {
        sleepFor(2);
        Actions actions = new Actions(driver);
        WebElement from = getElement("//*[@id='credit2']/a");
        WebElement to = getElement("//*[@id='bank']/li");
        actions.dragAndDrop(from, to).build().perform();
        sleepFor(5);
    }

    @Test
    public void testDragNDropUsingCommonAPIMethod() {
        dragNdropByXpaths("//*[@id='credit2']/a", "//*[@id='bank']/li");
    }
}
