package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static public WebDriver driver = ConfigurationWebDriver.createDriver(WebDrivers.CHROME_INCOGNITO);
}
