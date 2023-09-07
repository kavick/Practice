package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gautam");

    }
}
