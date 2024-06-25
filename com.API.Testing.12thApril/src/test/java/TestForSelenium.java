import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestForSelenium {
@Test
    public static void launchbrowser()
    {

      //  ChromeOptions options = new ChromeOptions();
      //  options.addArguments("start-maximized");
      //  options.addArguments("--no-sandbox");
      //  options.addArguments("disable-infobars");
       // options.addArguments("--disable-extensions");
      //  options.addArguments("--disable-gpu");
     //   options.addArguments("--disable-dev-shm-usage");
       // System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
