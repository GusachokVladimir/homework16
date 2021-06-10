package HW16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        By auto = By.xpath("//a[text()='Авто']");
        By nedvizhimost = By.xpath("(//a[text()='Недвижимость'])[1]");
        By rabota = By.xpath("(//a[text()='Работа'])[1]");
        By uslug = By.xpath("(//a[text()='Услуги'])[1]");

        By lichnyeVeschi = By.xpath("(//a[text()='Личные вещи'])[1]");
        By transport = By.xpath("(//a[text()='Транспорт'])[1]");
        By rabota2 = By.xpath("(//a[text()='Работа'])[2]");

        String URL = "https://www.avito.ru/rossiya";


        System.setProperty("webdriver.chrome.driver", "E:\\Automation Test\\Soft\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get(URL);

            WebElement autoElement = (new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.presenceOfElementLocated(auto)));
            String autoPar = autoElement.getAttribute("pathname");
            System.out.println(autoPar);

            String autoParText = autoElement.getText();
            System.out.println(autoParText);


            WebElement nedvizhimostElement = driver.findElement(nedvizhimost);
            String nedvizhimostPar = nedvizhimostElement.getAttribute("pathname");
            System.out.println(nedvizhimostPar);

            String nedvizhimostParText = nedvizhimostElement.getText();
            System.out.println(nedvizhimostParText);


            WebElement rabotaElement = driver.findElement(rabota);
            String rabotaPar = rabotaElement.getAttribute("pathname");
            System.out.println(rabotaPar);

            String rabotaParText = rabotaElement.getText();
            System.out.println(rabotaParText);


            WebElement uslugElement = driver.findElement(uslug);
            String uslugPar = uslugElement.getAttribute("pathname");
            System.out.println(uslugPar);

            String uslugParText = uslugElement.getText();
            System.out.println(uslugParText);


            WebElement veschiElement = driver.findElement(lichnyeVeschi);
            String veschiPar = veschiElement.getAttribute("className");
            System.out.println("class=" + veschiPar);

            WebElement transportElement = driver.findElement(transport);
            String transportPar = transportElement.getAttribute("className");
            System.out.println("class=" + transportPar);

            WebElement rabotaElement2 = driver.findElement(rabota2);
            String rabotaPar2 = rabotaElement2.getAttribute("className");
            System.out.println("class=" + rabotaPar2);


        }finally {
            driver.quit();
        }
    }
}
