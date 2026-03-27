package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BaseMarketsPage {

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Получает заголовок формы регистрации
     */
    public String getFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//span[@data-sentry-component='Translate'])[5]"))).getText();
    }
}