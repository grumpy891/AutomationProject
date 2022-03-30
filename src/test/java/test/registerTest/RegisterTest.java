package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class RegisterTest extends BaseTest  {

    @Test
    public void testRegister(){
        homePage.clickSkipSignInButton();
        Assert.assertTrue(register.checkTitle(), "The title is not displayed");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("Strada Crizantemelor, Nr 407 J");
        register.setEmailAddress("email@address.com");
        register.phoneNo("+0749869986");
        register.setGenderMale();
        register.setHockey();
        register.setLanguages("Romanian");
        register.setSkills("Java");
        register.scrollToElement();
        register.setCountry("India");
        register.setDateOfBirth("1986", "February", "7");
        register.setPassword("parola", "parola");
        register.setChooseFile();
        register.clickSubmitButton();
    }
}
