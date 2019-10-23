package ru.cmtscience.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWindowPage extends HeaderAndFooterFragment {
    public LoginWindowPage (WebDriver driver) {super(driver);}


    // Локаторы
    public WebElement EmailInput(){ return cssFindElement(".email");}

    public WebElement PasswordInput(){return cssFindElement(".password");}

    public WebElement LoginToAccountButton(){return cssFindElement(".btn__def");}

    public WebElement LogoutButton(){return cssFindElement(".mlc-left__inner a[href=\"https://cmtscience.ru/logout\"]");}


    // Повторяющиеся методы

    public void Login() {
        driver.get("https://cmtscience.ru//");
        LoginHeaderButton().click();
        EmailInput().sendKeys("hlekkamaya@yandex.ru");
        PasswordInput().sendKeys("DotaTest11");
        LoginToAccountButton().click();
        sleep(1);

    }

    private void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}