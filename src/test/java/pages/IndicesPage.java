package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndicesPage extends BaseMarketsPage {

    public IndicesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SignUpPage clickCreateAccountBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTryDemoBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn2_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickSignUpNowLink() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@data-type, 'signup')]"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickCreateAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn2_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickCreateYourAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='banner_with_steps']"))).click();
        return new SignUpPage(driver, wait);
    }

    public TradingInstrumentPage clickFirstInstrument() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, '/instrument/')])[1]"))).click();
        return new TradingInstrumentPage(driver, wait);
    }
}