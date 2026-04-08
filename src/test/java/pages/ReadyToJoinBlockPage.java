package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadyToJoinBlockPage extends BasePage {

    public ReadyToJoinBlockPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String clickCreateYourAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@data-type='banner_with_steps']"))).click();
        return getSignUpFormText();
    }
}
