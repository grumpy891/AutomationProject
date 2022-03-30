package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://WEBDRIVERS/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://demo.automationtesting.in/Index.html";
        driver.get(url);
        LOG.info("Open browser");
        driver.manage().window().maximize();
        LOG.info("Click the browser back button");
        driver.navigate().back();
    }

    public static void tearDown() {
        LOG.info("Close the Browser");
        driver.quit();

    }
    public static void sleep(long ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String returnBaseUrl(){
        return "http://demo.automationtesting.in/Index.html";
    }

    public static String getBaseUrl(){
        String baseUrl = returnBaseUrl();
        if (baseUrl != null){
            return baseUrl.replace("Index.html", "");
        }
        return baseUrl;
    }

}


