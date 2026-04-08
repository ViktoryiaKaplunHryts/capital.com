package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Проверяем, запущен ли тест в CI (GitHub Actions)
        boolean isCI = System.getenv("CI") != null && System.getenv("CI").equals("true");

        if (isCI) {
            // Настройки для headless режима в CI
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
        }

        // Общие настройки
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected void closePopups() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@data-type='cb_reject_btn']"))).click();
        } catch (Exception e) {}
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("[data-type='wrong_location_cancel']"))).click();
        } catch (Exception e) {}
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[@data-type='closed_countries_disclaimer_confirm']"))).click();
        } catch (Exception e) {}
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE && driver != null) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.getLifecycle().addAttachment(
                        "Screenshot on failure: " + result.getName(),
                        "image/png",
                        "png",
                        new ByteArrayInputStream(screenshot)
                );
            } catch (Exception e) {
            }
        }

        if (driver != null) {
            driver.quit();
        }
    }
}