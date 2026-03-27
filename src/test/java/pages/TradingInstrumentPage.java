package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TradingInstrumentPage extends BaseMarketsPage {

    public TradingInstrumentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Кликает по кнопке "Add To Favourite"
     */
    public SignUpPage clickAddToFavouriteButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='market_add_fav']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Notification"
     */
    public SignUpPage clickNotificationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_alerts']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "View Detailed Chart"
     */
    public SignUpPage clickViewDetailedChartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='market_view_chart']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Buy"
     */
    public SignUpPage clickBuyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_buy_btn']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Кликает по кнопке "Sell"
     */
    public SignUpPage clickSellButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_sell_btn']"))).click();
        return new SignUpPage(driver, wait);
    }

    /**
     * Наводит курсор на иконку "Long position overnight fee" и кликает по кнопке "Go to platform"
     */
    public SignUpPage hoverInfoLongAndClickGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src, 'info-circle')]")));

        Actions actions = new Actions(driver);
        actions.moveToElement(infoIcon).perform();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'l_btn_to_platform')]"))).click();

        return new SignUpPage(driver, wait);
    }

    /**
     * Наводит курсор на иконку "Short position overnight fee" и кликает по кнопке "Go to platform"
     */
    public SignUpPage hoverInfoShortAndClickGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[contains(@src, 'attention-info-circle')]")));

        Actions actions = new Actions(driver);
        actions.moveToElement(infoIcon).perform();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'l_btn_to_platform')]"))).click();

        return new SignUpPage(driver, wait);
    }
}