package Pages;

import Base.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class RegisterPage {
    public static final String url_RegisterPage = "http://newtours.demoaut.com/mercuryregister.php/";

    @FindBy(how = How.NAME, using = "firstName")
    WebElement input_firstName;

    @FindBy(how = How.NAME, using = "lastName")
    WebElement input_lastName;

    @FindBy(how = How.NAME, using = "phone")
    WebElement input_phone;

    @FindBy(how = How.NAME, using = "userName")
    WebElement input_email;

    @FindBy(how = How.NAME, using = "address1")
    WebElement input_address1;

    @FindBy(how = How.NAME, using = "address2")
    WebElement input_address2;

    @FindBy(how = How.NAME, using = "city")
    WebElement input_city;

    @FindBy(how = How.NAME, using = "state")
    WebElement input_state;

    @FindBy(how = How.NAME, using = "postalCode")
    WebElement input_postalCode;

    @FindBy(how = How.NAME, using = "country")
    WebElement select_country;

    @FindBy(how = How.NAME, using = "email")
    WebElement input_userName;

    @FindBy(how = How.NAME, using = "password")
    WebElement input_password;

    @FindBy(how = How.NAME, using = "confirmPassword")
    WebElement input_confirmPassword;

    @FindBy(how = How.NAME, using = "register")
    WebElement btn_submit;


    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage() {
        this.driver = DriverInit.driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    public RegisterPage openRegisterPage() {
        driver.get(url_RegisterPage);
        return this;
    }

    public RegisterPage verifyRegisterPage() {
        Assert.assertTrue(input_firstName.isDisplayed(), "Verify first name field displayed");
        Assert.assertTrue(input_lastName.isDisplayed(), "Verify last name field displayed");
        Assert.assertTrue(input_phone.isDisplayed(), "Verify phone field displayed");
        Assert.assertTrue(input_email.isDisplayed(), "Verify email field displayed");
        Assert.assertTrue(input_address1.isDisplayed(), "Verify address field displayed");
        Assert.assertTrue(input_address2.isDisplayed(), "Verify address field displayed");
        Assert.assertTrue(input_city.isDisplayed(), "Verify city field displayed");
        Assert.assertTrue(input_state.isDisplayed(), "Verify state field displayed");
        Assert.assertTrue(select_country.isDisplayed(), "Verify country field displayed");
        Assert.assertTrue(input_userName.isDisplayed(), "Verify username field displayed");
        Assert.assertTrue(input_password.isDisplayed(), "Verify password field displayed");
        Assert.assertTrue(input_confirmPassword.isDisplayed(), "Verify confirm password field displayed");
        Assert.assertTrue(btn_submit.isDisplayed(), "Verify submit button displayed");
        return this;
    }

    public RegisterPage inputFirstName(String text) {
        input_firstName.sendKeys(text);
        return this;
    }

    public RegisterPage inputLastName(String text) {
        input_lastName.sendKeys(text);
        return this;
    }

    public RegisterPage inputPhone(String text) {
        input_phone.sendKeys(text);
        return this;
    }

    public RegisterPage inputEmail(String text) {
        input_email.sendKeys(text);
        return this;
    }

    public RegisterPage inputAddress1(String text) {
        input_address1.sendKeys(text);
        return this;
    }

    public RegisterPage inputAddress2(String text) {
        input_address2.sendKeys(text);
        return this;
    }

    public RegisterPage inputCity(String text) {
        input_city.sendKeys(text);
        return this;
    }

    public RegisterPage inputState(String text) {
        input_state.sendKeys(text);
        return this;
    }

    public RegisterPage inputPostalCode(String text) {
        input_postalCode.sendKeys(text);
        return this;
    }

    public RegisterPage inputUsername(String text) {
        input_userName.sendKeys(text);
        return this;
    }

    public RegisterPage inputPassword(String text) {
        input_password.sendKeys(text);
        input_confirmPassword.sendKeys(text);
        return this;
    }

    public RegisterPage submit() {
        btn_submit.click();
        return this;
    }

    public RegisterPage verifyRegisterSuccess() {
        return this;
    }

}
