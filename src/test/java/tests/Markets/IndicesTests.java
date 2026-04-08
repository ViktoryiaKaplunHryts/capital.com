package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

public class IndicesTests extends BaseMarketsTest {

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickCreateAccountBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickTryDemoBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testSignUpNow(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickSignUpLink();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickCreateAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickTryDemo();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testOpenInstrumentPage(String url, String expected) {
        openPage(url);
        closePopups();

        TradingPage trading = new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickFirstInstrument();

        Assert.assertNotNull(trading, "Страница инструмента не открылась для URL: " + url);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToIndices()
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
                .goToIndices()
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
                .goToIndices()
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
                .goToIndices()
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
                .goToIndices()
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
                .goToIndices()
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
                .goToIndices()
                .clickFirstInstrument()
                .hoverShortAndGoToPlatform();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTradeButton(String url, String expected) {
        openPage(url);
        closePopups();

        new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickFirstInstrument();

        String actualText = new WidgetPage(driver, wait).clickTradeButton();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccount(String url, String expected) {
        openPage(url);
        closePopups();

        new MarketsNavigator(driver, wait)
                .goToIndices()
                .clickFirstInstrument();

        String actualText = new ReadyToJoinBlockPage(driver, wait).clickCreateYourAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }
}