package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box/");

        List<WebElement> allelements = driver.findElements(By.tagName("input"));
        if(allelements.size() != 0){
            System.out.println("Number of elements = "+allelements.size());

            for(WebElement element : allelements){
                System.out.println(element.getAttribute("placeholder"));
            }
        }

    }
}
