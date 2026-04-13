package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MarketsNavigator;
import testdata.TestDataProvider;
import tests.BaseMarketsTest;

import java.lang.reflect.Method;

public class CreateAccountButtonTest extends BaseMarketsTest {

    @Test(dataProvider = "allLanguagesAndMarketsWithoutAnalysis", dataProviderClass = TestDataProvider.class)
    public void testCreateAccount(
            String url, String expected, String pageName, String methodName) throws Exception {

        openPage(url);
        closePopups();

        Method method = MarketsNavigator.class.getMethod(methodName);
        BasePage page = (BasePage) method.invoke(new MarketsNavigator(driver, wait));

        String actualText = page.clickCreateAccount();

        Assert.assertEquals(actualText, expected,
                "Страница: " + pageName + ", URL: " + url +
                        " - ожидалось: '" + expected + "', получено: '" + actualText + "'");
    }
}
