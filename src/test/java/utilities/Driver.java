package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    /*
    POM'de Driver icin TestBase classs'ina extends etmek yerine
    Driver class'indan static method'lar kullanarak
    driver oplusturup ilgili ayarlarin yapilmasi
    ve en sonda driver'in kapatilmasi tercih edilmistir

    POM'de Driver class'indaki getDriver()'na obje olusturularak kullanilmasini
    engellemek icin
    Singleton pattern kullanimi benimsenmistir

    Singleton Pattern : tekli kullanim, bir class'in farklli classlardan
    obje olusturularak kullanimini engellemek icin kullanilir.

    Bunu saglamak icin yapmamaiz gereken sey oldukca basit
    obje olusturmak icin kullanilan constructor'i private yaptiginizda
    baska class'larda Driver class'indan obje olusturulmasi mumkun OLMAZ
     */
    private Driver(){

    }

     static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null) {
            switch(ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }



            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        return driver;
    }

    public static void closeDriver(){

        if (driver!=null) { // driver'a deger atanmissa
            driver.close(); // driver'i kapat
            driver=null;  // driver'a null atamasi sonraki acmalarda sorun olmamasi icin
        }

    }

}
