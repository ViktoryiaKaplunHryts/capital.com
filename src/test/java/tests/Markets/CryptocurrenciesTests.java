package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.CryptocurrenciesPage;
import testdata.TestDataProvider;

public class CryptocurrenciesTests extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return cryptocurrenciesPage;
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/cryptocurrencies", expectedTitle,
                cryptocurrenciesPage, CryptocurrenciesPage::clickCreateAccountBanner, "Cryptocurrencies");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/cryptocurrencies", expectedTitle,
                cryptocurrenciesPage, CryptocurrenciesPage::clickTryDemoBanner, "Cryptocurrencies");
    }

    @Test(dataProvider = "allLanguagesWithoutChineseSimplified", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/cryptocurrencies", expectedTitle,
                cryptocurrenciesPage, CryptocurrenciesPage::clickSignUpNowLink, "Cryptocurrencies");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/cryptocurrencies", expectedTitle,
                cryptocurrenciesPage, CryptocurrenciesPage::clickCreateAccountButton, "Cryptocurrencies");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/cryptocurrencies", expectedTitle,
                cryptocurrenciesPage, CryptocurrenciesPage::clickTryDemoButton, "Cryptocurrencies");
    }
}