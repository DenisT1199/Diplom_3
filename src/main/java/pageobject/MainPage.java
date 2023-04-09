package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Urls.BASE_URL;

public class MainPage {

    private final WebDriver driver;
    private final By currentMenu = By.xpath("//div[contains(@class,'tab_tab__1SPyG tab_tab_type_current__2BEPc')]"); //локатор текущего меню
    private final By loginToAccount = By.xpath(".//button[text()='Войти в аккаунт']"); //локатор кнопки Войти в аккаунт
    private final By accountButton = By.xpath(".//p[text()='Личный Кабинет']"); //локатор кнопки Личный кабинет
    private final By orderButton = By.xpath(".//button[text()='Оформить заказ']"); //локатор кнопки Оформить заказ
    private final By bunsButton = By.xpath(".//span[contains(text(),'Булки')]"); //локатор текста Булки в конструкторе
    private final By saucesButton = By.xpath(".//span[contains(text(),'Соусы')]"); //локатор текста Соусы
    private final By fillingButton = By.xpath(".//span[contains(text(),'Начинки')]"); //локатор текста Начинки
    private final By setBurgerIndicator = By.xpath(".//*[text()='Соберите бургер']"); //локатор надписи Соберите бургер

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Открыть главную страницу")
    public void open() {//открыть страницу сайта stellar burgers
        driver.get(BASE_URL);
    }

    @Step("Клик на кнопку Войти")
    public void clickLogin() {
        driver.findElement(loginToAccount).click();
    }

    @Step("Проверка, отображается ли надпись Соберите бургер на главной странице")
    public boolean isBurgerInscriptionDisplayed() {
        return driver.findElement(setBurgerIndicator).isDisplayed();
    }

    @Step("Проверка, отображается ли кнопка «Оформить заказ» на главной странице.")
    public boolean isMainPageOpen() {
        return driver.findElement(orderButton).isDisplayed();
    }

    @Step("Клик на кнопку Личный кабинет")
    public void clickAccountButton() {
        driver.findElement(accountButton).click();
    }

    @Step("Клик на кнопку булочки")
    public void clickBunsButton() {
        driver.findElement(bunsButton).click();
    }

    @Step("Клик на кнопку соусов")
    public void clickSaucesButton() {
        driver.findElement(saucesButton).click();
    }

    @Step("Клик на кнопку начинки")
    public void clickFillingsButton() {
        driver.findElement(fillingButton).click();
    }

    @Step("Проверка текста текущего меню")
    public String getTextFromSelectedMenu() {
        return driver.findElement(currentMenu).getText();
    }


}
