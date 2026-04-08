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

    /**
     * Все языки кроме монгольского и вьетнамского.
     */
    @DataProvider(name = "withoutMongolianVietnamese")
    public static Object[][] withoutMongolianVietnamese() {
        return new Object[][]{
                {"https://capital.com/en-int", "Sign up"},
                {"https://capital.com/de-int", "Registrieren"},
                {"https://capital.com/fr-int", "S'inscrire"},
                {"https://capital.com/es-int", "Registrarse"},
                {"https://capital.com/ru-int", "Зарегистрироваться"},
                {"https://capital.com/ar-int", "قم بالتسجيل"},
                {"https://capital.com/zh-hant", "註冊"},
                {"https://capital.com/zh-hans", "注册"}
        };
    }
}