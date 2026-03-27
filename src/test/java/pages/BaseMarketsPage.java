package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Базовый класс для всех страниц раздела Markets
 */
public abstract class BaseMarketsPage{

    final WebDriver driver;
    final WebDriverWait wait;

    public BaseMarketsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    /**
     * Кликает по баннеру "Create Account" на баннере
     */
    public SignUpPage clickCreateAccountBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по баннеру "Try Demo" на баннере
     */
    public SignUpPage clickTryDemoBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn2_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по ссылке "Sign Up Now"
     */
    public SignUpPage clickSignUpLink() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[data-type*='signup']:nth-child(3)"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Create Account"
     */
    public SignUpPage clickCreateAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Try Demo"
     */
    public SignUpPage clickTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[data-type*='tiles_w_img_btn2']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Trade"
     */
    public SignUpPage clickTradeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='wdg_most_traded_btn']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Create Your Account"
     */
    public SignUpPage clickCreateYourAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='banner_with_steps']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает на первый инструмент в списке (Page of trading instrument)
     */
    public TradingInstrumentPage clickFirstInstrument() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='cTHd gSFP'])[1]"))).click();
        return new TradingInstrumentPage(driver, wait);
    }
}