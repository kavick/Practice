package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/login");

        //Maximizing window
        driver.manage().window().maximize();

        //Retrieving web page title
        String title = driver.getTitle();
        System.out.println("The page title is : " + title);

        //Locating web element
        WebElement uName = driver.findElement(By.xpath("//*[@id='userName']"));
        WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login']"));


        //Peforming actions on web elements
        uName.sendKeys("testuser");
        pswd.sendKeys("Password@123");
        loginBtn.click();

        //Putting implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        try {
//
//            //Locating web element
//            WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
//            //Validating presence of element
//            if (logoutBtn.isDisplayed()) {
//
//                //Performing action on web element
//                logoutBtn.click();
//                System.out.println("LogOut Successful!");
//            }
//        } catch (Exception e) {
//            System.out.println("Incorrect login....");
//        }

        //Closing browser session
        driver.quit();
    }
}
