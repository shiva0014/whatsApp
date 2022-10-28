package whatsApp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenWhatsAppWeb {
    WebDriver driver;

    @Test
    void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.whatsapp.com/");

        //Thread.sleep(16000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        for(int i = 1; i<=10;i++){
            WebElement a = driver.findElement(By.xpath("//*[@id='pane-side']/div[1]/div/div/div["+i+"]/div/div/div/div[2]/div[1]/div[1]/span"));
            String s = a.getText();
            if (s.equalsIgnoreCase("Mma Ji")) {
                System.out.println(s);
                a.click();
            }
        }
//        WebElement s = driver.findElement(By.xpath("//*[@id='app']/div/div/div[3]"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", s);//*[@id='pane-side']/div[1]/div/div
        WebElement d = driver.findElement(By.xpath("//*[@id='app']/div/div/div[3]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].remove()", d);
    }

}
