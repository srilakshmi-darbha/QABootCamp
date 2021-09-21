import com.qabootcamp.pages.WelcomeBanner;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    @Test
    public void registerUser() {
        WelcomeBanner wb = new WelcomeBanner();
        wb.clickOnDismiss();
    }

}
