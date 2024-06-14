import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    
    public static void main(String[] args) {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Launch the application
        driver.get("http://example.com/login");
        
        // Find username and password input fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        // Enter username and password
        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");
        
        // Find and click the login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        
        // Verify successful login by checking for presence of welcome message
        WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        if(welcomeMessage.isDisplayed()) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        
        // Close the browser
        driver.quit();
    }
}
