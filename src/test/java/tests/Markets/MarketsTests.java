package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.MarketsNavigation;
import pages.TradingInstrumentPage;
import testdata.TestDataProvider;

public class MarketsTests extends BaseMarketsTest {

    private TradingInstrumentPage instrumentPage;

    @Override
    protected BaseMarketsPage getPage() {
        return marketsNavigation.goToMarkets();
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateAccountBanner);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickTryDemoBanner);
    }

    @Test(dataProvider = "allCombinationsWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickSignUpLink);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateAccountButton);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testTryDemo(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickTryDemoButton);
    }

    @Test(dataProvider = "allCombinationsWithoutMongolianAndVietnamese", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccount(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, BaseMarketsPage::clickCreateYourAccountButton);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testTradingInstrumentPage(String url, String expectedTitle) {
        testTradingInstrument(url, expectedTitle, MarketsNavigation::clickFirstInstrument);
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testAddToFavourite(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        String actualFormTitle = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument()
                .clickAddToFavouriteButton()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s' для URL: %s",
                        expectedTitle, actualFormTitle, url));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testNotification(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .clickNotificationButton()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testViewDetailedChart(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .clickViewDetailedChartButton()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testBuyButton(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .clickBuyButton()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testSellButton(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .clickSellButton()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testInfoLongIconAndGoToPlatform(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .goToMarkets()
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .hoverInfoLongAndClickGoToPlatform()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }

    @Test(dataProvider = "allCombinations", dataProviderClass = TestDataProvider.class)
    public void testInfoShortIconAndGoToPlatform(String url, String expectedTitle) {
        openPage(url);
        performPreconditions();

        instrumentPage = marketsNavigation
                .clickFirstInstrument();

        String actualFormTitle = instrumentPage
                .hoverInfoShortAndClickGoToPlatform()
                .getFormTitle();

        Assert.assertEquals(actualFormTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s'",
                        expectedTitle, actualFormTitle));
    }
}