package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.MarketsPage;
import pages.SignUpPage;
import pages.TradingInstrumentPage;
import testdata.TestDataProvider;

public class MarketsPageTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return marketsPage;
    }

    // Баннеры
    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickCreateAccountBanner, "Markets");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickTryDemoBanner, "Markets");
    }

    // Блок "Why choose Capital.com?"
    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickSignUpNowLink, "Markets");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickCreateAccountButton, "Markets");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickTryDemoButton, "Markets");
    }

    // Блок "Ready to join a leading broker?"
    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets", expectedTitle,
                marketsPage, MarketsPage::clickCreateYourAccountButton, "Markets");
    }

    // Торговые инструменты
    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testClickAnyTradingInstrument(String url, String expectedTitle) {
        String marketsUrl = url + "/markets";
        openPage(marketsUrl);
        performPreconditions();
        Assert.assertNotNull(marketsPage.clickFirstInstrument(),
                "Страница торгового инструмента не открылась");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickAddToFavouriteButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testNotification(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickNotificationButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testViewDetailedChart(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickViewDetailedChartButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testBuyButton(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickBuyButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSellButton(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickSellButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testInfoLongIcon(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::hoverInfoLongAndClickGoToPlatform);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testInfoShortIcon(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::hoverInfoShortAndClickGoToPlatform);
    }

    // Виджеты
    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTradeButtonInRelatedMarkets(String url, String expectedTitle) {
        testInstrumentAction(url + "/markets", expectedTitle, TradingInstrumentPage::clickTradeButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTradeButtonInMostTraded(String url, String expectedTitle) {
        String marketsUrl = url + "/markets";
        openPage(marketsUrl);
        performPreconditions();
        Assert.assertEquals(marketsPage.clickTradeButton().getFormTitle(), expectedTitle,
                String.format("Most Traded | Ожидался '%s'", expectedTitle));
    }
}