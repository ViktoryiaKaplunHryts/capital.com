package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;
import pages.SignUpPage;
import tests.BaseTest;
import java.util.function.Function;

public abstract class BaseMainPageTest extends BaseTest {

    protected MainPage mainPage;
    protected SignUpPage signUpPage;

    @BeforeMethod
    public void initPages() {
        mainPage = new MainPage(driver, wait);
        signUpPage = new SignUpPage(driver, wait);
    }

    protected void testSignUpForm(String url, String expectedTitle,
                                  Function<MainPage, SignUpPage> action) {
        openPage(url);
        performPreconditions();
        String actualTitle = action.apply(mainPage).getFormTitle();
        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("Ожидался '%s', получен '%s' для URL: %s",
                        expectedTitle, actualTitle, url));
    }
}
