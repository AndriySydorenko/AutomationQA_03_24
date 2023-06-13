import config.BaseClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.FrontEndPF;

public class TestFrontEndPage extends BaseClass {
    private static FrontEndPF frontEndPage;
    static String mainUrl = "https://dnipro.ithillel.ua/courses/front-end-basic";

    @Before
    public void beforeM() {
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }

    @BeforeClass
    public static void bFirstTest() {
        driver.get(mainUrl);
        frontEndPage = PageFactory.initElements(driver, FrontEndPF.class);
    }

    @Test
    public void getTitle() {
        System.out.println(frontEndPage.getCourseTitle());
        assertEquals("Курс Front-end Basic", frontEndPage.getCourseTitle());
    }

    @Test
    public void getCourseRating() {
        System.out.println(frontEndPage.getCourseRate());
        assertEquals("5", frontEndPage.getCourseRate());
    }
@Test
    public void getCourseDescription(){
    System.out.println(frontEndPage.getCourseDescription());
}
@Test
    public void getCurseTeachers(){
    System.out.println(frontEndPage.getListCoachesNames());
}
}
