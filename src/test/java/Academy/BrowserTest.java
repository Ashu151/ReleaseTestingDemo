package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

    @Test
    public void getData() {
        System.out.println("Hello Guys");

        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the application
        driver.get("http://localhost:8080/webapp");

        // Verify the header text
        String text = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println(text);
        Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));

        // Close the browser
        driver.close();
    }
}
