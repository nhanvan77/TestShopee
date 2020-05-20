package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class DriverInit implements ITestListener {

    private static final String BROWSER = "chrome";
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROME_WIN = "chromedriver_win.exe";
    private static final String CHROME_LINUX = "chromedriver";
    private static final String OS = System.getProperty("os.name");
    private static final String ROOT_DIR = System.getProperty("user.dir") + File.separator;

    public static WebDriver driver;

    private static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty(CHROME_DRIVER, ROOT_DIR + (OS.contains("Win") ? CHROME_WIN : CHROME_LINUX));
            return new ChromeDriver();
        }
        return null;
    }

    public void onTestStart(ITestResult result) {
        driver = getDriver(BROWSER);
        driver.manage().window().maximize();
    }

    public void onTestSuccess(ITestResult result) {
        driver.quit();
    }

    public void onTestFailure(ITestResult result) {

        driver.quit();
    }

    public void onTestSkipped(ITestResult result) {
        driver.quit();
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {

    }
}
