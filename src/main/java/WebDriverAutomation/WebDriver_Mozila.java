package WebDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriver_Mozila {
    public static void main(String[] args) {
        System.setProperty("Webdriver.gecko.driver","C:\\Software\\Driver\\geckodriver.exe");

        WebDriver driver =  new FirefoxDriver();
        driver.get("https://www.nopcommerce.com/en/demo");

    }
}
