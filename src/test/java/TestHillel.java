import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestHillel extends BaseClass {
    static String url = "https://ithillel.ua/";
    static String helpButton = "btn-consultation-hero";
    static String nameField = "input-name-consultation";
    static String emailFiield = "input-email-consultation";
    static String phoneNubler = "input-tel-consultation";
    static String tgButton = "//button[@data-name='tg']";
    static String tgField = "//input[@name=\"tg\"]";
    static String marketingCheckbox = "//form[@id='form-consultation']/descendant::span[@class='checkbox_checkmark']";
    static String selectCourseBt = "listbox-btn-input-course-consultation";
    static String allCourses = "//*[@class='listbox_opt-list -scrollbar']/li";

    public static void main(String[] args) throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id(helpButton)).click();
        driver.findElement(By.id(nameField)).sendKeys("Andrii Sydorenko");
        driver.findElement(By.id(emailFiield)).sendKeys("a.sydorenko9595@gmail.com");
        driver.findElement(By.id(phoneNubler)).sendKeys("936255436");
        driver.findElement(By.xpath(tgButton)).click();
        driver.findElement(By.xpath(tgField)).sendKeys("https://t.me/Andrii_Sy");
        Thread.sleep(1000); // додав паузу тому що після натисканання на телеграм батон форма зміює розмір

        driver.findElement(By.id(selectCourseBt)).click();
        List<WebElement> list = driver.findElements(By.xpath(allCourses));
        for (WebElement e : list) {
            if (e.getText().trim().equals("QA Automation — Java")){
                e.click();
                break;
            }
        }
        driver.findElement(By.xpath(marketingCheckbox)).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
