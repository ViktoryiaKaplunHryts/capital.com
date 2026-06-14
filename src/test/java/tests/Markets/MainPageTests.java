package tests.Markets;

import org.testng.annotations.Test;
import pages.MainPage;
import testdata.TestDataProvider;

public class MainPageTests extends BaseMainPageTest {

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSignUpButtonOnBanner(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickSignUpButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButtonOnBanner(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickTryDemoButton);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSignUpNowLink(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickSignUpNowLink);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateAccountButton(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickCreateAccountButtonInWhyChooseBlock);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoButton(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickTryDemoButtonInWhyChooseBlock);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testCreateYourAccountButton(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickCreateAccountButtonInReadyBlock);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testTryDemoLink(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickTryDemoLinkInLearnerBlock);
    }

    @Test(dataProvider = "allLanguages", dataProviderClass = TestDataProvider.class)
    public void testSignUpButtonInLearnerBlock(String url, String expectedTitle) {
        testSignUpForm(url, expectedTitle, MainPage::clickSignUpButtonInLearnerBlock);
    }
}