package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page012;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class medunnad {
    Page012 signInPage=new Page012();
    @Given("kulanici medunna sitesine gider")
    public void kulaniciMedunnaSitesineGider() {

        Driver.getDriver().get("https://www.medunna.com");

    }

    @And("kulanici giris yapar")
    public void kulaniciGirisYapar() {



        Actions actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("MedunnaUrl"));
        signInPage.SignInIcon.click();
        signInPage.ilkSignIn.click();
        ReusableMethods.waitForVisibility(signInPage.Username,4);
        signInPage.Username.sendKeys(ConfigReader.getProperty("DoktorUsernamea"));
        actions.sendKeys(Keys.TAB).perform();
        signInPage.Password.sendKeys(ConfigReader.getProperty("DoktorPassworda"));
        signInPage.ikinciSignIn.click();




    }

    @And("kulanici giris yaptigini dogrular")
    public void kulaniciGirisYaptiginiDogrular() {

        Assert.assertTrue(signInPage.benim_sayfam_secenegi.isDisplayed());
        System.out.println("===================   basarili ======================");
        System.out.println("denemeee");



    }
}
