package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketsNavigation extends BaseMarketsPage {

    public MarketsNavigation(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Переход на главную вкладку Markets
     */
    public MarketsNavigation goToMarkets() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, '/markets')])[1]"))).click();
        return this;
    }

    /**
     * Открывает дропдаун Markets наведением мыши
     */
    private MarketsNavigation openMarketsDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(
                By.xpath("//a[contains(@href, '/markets')]"))).perform();
        return this;
    }

    /**
     * Переход на Forex
     */
    public MarketsNavigation goToForex() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//a[contains(@href, '/markets/forex')])[1]"))).click();
        return this;
    }

    /**
     * Переход на Indices
     */
    public MarketsNavigation goToIndices() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/indices')]"))).click();
        return this;
    }

    /**
     * Переход на Commodities
     */
    public MarketsNavigation goToCommodities() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/commodities')]"))).click();
        return this;
    }

    /**
     * Переход на Cryptocurrencies
     */
    public MarketsNavigation goToCryptocurrencies() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/markets/cryptocurrencies')]"))).click();
        return this;
    }

    /**
     * Переход на Market Analysis
     */
    public MarketsNavigation goToMarketAnalysis() {
        openMarketsDropdown();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, '/analysis')]"))).click();
        return this;
    }
}