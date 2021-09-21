
import config.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qabootcamp.constants.FrameworkConstants;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getDriverPath());
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        driver.get(ReadPropertyFile.getProperty("url"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
