package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketAnalysisPage extends BaseMarketsPage {

    public MarketAnalysisPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SignUpPage clickTryDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='plain_button']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickStartTradingTrumpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='plain_button_demo']"))).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickTradeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='wdg_most_traded_btn']"))).click();
        return new SignUpPage(driver, wait);
    }
}