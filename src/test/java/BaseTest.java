
import com.qabootcamp.pages.BasePage;
import config.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.qabootcamp.constants.FrameworkConstants;

public class BaseTest extends BasePage {


    @BeforeMethod
    public void setup() throws Exception {
        getDriver();
        System.out.println(System.getenv());
        String url = "http://"+System.getenv("host")+":3000";
        System.out.println(url);
        driver.get(url);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
