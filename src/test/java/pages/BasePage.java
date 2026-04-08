package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Базовый класс для всех страниц раздела Markets.
 * Содержит общие методы и локаторы для взаимодействия с элементами страниц.
 * Все специфичные страницы (CommoditiesPage, ForexPage и т.д.) наследуются от этого класса.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    /**
     * Получение текста заголовка формы регистрации
     * Используется для проверки, что форма открылась
     *
     * @return текст заголовка формы регистрации
     */
    public String getSignUpFormText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//strong[@data-testid='SIGN_UP_title']"))).getText();
    }

    /**
     * Клик по кнопке "Create Account" в верхнем баннере страницы
     */
    public String clickCreateAccountBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='fullscreen_banner_block_btn1_signup']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке "Try Demo" в верхнем баннере страницы
     */
    public String clickTryDemoBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("[data-type*='fullscreen_banner_block_btn2']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по ссылке "Sign Up" в навигации
     */
    public String clickSignUpLink() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-type*='signup']")))
        );

        return getSignUpFormText();
    }
    /**
     * Клик по кнопке "Create Account" в блоке
     */
    public String clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='tiles_w_img_btn1_signup']"))).click();
        return getSignUpFormText();
    }

    /**
     * Клик по кнопке "Try Demo" в блоке
     */
    public String clickTryDemo() {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                wait.until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("(//button[contains(@data-type, 'btn2')])[2]")))
        );
                return getSignUpFormText();
    }

    /**
     * Клик по первому инструменту в списке инструментов раздела
     * Используется для перехода на страницу торговли конкретным инструментом
     *
     * @return объект TradingPage для дальнейшего взаимодействия
     */
    public TradingPage clickFirstInstrument() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@class='cTHd gSFP'])[1]"))).click();
        return new TradingPage(driver, wait);
    }
}