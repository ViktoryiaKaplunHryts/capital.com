package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.IndicesPage;
import testdata.TestDataProvider;

public class IndicesTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return indicesPage;
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/indices", expectedTitle,
                indicesPage, IndicesPage::clickCreateAccountBanner, "Indices");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/indices", expectedTitle,
                indicesPage, IndicesPage::clickTryDemoBanner, "Indices");
    }

    @Test(dataProvider = "allLanguagesWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/indices", expectedTitle,
                indicesPage, IndicesPage::clickSignUpNowLink, "Indices");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/indices", expectedTitle,
                indicesPage, IndicesPage::clickCreateAccountButton, "Indices");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/indices", expectedTitle,
                indicesPage, IndicesPage::clickTryDemoButton, "Indices");
    }
}