package HW17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Controler {
    By searchLocator = By.xpath("//input[@class='gLFyf gsfi']");
    By advertisementLocator = By.xpath("//div[@id='tvcap']//div[@class='uEierd']");
    By firstUrlLocator = By.xpath("(//div[@class='yuRUbf']//h3[@class='LC20lb DKV0Md'])[1]");

    String URL = "https://www.google.com/";
    WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Test\\Soft\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

        WebElement searchElement = driver.findElement(searchLocator);
        searchElement.sendKeys("курсы программирования", Keys.ENTER);

        readPage();
    }

    public void readPage() {

        List<WebElement> advertisement = driver.findElements(advertisementLocator);
        System.out.println(advertisement.size());

        WebElement firstUrlElement = (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(firstUrlLocator)));
        String firstUrlText = firstUrlElement.getText();
        System.out.println(firstUrlText);
        firstUrlElement.click();
        String title = driver.getTitle();
        System.out.println(title);

        driver.navigate().back();
    }

    public void handlePage(By by){
        WebElement pages = driver.findElement(by);
        pages.click();
        readPage();
    }

    public void quit() {
        driver.quit();
    }
}
