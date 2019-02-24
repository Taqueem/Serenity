package features.navigation;

import enums.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.NavigatingUser;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategory {

    @Steps
    NavigatingUser mark;
    @Managed
    WebDriver browser;

    @Before
    public void beforeTest(){
      //  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Driver\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver",
                "D:\\Selenium\\Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
     //   browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void shouldBeAbletoNavigatetoMotor(){

        //Given
        mark.isOnHomePage();

        //When
        mark.navigatesToCategory(Category.Motors);

        //Then
        mark.shouldSeePageTitle("eBay Motors: Auto Parts and Vehicles | eBay");
    }

}
