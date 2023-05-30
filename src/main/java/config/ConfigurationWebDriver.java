package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfigurationWebDriver {
   public static WebDriver driver = null;
static public WebDriver createDriver(WebDrivers webDrivers){
    switch (webDrivers){
        case CHROME -> createChrome();
        case CHROME_INCOGNITO -> createChromeIncignito();
    }
    return driver;
}

    private static void createChromeIncignito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}
