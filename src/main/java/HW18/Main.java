package HW18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://crossbrowsertesting.github.io/drag-and-drop";

        System.setProperty("webdriver.chrome.driver", "E:\\Automation Test\\Soft\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get(URL);

        DragNDrop dragNDrop = new DragNDrop();
        dragNDrop.task1(driver);
        dragNDrop.task2(driver);
        dragNDrop.task3(driver);
        dragNDrop.task4(driver);
        dragNDrop.pageDown(driver);

    }
}
