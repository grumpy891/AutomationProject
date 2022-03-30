package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.register.Register;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }
    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }


}
