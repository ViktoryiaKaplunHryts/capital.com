package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.CommoditiesPage;
import testdata.TestDataProvider;

public class CommoditiesTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return commoditiesPage;
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/commodities", expectedTitle,
                commoditiesPage, CommoditiesPage::clickCreateAccountBanner, "Commodities");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/commodities", expectedTitle,
                commoditiesPage, CommoditiesPage::clickTryDemoBanner, "Commodities");
    }

    @Test(dataProvider = "allLanguagesWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/commodities", expectedTitle,
                commoditiesPage, CommoditiesPage::clickSignUpNowLink, "Commodities");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/commodities", expectedTitle,
                commoditiesPage, CommoditiesPage::clickCreateAccountButton, "Commodities");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/commodities", expectedTitle,
                commoditiesPage, CommoditiesPage::clickTryDemoButton, "Commodities");
    }
}