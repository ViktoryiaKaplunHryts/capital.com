package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetPage extends BasePage {

    public WidgetPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Клик по кнопке "Trade" в виджете
     */
    public String clickTradeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='wdg_most_traded_btn']"))).click();
        return getSignUpFormText();
    }
}