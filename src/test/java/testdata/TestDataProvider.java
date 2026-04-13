package testdata;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    /**
     * Все поддерживаемые языковые версии (10 языков).
     * Включает: EN, DE, FR, ES, RU, AR, MN, VI, ZH-HANT, ZH-HANS
     */
    @DataProvider(name = "allUrls")
    public static Object[][] allUrls() {
        return new Object[][]{
                {"https://capital.com/en-int", "Sign up"},
                {"https://capital.com/de-int", "Registrieren"},
                {"https://capital.com/fr-int", "S'inscrire"},
                {"https://capital.com/es-int", "Registrarse"},
                {"https://capital.com/ru-int", "Зарегистрироваться"},
                {"https://capital.com/ar-int", "قم بالتسجيل"},
                {"https://capital.com/mn-int", "Бүртгүүлэх"},
                {"https://capital.com/vi-int", "Đăng ký"},
                {"https://capital.com/zh-hant", "註冊"},
                {"https://capital.com/zh-hans", "注册"}
        };
    }

    @DataProvider(name = "allPages")
    public static Object[][] allPages() {
        return new Object[][]{
                {"Main Page", "goToMarkets"},
                {"Shares", "goToShares"},
                {"Forex", "goToForex"},
                {"Indices", "goToIndices"},
                {"Commodities", "goToCommodities"},
                {"Cryptocurrencies", "goToCryptocurrencies"},
                {"Market Analysis", "goToMarketAnalysis"}
        };
    }

    /**
     * КОМБИНИРОВАННЫЙ DataProvider: все языки × все страницы Markets
     */
    @DataProvider(name = "allLanguages_allPage")
    public static Object[][] allLanguages() {
        Object[][] languages = allUrls();
        Object[][] pages = allPages();

        Object[][] result = new Object[languages.length * pages.length][4];
        int index = 0;

        for (Object[] language : languages) {
            for (Object[] page : pages) {
                result[index][0] = language[0]; // URL
                result[index][1] = language[1]; // Ожидаемый текст кнопки
                result[index][2] = page[0];     // Название страницы
                result[index][3] = page[1];     // Название метода для перехода
                index++;
            }
        }
        return result;
    }

    @DataProvider(name = "withoutMarketAnalysisPages")
    public static Object[][] withoutMarketAnalysisPages() {
        return new Object[][]{
                {"Main Page", "goToMarkets"},
                {"Shares", "goToShares"},
                {"Forex", "goToForex"},
                {"Indices", "goToIndices"},
                {"Commodities", "goToCommodities"},
                {"Cryptocurrencies", "goToCryptocurrencies"},
        };
    }

    /**
     * КОМБИНИРОВАННЫЙ DataProvider: все языки × все страницы Markets (без Market Analysis)
     */
    @DataProvider(name = "allLanguagesAndMarketsWithoutAnalysis")
    public static Object[][] allLanguagesAndMarketsWithoutAnalysis() {
        Object[][] languages = allUrls();
        Object[][] pages = withoutMarketAnalysisPages();

        Object[][] result = new Object[languages.length * pages.length][4];
        int index = 0;

        for (Object[] language : languages) {
            for (Object[] page : pages) {
                result[index][0] = language[0]; // URL
                result[index][1] = language[1]; // Ожидаемый текст кнопки
                result[index][2] = page[0];     // Название страницы
                result[index][3] = page[1];     // Название метода для перехода
                index++;
            }
        }
        return result;
    }
    @DataProvider(name = "withoutForexAndMarketAnalysis")
    public static Object[][] withoutForexAndMarketAnalysis() {
        return new Object[][]{
                {"Main Page", "goToMarkets"},
                {"Shares", "goToShares"},
                {"Indices", "goToIndices"},
                {"Commodities", "goToCommodities"},
                {"Cryptocurrencies", "goToCryptocurrencies"},
        };
    }

    /**
     * КОМБИНИРОВАННЫЙ DataProvider: все языки × страницы Markets (без Forex и без Market Analysis)
     */
    @DataProvider(name = "allLanguagesWithoutForexAndAnalysis")
    public static Object[][] allLanguagesWithoutForexAndAnalysis() {
        Object[][] languages = allUrls();
        Object[][] pages = withoutForexAndMarketAnalysis();

        Object[][] result = new Object[languages.length * pages.length][4];
        int index = 0;

        for (Object[] language : languages) {
            for (Object[] page : pages) {
                result[index][0] = language[0]; // URL
                result[index][1] = language[1]; // Ожидаемый текст кнопки
                result[index][2] = page[0];     // Название страницы
                result[index][3] = page[1];     // Название метода для перехода
                index++;
            }
        }
        return result;
    }
}