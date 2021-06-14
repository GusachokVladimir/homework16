package HW18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    By dragLocator = By.id("draggable");
    By dropLocator = By.id("droppable");

    //Реализовать действие по перетягиванию элемента
    public void task1(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        WebElement elementDrag = driver.findElement(dragLocator);
        WebElement elementDrop = driver.findElement(dropLocator);

        Actions actions = new Actions(driver);
        actions
                .moveToElement(elementDrag)
                .clickAndHold()
                .moveToElement(elementDrop)
                .release()
                .build()
                .perform();

        Thread.sleep(2000);
        driver.navigate().refresh();

    }

    //Реализовать действие по перетягиванию элемента с задержкой в 2 секунды
    public void task2(WebDriver driver) throws InterruptedException {
        //Thread.sleep(1000);

        WebElement elementDrag = driver.findElement(dragLocator);
        WebElement elementDrop = driver.findElement(dropLocator);

        Actions actions = new Actions(driver);
        actions
                .moveToElement(elementDrag)
                .pause(2000)
                .clickAndHold()
                .moveToElement(elementDrop)
                .release()
                .build()
                .perform();

        Thread.sleep(2000);
        driver.navigate().refresh();
    }

    //Реализовать действие по перетягиванию элемента и одновременно зажать кнопку alt
    public void task3(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        WebElement elementDrag = driver.findElement(dragLocator);
        WebElement elementDrop = driver.findElement(dropLocator);

        Actions actions = new Actions(driver);
        actions
                .keyUp(Keys.ALT)
                .moveToElement(elementDrag)
                .clickAndHold()
                .moveToElement(elementDrop)
                .release()
                .build()
                .perform();

        Thread.sleep(2000);
        driver.navigate().refresh();

    }

    //Реализовать действие по перетягиванию элемента, через смещение по осям
    public void task4(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);

        WebElement elementDrag = driver.findElement(dragLocator);
        //WebElement elementDrop = driver.findElement(dropLocator);

        Actions actions = new Actions(driver);
        actions
                .dragAndDropBy(elementDrag, 150, 30)
                .build()
                .perform();

        Thread.sleep(2000);

    }

    public void pageDown(WebDriver driver) {
        driver.quit();
    }
}
