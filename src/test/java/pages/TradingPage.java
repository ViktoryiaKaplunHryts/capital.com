package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Страница торговли конкретным инструментом.
 * Открывается после клика по инструменту на любой странице раздела Markets.
 * Содержит элементы управления торговлей: Buy, Sell, избранное, уведомления и т.д.
 */
public class TradingPage extends BasePage {

    public TradingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Клик по кнопке "Add to Favourite"
     */
    public String clickAddToFavourite() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='market_add_fav']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке Notification
     */
    public String clickNotification() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_alerts']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке View Detailed Chart
     */
    public String clickViewDetailedChart() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='market_view_chart']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке "Buy"
     */
    public String clickBuy() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_buy_btn']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке "Sell"
     */
    public String clickSell() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@data-type='market_sell_btn']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке "Create Your Account"
     */
    public String clickCreateYourAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='banner_with_steps']"))).click();
        return getSignUpFormText();
    }

    /**
     * Hover на иконку информации для Long позиции и переход на платформу.
     */
    public String hoverLongAndGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//img[contains(@src, 'info-circle')])[1]")));
        new Actions(driver).moveToElement(infoIcon).perform();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'l_btn_to_platform')]"))).click();
        return getSignUpFormText();
    }

    /**
     * Hover на иконку информации для Short позиции и переход на платформу.
     */
    public String hoverShortAndGoToPlatform() {
        WebElement infoIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//img[contains(@src, 'info-circle')])[2]")));
        new Actions(driver).moveToElement(infoIcon).perform();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@class, 'l_btn_to_platform')]"))).click();
        return getSignUpFormText();
    }
}
