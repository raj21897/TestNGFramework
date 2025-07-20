package utilityClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseClass {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Driver session opened");
    }
    @AfterTest
    public void wrapup(){
            driver.close();
        System.out.println("driver closed");
    }
}
