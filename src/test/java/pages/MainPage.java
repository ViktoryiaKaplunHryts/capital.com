package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    private By tryDemoLink = By.xpath("//a[contains(@data-type, 'demo')]");
    private By signUpButtonInLearner = By.xpath("//button[contains(@data-type, 'signup')]");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SignUpPage clickBannerSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickBannerTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn2_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickSignUpNowLink() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@data-type, 'signup')]"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTilesSignUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn1_signup']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTilesTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn2_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickCreateAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='banner_with_steps']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTryDemoLink() {
        wait.until(ExpectedConditions.elementToBeClickable(tryDemoLink)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickSignUpButtonInLearnerBlock() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButtonInLearner)).click();
        return new SignUpPage(driver, wait);
    }
}