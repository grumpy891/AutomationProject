package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;



public class HomePageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed(){
        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        homePage.clickSignInButton();
        sleep(5 *1000L);
        homePage.clickBack();
        homePage.clickSkipSignInButton();
        homePage.clickBack();
        homePage.checkEmailField("adresa@email.com");
        sleep(5000);
        homePage.clickNextButton();
        homePage.clickBack();
        homePage.clickSignInButton();
        sleep(5000);
        homePage.signIn(userName:"Name", password:"Password");
        homePage.checkPasswordField("password");


    }
}
