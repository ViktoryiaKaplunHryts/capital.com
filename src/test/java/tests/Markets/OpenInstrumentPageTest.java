package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MarketsNavigator;
import pages.TradingPage;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

import java.lang.reflect.Method;

public class OpenInstrumentPageTest extends BaseMarketsTest {

    @Test(dataProvider = "allLanguagesAndMarketsWithoutAnalysis", dataProviderClass = TestDataProvider.class)
    public void testOpenInstrumentPage(
            String url, String expected, String pageName, String methodName) throws Exception {

        openPage(url);
        closePopups();

        Method method = MarketsNavigator.class.getMethod(methodName);
        BasePage page = (BasePage) method.invoke(new MarketsNavigator(driver, wait));

        TradingPage tradingPage = page.clickFirstInstrument();

        Assert.assertNotNull(tradingPage,
                "Страница инструмента не открылась. Страница: " + pageName + ", URL: " + url);
    }
}