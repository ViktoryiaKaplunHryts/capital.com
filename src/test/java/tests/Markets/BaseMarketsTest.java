package tests.Markets;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.*;
import tests.BaseTest;
import java.util.function.Function;

public abstract class BaseMarketsTest extends BaseTest {

    protected MarketsNavigation marketsNavigation;
    protected TradingInstrumentPage tradingInstrumentPage;
    protected SignUpPage signUpPage;

    @BeforeMethod
    public void initPages() {
        marketsNavigation = new MarketsNavigation(driver, wait);
        tradingInstrumentPage = new TradingInstrumentPage(driver, wait);
        signUpPage = new SignUpPage(driver, wait);
    }

    protected abstract BaseMarketsPage getPage();

    protected void testSignUpForm(String url, String expectedTitle,
                                  Function<BaseMarketsPage, SignUpPage> action) {
        openPage(url);
        performPreconditions();

        String actualTitle = action.apply(getPage()).getFormTitle();

        Assert.assertEquals(actualTitle, expectedTitle,
                String.format("Ожидался заголовок '%s', получен '%s' для URL: %s",
                        expectedTitle, actualTitle, url));
    }

    protected void testTradingInstrument(String url, String expectedTitle,
                                         Function<MarketsNavigation, TradingInstrumentPage> action) {
        openPage(url);
        performPreconditions();

        TradingInstrumentPage instrumentPage = action.apply(marketsNavigation);

        Assert.assertNotNull(instrumentPage,
                String.format("Страница торгового инструмента не открылась для URL: %s", url));
    }
}