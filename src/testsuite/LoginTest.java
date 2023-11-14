package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) throws InterruptedException {
        // Launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //Get baseUrl
        driver.get(baseUrl);
        //To maximize window
        driver.manage().window().maximize();
        // To implement implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Print the title of the page
        System.out.println(driver.getTitle());
        //Print the current url
        System.out.println(driver.getCurrentUrl());
        //Print the page source
        System.out.println(driver.getPageSource());
        //Enter email to email field
        Thread.sleep(6000);
        driver.findElement(By.id("user-name")).sendKeys("dhara123@gmail.com");
        // Enter password to password field
        driver.findElement(By.name("password")).sendKeys("Testing456");
        // click on login button
        driver.findElement(By.name("login-button")).click();
        //Print the current Url
        System.out.println(driver.getCurrentUrl());
        //Navigate base url
        driver.navigate().to(baseUrl);
        //Refresh the page
        driver.navigate().refresh();
        //Close the browser
        driver.close();

    }
}