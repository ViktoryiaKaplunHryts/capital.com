package testdata;

import org.testng.annotations.DataProvider;
import java.util.ArrayList;
import java.util.List;

public class TestDataProvider {

    @DataProvider(name = "allLanguages")
    public static Object[][] getAllLanguages() {
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

    @DataProvider(name = "allLanguagesWithoutChineseSimplified")
    public static Object[][] getAllLanguagesWithoutChineseSimplified() {
        Object[][] allData = getAllLanguages();
        List<Object[]> filteredList = new ArrayList<>();

        for (Object[] data : allData) {
            String url = (String) data[0];
            if (!url.contains("/zh-hans")) {
                filteredList.add(data);
            }
        }
        return filteredList.toArray(new Object[0][]);
    }

    @DataProvider(name = "onlyFrenchAndSpanish")
    public static Object[][] getOnlyFrenchAndSpanish() {
        Object[][] allData = getAllLanguages();
        List<Object[]> filteredList = new ArrayList<>();

        for (Object[] data : allData) {
            String url = (String) data[0];
            if (url.contains("/fr-int") || url.contains("/es-int")) {
                filteredList.add(data);
            }
        }
        return filteredList.toArray(new Object[0][]);
    }

    @DataProvider(name = "analysisPages")
    public static Object[][] getAnalysisPages() {
        return new Object[][]{
                {"https://capital.com/de-int/analysis/trump-coin-price-prediction", "Registrieren"},
                {"https://capital.com/de-int/analysis/melania-coin-price-prediction", "Registrieren"},
        };
    }
}