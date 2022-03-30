package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.id("logo");
    private By clickSignInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
   private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");

    //SignIn page
    private By userName = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By emailField2 = By.xpath("//input[@ng-model='Email']");
    private By pressEnterButton = By.id("enterbtn");




    private HomePage() {

    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();

    }


    public void clickSignInButton() {
        LOG.info("Click sign in button");
        driver.findElement(clickSignInButton).click();

    }

    public void clickSkipSignInButton() {
        LOG.info("ClickSkipSignInButton");
        driver.findElement(skipSignInButton).click();
    }

    public void clickBack() {
        LOG.info("Click the browser back button");
        driver.navigate().back();
    }

    public void checkEmailField(String email) {
        LOG.info("Check email field");
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickNextButton(){
        LOG.info("Click Next button");
        driver.findElement(nextButton).click();
    }


    public void checkPasswordField(String password) {
        LOG.info("Check password field");
        driver.findElement(passwordField).sendKeys(password);
    }
    public void insertEmail(){
        LOG.info("Insert email field");
        driver.findElement(emailField2).sendKeys("abcd@.com");
    }


}





