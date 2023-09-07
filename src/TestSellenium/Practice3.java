package TestSellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.SocketException;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu/");

        driver.manage().window().maximize();

        Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
        List<WebElement> menu = sel.getOptions();

        for(WebElement abc : menu){
            System.out.println(abc.getText());
        }

        sel.selectByIndex(4);

        sel.selectByValue("6");

        sel.selectByVisibleText("Magenta");

        driver.close();

    }

}
