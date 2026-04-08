package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Класс-навигатор для перемещения по разделам Markets.
 */
public class MarketsNavigator {

    private WebDriver driver;
    private WebDriverWait wait;

    public MarketsNavigator(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    /**
     * Открытие выпадающего меню Markets с помощью hover
     */
    private void openMarketsDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(
                By.xpath("//a[contains(@href, '/markets')]"))).perform();
    }

    /**
     * Переход на главную страницу Markets
     */
    public BasePage goToMarkets() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, '/markets')])[1]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Shares
     */
    public BasePage goToShares() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, '/markets/shares')])[1]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Forex
     */
    public BasePage goToForex() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/forex')]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Indices
     */
    public BasePage goToIndices() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/indices')]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Commodities
     */
    public BasePage goToCommodities() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/commodities')]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Cryptocurrencies
     */
    public BasePage goToCryptocurrencies() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/cryptocurrencies')]"))).click();
        return new BasePage(driver, wait) {};
    }

    /**
     * Переход на страницу Market Analysis
     */
    public BasePage goToMarketAnalysis() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/analysis')]"))).click();
        return new BasePage(driver, wait) {};
    }
}