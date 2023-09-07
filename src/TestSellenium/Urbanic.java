package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Urbanic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver,10); // Wait up to 10 seconds


        driver.get("https://in.urbanic.com/");

        //Maximizing window
        driver.manage().window().maximize();
        WebElement meTab = driver.findElement(By.xpath("//a[contains(text(),'Me')]"));
        meTab.click();

        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Login.Sign up')]"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement googleButton = driver.findElement(By.xpath("//div[@class='half-bottom']//div[@class='btn-box']/..//button[@id='gglogin']"));
        googleButton.click();



        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement id = driver.findElement(By.xpath("//div[@class='OabDMe cXrdqd Y2Zypf']//preceding::div[contains(text(),'Email or phone')]"));
        Thread.sleep(2000);

        id.click();
        id.sendKeys("ktondwal.10@gmail.com");

        WebElement nextButton =driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        nextButton.click();

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(2000);
        password.sendKeys("#Kapil1996");



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }
}
