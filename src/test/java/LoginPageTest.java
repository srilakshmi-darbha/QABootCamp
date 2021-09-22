import com.qabootcamp.pages.WelcomeBanner;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void registerUser() throws InterruptedException {
        WelcomeBanner wb = new WelcomeBanner();
        Thread.sleep(3000);
        wb.clickOnDismiss();
    }

}
