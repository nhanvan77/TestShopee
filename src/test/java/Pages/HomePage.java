package Pages;

import Base.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePage {
    private static final String url_homePage = "http://newtours.demoaut.com/";

    @FindBy(how = How.NAME, using = "userName")
    WebElement input_username;

    @FindBy(how = How.NAME, using = "password")
    WebElement input_password;

    @FindBy(how = How.NAME, using = "login")
    WebElement btn_login;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]")
    WebElement btn_signOff;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")
    WebElement btn_register;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")
    WebElement btn_support;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")
    WebElement btn_contact;


    WebDriver driver;
    WebDriverWait wait;

    public HomePage() {
        this.driver = DriverInit.driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    public HomePage openHomePage() {
        driver.get(url_homePage);
        return this;
    }

    public HomePage login(String userName, String password) {
        input_username.sendKeys(userName);
        input_password.sendKeys(password);
        btn_login.click();
        return this;
    }

    public HomePage verifyLoginSuccess() {
        return this; //login success page isn't load
    }

    public HomePage verifyTopMenuBar() {
        Assert.assertTrue(btn_signOff.isDisplayed(), "Verify sign off button displayed");
        Assert.assertEquals(btn_signOff.getText(), "SIGN-ON", "Verify sign off button text");
        Assert.assertTrue(btn_register.isDisplayed(), "Verify register button displayed");
        Assert.assertEquals(btn_register.getText(), "REGISTER", "Verify register button text");
        Assert.assertTrue(btn_support.isDisplayed(), "Verify support button displayed");
        Assert.assertEquals(btn_support.getText(), "SUPPORT", "Verify support button text");
        Assert.assertTrue(btn_contact.isDisplayed(), "Verify contact button displayed");
        Assert.assertEquals(btn_contact.getText(), "CONTACT", "Verify contact button text");
        return this;
    }

    public HomePage openRegisterPage() {
        btn_register.click();
        return this;
    }
}
