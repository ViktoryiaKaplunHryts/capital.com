package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MarketsNavigator;
import pages.ReadyToJoinBlockPage;
import pages.TradingPage;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

public class MarketsTests extends BaseMarketsTest {

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountOnBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickCreateAccountBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemoOnBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickTryDemoBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testSignUpLink(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickSignUpLink();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickTryDemo();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }


    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testOpenInstrumentPage(String url, String expected) {
        openPage(url);
        closePopups();

        TradingPage trading = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument();

        Assert.assertNotNull(trading, "Страница инструмента не открылась для URL: " + url);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .clickAddToFavourite();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testNotification(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .clickNotification();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testViewDetailedChart(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .clickViewDetailedChart();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testBuyButton(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .clickBuy();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testSellButton(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .clickSell();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testLongPositionTooltip(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .hoverLongAndGoToPlatform();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testShortPositionTooltip(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument()
                .hoverShortAndGoToPlatform();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expected) {
        openPage(url);
        closePopups();

        new MarketsNavigator(driver, wait)
                .goToMarkets()
                .clickFirstInstrument();

        String actualText = new ReadyToJoinBlockPage(driver, wait)
                .clickCreateYourAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }
}