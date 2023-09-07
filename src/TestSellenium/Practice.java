package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class Practice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String actualUrl = "https://demoqa.com/browser-windows/";

        driver.get(actualUrl);

        driver.manage().window().maximize();

        String TitleName = driver.getTitle();
        System.out.println("Title is = " + TitleName);
        System.out.println("Title length is = " + TitleName.length());

        String url = driver.getCurrentUrl();

        if(url.equals(actualUrl)) {
            System.out.println("verified");
        } else
            {
                System.out.println("Wrong Url");
        }
        System.out.println("Current url = "+url);
        System.out.println("Actual url = "+actualUrl);

        String pageCode = driver.getPageSource();
        int pageSourceLength = pageCode.length();

        System.out.println("PageSource Lenght is = "+pageSourceLength);
        System.out.println("PageSource is = "+pageCode);

        Thread.sleep(5000);
        driver.findElement(By.id("windowButton")).click();

        driver.close();


    }

}
