package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MarketsNavigator;
import pages.TradingPage;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

import java.lang.reflect.Method;

public class ViewDetailedChartTest extends BaseMarketsTest {

    @Test(dataProvider = "allLanguagesAndMarketsWithoutAnalysis", dataProviderClass = TestDataProvider.class)
    public void testViewDetailedChart(
            String url, String expected, String pageName, String methodName) throws Exception {

        openPage(url);
        closePopups();

        Method method = MarketsNavigator.class.getMethod(methodName);
        BasePage page = (BasePage) method.invoke(new MarketsNavigator(driver, wait));

        TradingPage tradingPage = page.clickFirstInstrument();

        String actualText = tradingPage.clickViewDetailedChart();

        Assert.assertEquals(actualText, expected,
                "Страница: " + pageName + ", URL: " + url +
                        " - ожидалось: '" + expected + "', получено: '" + actualText + "'");
    }
}
