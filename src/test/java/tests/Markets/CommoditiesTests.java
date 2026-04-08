package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

public class CommoditiesTests extends BaseMarketsTest {

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickCreateAccountBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickTryDemoBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "withoutChinese", dataProviderClass = TestDataProvider.class)
    public void testSignUpNow(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickSignUpLink();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickCreateAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickTryDemo();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testOpenInstrumentPage(String url, String expected) {
        openPage(url);
        closePopups();

        TradingPage trading = new MarketsNavigator(driver, wait)
                .goToCommodities()
                .clickFirstInstrument();

        Assert.assertNotNull(trading, "Страница инструмента не открылась для URL: " + url);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToCommodities()
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
                .goToCommodities()
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
                .goToCommodities()
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
                .goToCommodities()
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
                .goToCommodities()
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
                .goToCommodities()
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
                .goToCommodities()
                .clickFirstInstrument()
                .hoverShortAndGoToPlatform();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testRelatedMarketsTradeButton(String url, String expected) {
        openPage(url);
        closePopups();

        new MarketsNavigator(driver, wait)
                .goToCommodities()
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
                .goToCommodities()
                .clickFirstInstrument();

        String actualText = new ReadyToJoinBlockPage(driver, wait).clickCreateYourAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }
}