package TestCases;

import Base.DriverInit;
import Pages.RegisterPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterPageTest {

    @Test
    public void verifyRegisterPage() {
        new RegisterPage()
                .openRegisterPage()
                .verifyRegisterPage();
    }

    @Test
    public void verifyRegisterSuccess() {
        new RegisterPage()
                .openRegisterPage()
                .inputFirstName("nhan")
                .inputLastName("van")
                .inputPhone("123456")
                .inputEmail("test@gmail.com")
                .inputAddress1("84")
                .inputAddress2("12")
                .inputCity("HCM")
                .inputState("PN")
                .inputUsername("test202005201")
                .inputPassword("123456")
                .submit()
                .verifyRegisterSuccess();
    }
}
