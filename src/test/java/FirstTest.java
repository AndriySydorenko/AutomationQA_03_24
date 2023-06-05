import config.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.List;

public class FirstTest extends BaseClass {
    static String mainUrl = "https://dnipro.ithillel.ua/";
    By coursesButton = By.xpath("//button[@data-dropdown-trigger=\"coursesMenu\"]");
    By allCategoiues = By.xpath("//*[@class=\"cats-list\"]/li");
    By frontEndBotton = By.xpath("//*[@id=\"block-202987\"]//p[text()=\"Front-end Basic\"]");
    By allCoaches = By.xpath("//*[@id=\"coachesSection\"]//li//p[@class=\"coach-card_name\"]");
    By showAllButton = By.id("coachesShowAllButton");
    By scoll = By.id("input-email-mailing");

    @BeforeClass
    public static void bFirstTest() {
        driver.get(mainUrl);
    }

    @Before
    public void beforeM() {
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }

    @Test
    public void pringCoursesTeacher() {
        driver.findElement(coursesButton).click();
        List<WebElement> list = driver.findElements(allCategoiues);
        for (WebElement e : list) {
            if (e.getText().trim().equals("Програмування")) {
                e.click();
                break;
            }
        }
        driver.findElement(frontEndBotton).click();
        Util.scrollToElementVisibilityOf(driver, showAllButton);
        driver.findElement(showAllButton).click();
        Util.scrollToElementVisibilityOf(driver, scoll);
        List<WebElement> l = driver.findElements(allCoaches);
        System.out.println("Викладачі курсу: ");
        for  (int i = 0; i < l.size(); i++) {
            System.out.println(i+1 + " : " + l.get(i).getText());
        }

    }
}

