import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HandlingCheckBox {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("vfb-6-2")).isDisplayed();

        WebElement element = driver.findElement(By.id("vfb-6-2"));

        if(!(element.isSelected())){
            element.click();
        }
    }
}
