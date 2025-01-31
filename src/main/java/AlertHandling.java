import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertHandling {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement element = driver.findElement(By.id("alertButton"));
        element.click();

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }
}
