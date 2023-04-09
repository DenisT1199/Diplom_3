package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Urls.RECOVERY_PASSWORD_URL;

public class PasswordRecoveryPage {

    private final By signInButton = By.xpath(".//a[text()='Войти']"); //локатор кнопки Войти на странице восстановления пароля
    private final WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыть страницу восстановления")
    public void open() {
        driver.get(RECOVERY_PASSWORD_URL);
    }

    @Step("Клик на кнопку Войти")
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
}
