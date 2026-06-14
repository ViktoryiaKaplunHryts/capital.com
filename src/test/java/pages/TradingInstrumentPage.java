package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TradingInstrumentPage extends BaseMarketsPage {

    private By addToFavouriteButton = By.xpath("//button[@data-type='market_add_fav']");
    private By notificationButton = By.xpath("//a[@data-type='market_alerts']");
    private By viewDetailedChartButton = By.xpath("//button[@data-type='market_view_chart']");
    private By buyButton = By.xpath("//a[@data-type='market_buy_btn']");
    private By sellButton = By.xpath("//a[@data-type='market_sell_btn']");
    private By infoLongIcon = By.xpath("//img[contains(@src, 'info-circle')]");
    private By infoShortIcon = By.xpath("//img[contains(@src, 'attention-info-circle')]");
    private By goToPlatformLink = By.xpath("//a[contains(@class, 'l_btn_to_platform')]");

    public TradingInstrumentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public SignUpPage clickAddToFavouriteButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addToFavouriteButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickNotificationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(notificationButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickViewDetailedChartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(viewDetailedChartButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickBuyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(buyButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage clickSellButton() {
        wait.until(ExpectedConditions.elementToBeClickable(sellButton)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage hoverInfoLongAndClickGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(infoLongIcon));
        new Actions(driver).moveToElement(infoIcon).perform();
        wait.until(ExpectedConditions.elementToBeClickable(goToPlatformLink)).click();
        return new SignUpPage(driver, wait);
    }

    public SignUpPage hoverInfoShortAndClickGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(infoShortIcon));
        new Actions(driver).moveToElement(infoIcon).perform();
        wait.until(ExpectedConditions.elementToBeClickable(goToPlatformLink)).click();
        return new SignUpPage(driver, wait);
    }
}