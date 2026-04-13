package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MarketsNavigator;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

import java.lang.reflect.Method;

public class CreateAccountOnBannerTest extends BaseMarketsTest {

    @Test(dataProvider = "allLanguagesAndMarketsWithoutAnalysis", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountOnBanner(
            String url, String expected, String pageName, String methodName) throws Exception {

        BasePage page = navigateToPage(url, methodName);

        String actualText = page.clickCreateAccountBanner();

        Assert.assertEquals(actualText, expected,
                "Страница: " + pageName + ", URL: " + url +
                        " - ожидалось: '" + expected + "', получено: '" + actualText + "'");
    }

}
