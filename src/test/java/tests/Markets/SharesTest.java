package tests.Markets;

import org.testng.annotations.Test;
import pages.BaseMarketsPage;
import pages.SharesPage;
import testdata.TestDataProvider;

public class SharesTest extends BaseMarketsTest {

    @Override
    protected BaseMarketsPage getPage() {
        return sharesPage;
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/shares", expectedTitle,
                sharesPage, SharesPage::clickCreateAccountBanner, "Shares");
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoBanner(String url, String expectedTitle) {
        testSignUpFormOnPage(url + "/markets/shares", expectedTitle,
                sharesPage, SharesPage::clickTryDemoBanner, "Shares");
    }
}
