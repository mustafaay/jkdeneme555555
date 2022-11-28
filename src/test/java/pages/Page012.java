package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page012 {

public Page012(){

    PageFactory.initElements(Driver.getDriver(),this);




}



    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement benim_sayfam_secenegi;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement randevularim_secenegi;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement hasta_edit_buttonu;

    @FindBy(xpath ="//*[text()='Request A Test']")
    public WebElement test_isteme_buttonu;



    @FindBy(xpath = "(//*[@class='is-untouched is-pristine av-valid form-check-input'])[107]")
    public WebElement birinci_test_chekbox;

@FindBy(xpath = "//*[@id='1402']")
public WebElement ikinci_test_chekbox;

@FindBy(xpath = "//*[@id='1407']")
public WebElement ucuncu_test_chekbox;

@FindBy(xpath = "//*[@id='132796']")
public WebElement dorduncu_test_chekbox;

@FindBy(xpath = "//*[@id='1408']")
public WebElement besinci_test_chekbox;

@FindBy(xpath = "//*[@id='132793']")
public WebElement altinci_test_chekbox;

@FindBy(xpath = "//*[@id='1405']")
public WebElement yedinci_test_chekbox;


@FindBy(xpath = "//*[@id='1404']")
public WebElement sekizinci_test_chekbox;

@FindBy(xpath = "//*[@id='save-entity']")
public WebElement save_button;




    @FindBy(xpath = "//*[@class='dropdown nav-item']")
    public WebElement  SignInIcon;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement ilkSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement Username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public  WebElement ikinciSignIn;






}
