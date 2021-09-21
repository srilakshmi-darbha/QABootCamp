import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.pages.WelcomeBanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{

      @Test
       public void registerUser(){
          WelcomeBanner wb = new WelcomeBanner();
          wb.clickOnDismiss();
      }

}
