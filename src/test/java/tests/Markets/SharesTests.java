package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

public class SharesTests extends BaseMarketsTest {

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickCreateAccountBanner();

        Assert.assertEquals(actualText, expected);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickTryDemoBanner();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testSignUpNow(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickSignUpLink();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickCreateAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickTryDemo();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testOpenInstrumentPage(String url, String expected) {
        openPage(url);
        closePopups();

        TradingPage trading = new MarketsNavigator(driver, wait)
                .goToShares()
                .clickFirstInstrument();

        Assert.assertNotNull(trading, "Страница инструмента не открылась для URL: " + url);
    }

    @Test(dataProvider = "allUrls", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expected) {
        openPage(url);
        closePopups();

        String actualText = new MarketsNavigator(driver, wait)
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
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
                .goToShares()
                .clickFirstInstrument();

        String actualText = new ReadyToJoinBlockPage(driver, wait).clickCreateYourAccount();

        Assert.assertEquals(actualText, expected,
                "Для URL: " + url + " открылась форма: " + actualText);
    }
}