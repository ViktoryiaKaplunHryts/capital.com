package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.*;
import tests.BaseTest;
import java.util.function.Function;

public abstract class BaseMarketsTest extends BaseTest {

    protected MainPage mainPage;
    protected MarketsPage marketsPage;
    protected ForexPage forexPage;
    protected IndicesPage indicesPage;
    protected CommoditiesPage commoditiesPage;
    protected CryptocurrenciesPage cryptocurrenciesPage;
    protected SharesPage sharesPage;
    protected MarketAnalysisPage marketAnalysisPage;
    protected SignUpPage signUpPage;
    protected TradingInstrumentPage tradingInstrumentPage;

    @BeforeMethod
    public void initPages() {
        mainPage = new MainPage(driver, wait);
        marketsPage = new MarketsPage(driver, wait);
        forexPage = new ForexPage(driver, wait);
        indicesPage = new IndicesPage(driver, wait);
        commoditiesPage = new CommoditiesPage(driver, wait);
        cryptocurrenciesPage = new CryptocurrenciesPage(driver, wait);
        sharesPage = new SharesPage(driver, wait);
        marketAnalysisPage = new MarketAnalysisPage(driver, wait);
        signUpPage = new SignUpPage(driver, wait);
        tradingInstrumentPage = new TradingInstrumentPage(driver, wait);
    }

    protected abstract BaseMarketsPage getPage();

    // Универсальный метод для тестирования формы регистрации на любой странице
    protected <T extends BaseMarketsPage> void testSignUpFormOnPage(
            String url, String expectedTitle, T page, Function<T, SignUpPage> action, String pageName) {
        openPage(url);
        performPreconditions();
        String actualTitle = action.apply(page).getFormTitle();
        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("%s | Ожидался '%s', получен '%s' для URL: %s",
                        pageName, expectedTitle, actualTitle, url));
    }

    // Метод для MainPage
    protected void testSignUpForm(String url, String expectedTitle,
                                  Function<MainPage, SignUpPage> action) {
        openPage(url);
        performPreconditions();
        String actualTitle = action.apply(mainPage).getFormTitle();
        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("Ожидался '%s', получен '%s' для URL: %s",
                        expectedTitle, actualTitle, url));
    }

    // Метод для тестирования действий на торговом инструменте
    protected void testInstrumentAction(String url, String expectedTitle,
                                        Function<TradingInstrumentPage, SignUpPage> action) {
        openPage(url);
        performPreconditions();
        TradingInstrumentPage instrumentPage = marketsPage.clickFirstInstrument();
        String actualTitle = action.apply(instrumentPage).getFormTitle();
        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("Instrument | Ожидался '%s', получен '%s' для URL: %s",
                        expectedTitle, actualTitle, url));
    }
}