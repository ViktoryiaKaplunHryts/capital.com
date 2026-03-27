package testdata;

import org.testng.annotations.DataProvider;
import java.util.ArrayList;
import java.util.List;

public class TestDataProvider {

    // ПОЛНЫЙ датапровайдер со всеми языками для SCB
    @DataProvider(name = "allCombinations")
    public static Object[][] getAllCombinations() {
        return new Object[][]{
                // SCB
                {"https://capital.com/en-int", "Sign up"},            // Английский
                {"https://capital.com/de-int", "Registrieren"},       // Немецкий
                {"https://capital.com/fr-int", "S'inscrire"},         // Французский
                {"https://capital.com/es-int", "Registrarse"},        // Испанский
                {"https://capital.com/ru-int", "Зарегистрироваться"}, // Русский
                {"https://capital.com/ar-int", "قم بالتسجيل"},        // Арабский
                {"https://capital.com/mn-int", "Бүртгүүлэх"},         // Монгольский
                {"https://capital.com/vi-int", "Đăng ký"},            // Вьетнамский
                {"https://capital.com/zh-hant", "註冊"},               // Китайский (традиционный)
                {"https://capital.com/zh-hans", "注册"}                // Китайский (упрощенный)
        };
    }

    // ДАТАПРОВАЙДЕР БЕЗ МОНГОЛЬСКОГО И ВЬЕТНАМСКОГО ЯЗЫКОВ
    @DataProvider(name = "allCombinationsWithoutMongolianAndVietnamese")
    public static Object[][] getAllCombinationsWithoutMongolianAndVietnamese() {
        Object[][] allData = getAllCombinations();
        List<Object[]> filteredList = new ArrayList<>();

        for (Object[] data : allData) {
            String url = (String) data[0];
            // Исключаем монгольский и вьетнамский языки
            if (!url.contains("/mn-int") && !url.contains("/vi-int")) {
                filteredList.add(data);
            }
        }

        return filteredList.toArray(new Object[0][]);
    }

    // ДАТАПРОВАЙДЕР БЕЗ КИТАЙСКОГО УПРОЩЕННОГО (zh-hans)
    @DataProvider(name = "allCombinationsWithoutChineseSimplified")
    public static Object[][] getAllCombinationsWithoutChineseSimplified() {
        Object[][] allData = getAllCombinations();
        List<Object[]> filteredList = new ArrayList<>();

        for (Object[] data : allData) {
            String url = (String) data[0];
            // Исключаем китайский упрощенный язык
            if (!url.contains("/zh-hans")) {
                filteredList.add(data);
            }
        }

        return filteredList.toArray(new Object[0][]);
    }
    // ДАТАПРОВАЙДЕР ТОЛЬКО ДЛЯ ФРАНЦУЗСКОГО И ИСПАНСКОГО
    @DataProvider(name = "onlyFrenchAndSpanish")
    public static Object[][] getOnlyFrenchAndSpanish() {
        Object[][] allData = getAllCombinations();
        List<Object[]> filteredList = new ArrayList<>();

        for (Object[] data : allData) {
            String url = (String) data[0];
            // Оставляем французский и испанский
            if (url.contains("/fr-int") || url.contains("/es-int")) {
                filteredList.add(data);
            }
        }

        return filteredList.toArray(new Object[0][]);
    }
}