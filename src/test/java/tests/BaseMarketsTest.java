package tests;

import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.MarketsNavigator;

import java.lang.reflect.Method;

public class BaseMarketsTest extends BaseTest {

    protected String baseUrl;

    @BeforeMethod
    public void init() {
        baseUrl = "https://capital.com";
    }

    // Вспомогательный метод для навигации по страницам Markets
    protected BasePage navigateToPage(String url, String methodName) throws Exception {
        openPage(url);
        closePopups();

        Method method = MarketsNavigator.class.getMethod(methodName);
        return (BasePage) method.invoke(new MarketsNavigator(driver, wait));
    }
}