package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMarketsPage extends BasePage {

    // Общие локаторы для всех страниц
    protected By bannerSignUpButton = By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']");
    protected By bannerTryDemoButton = By.xpath("//button[@data-type='fullscreen_banner_block_btn2_demo']");
    protected By signUpNowLink = By.xpath("//a[contains(@data-type, 'signup')]");
    protected By tilesSignUpButton = By.xpath("//button[@data-type='tiles_w_img_btn1_signup']");
    protected By tilesTryDemoButton = By.xpath("//button[@data-type='tiles_w_img_btn2_demo']");
    protected By createAccountButton = By.xpath("//button[@data-type='banner_with_steps']");
    protected By firstInstrumentLink = By.xpath("(//a[contains(@href, '/instrument/')])[1]");
    protected By tradeButton = By.xpath("//button[@data-type='wdg_most_traded_btn']");

    public BaseMarketsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SignUpPage clickBannerSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(bannerSignUpButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickBannerTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(bannerTryDemoButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickSignUpNowLink() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpNowLink)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTilesSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(tilesSignUpButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTilesTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(tilesTryDemoButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickCreateAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
        return new SignUpPage(driver, wait);
    }

    public TradingInstrumentPage clickFirstInstrument() {
        wait.until(ExpectedConditions.elementToBeClickable(firstInstrumentLink)).click();
        return new TradingInstrumentPage(driver, wait);
    }

    public SignUpPage clickTradeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(tradeButton)).click();
        return new SignUpPage(driver, wait);
    }
}
