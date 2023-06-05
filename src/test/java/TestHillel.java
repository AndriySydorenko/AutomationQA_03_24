import config.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestHillel extends BaseClass {
    static String mainUrl = "https://ithillel.ua/";
    static By consultButon = By.id("btn-consultation-hero");
    static By nameField = By.id("input-name-consultation");
    static By emailFiield = By.id("input-email-consultation");
    static By phoneNubler = By.id("input-tel-consultation");
    static By tgButton = By.xpath("//button[@data-name='tg']");
    static By tgField = By.xpath("//input[@name=\"tg\"]");
    static By marketingCheckbox = By.xpath("//form[@id='form-consultation']/descendant::span[@class='checkbox_checkmark']");
    static By selectCourseBt = By.id("listbox-btn-input-course-consultation");
    static By allCourses = By.xpath("//*[@class='listbox_opt-list -scrollbar']/li");

    public static void main(String[] args) throws InterruptedException {
        driver.get(mainUrl);
        driver.findElement(consultButon).click();
        driver.findElement(nameField).sendKeys("Andrii Sydorenko");
        driver.findElement(emailFiield).sendKeys("a.sydorenko9595@gmail.com");
        driver.findElement(phoneNubler).sendKeys("936255436");
        driver.findElement(tgButton).click();
        driver.findElement(tgField).sendKeys("https://t.me/Andrii_Sy");
        Thread.sleep(1000); // додав паузу тому що після натисканання на телеграм батон форма зміює розмір

        driver.findElement(selectCourseBt).click();
        List<WebElement> list = driver.findElements(allCourses);
        for (WebElement e : list) {
            if (e.getText().trim().equals("QA Automation — Java")){
                e.click();
                break;
            }
        }
        driver.findElement(marketingCheckbox).click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testHillel() throws InterruptedException {
        driver.get(mainUrl);
        driver.findElement(consultButon).click();
        driver.findElement(nameField).sendKeys("Andrii Sydorenko");
        driver.findElement(emailFiield).sendKeys("a.sydorenko9595@gmail.com");
        driver.findElement(phoneNubler).sendKeys("936255436");
        driver.findElement(tgButton).click();
        driver.findElement(tgField).sendKeys("https://t.me/Andrii_Sy");
//        Thread.sleep(1000); // додав паузу тому що після натисканання на телеграм батон форма зміює розмір

        driver.findElement(selectCourseBt).click();
        List<WebElement> list = driver.findElements(allCourses);
        for (WebElement e : list) {
            if (e.getText().trim().equals("QA Automation — Java")){
                e.click();
                break;
            }
        }
        driver.findElement(marketingCheckbox).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
