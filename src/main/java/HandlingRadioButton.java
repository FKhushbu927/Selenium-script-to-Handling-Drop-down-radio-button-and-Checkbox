import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandlingRadioButton {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("vfb-7-1")).isDisplayed();

        WebElement element =driver.findElement(By.id("vfb-7-1"));

        if(!(element.isSelected())){
            driver.findElement(By.id("vfb-7-1")).click();
        }
        else {
            System.out.println("Radio Button is already selected");
        }





    }
}
