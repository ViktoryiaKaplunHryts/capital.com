package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Step("Получение текста заголовка формы регистрации")
    public String getSignUpFormText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//strong[@data-testid='SIGN_UP_title']"))).getText();
    }

    @Step("Клик по кнопке 'Create Account' в верхнем баннере")
    public String clickCreateAccountBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']"))).click();
        return getSignUpFormText();
    }

    @Step("Клик по кнопке 'Try Demo' в верхнем баннере")
    public String clickTryDemoBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[data-type*='fullscreen_banner_block_btn2']"))).click();
        return getSignUpFormText();
    }

    @Step("Клик по ссылке 'Sign Up' в навигации")
    public String clickSignUpNowLink() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-type*='signup']")))
        );
        return getSignUpFormText();
    }

    @Step("Клик по кнопке 'Create Account' в блоке")
    public String clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn1_signup']"))).click();
        return getSignUpFormText();
    }

    @Step("Клик по кнопке 'Try Demo' в блоке")
    public String clickTryDemo() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                wait.until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("(//button[contains(@data-type, 'btn2')])[2]")))
        );
        return getSignUpFormText();
    }

    @Step("Клик по первому инструменту в списке")
    public TradingPage clickFirstInstrument() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='cTHd gSFP'])[1]"))).click();
        return new TradingPage(driver, wait);
    }
}