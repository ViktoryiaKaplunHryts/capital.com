package tests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--incognito");*/

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected void performPreconditions() {
        // Закрываем дисклеймер (для всех языков)
        try {
            WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("[data-type='closed_countries_disclaimer_confirm']")));
            confirmButton.click();
            return;
        } catch (Exception e) {
        }

        // Закрываем cookie (для всех языков)
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@data-type='cb_reject_btn']"))).click();
        } catch (Exception e) {
        }

        // Закрываем гео-попап (для всех языков)
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("[data-type='wrong_location_cancel']"))).click();
        } catch (Exception e) {
        }
    }

    @Attachment(value = "Screenshot on failure", type = "image/png")
    public byte[] takeScreenshot() {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                takeScreenshot();
            }
        } catch (Exception e) {
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}