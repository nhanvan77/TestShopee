package TestCases;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class HomePageTest {

    @Test
    public void verifyHomePage() {
        new HomePage()
                .openHomePage()
                .verifyTopMenuBar();
    }

    @Test
    public void verifyLoginSuccess() {
        new HomePage()
                .openHomePage()
                .login("shopeetest", "Shopee@2020")
                .verifyLoginSuccess();
    }

    @Test
    public void verifyOpenRegisterPage() {
        new HomePage()
                .openHomePage()
                .openRegisterPage();
        new RegisterPage()
                .verifyRegisterPage();
    }
}
