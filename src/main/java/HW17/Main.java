package HW17;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<By> locatorsPages = new ArrayList<>();
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 2']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 3']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 4']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 5']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 6']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 7']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 8']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 9']"));
        locatorsPages.add(By.xpath("//tr[@jsname='TeSSVd']//a[@aria-label='Page 10']"));

        Controler controler = new Controler();
        controler.init();

        for (int i = 0; i < locatorsPages.size(); i++) {
            controler.handlePage(locatorsPages.get(i));
        }

        controler.quit();
    }
}

