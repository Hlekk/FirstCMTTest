package ru.cmtscience.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ru.cmtscience.Helpers.BotHelper.Bot;
import ru.cmtscience.Pages.LoginWindowPage;


public class Action {
    LoginWindowPage loginWindowPage;
    WebDriver driver;

    public Action(WebDriver driver){
        this.driver = driver;
        loginWindowPage = new LoginWindowPage(driver);
    }

    public void LoginAndOpenInfoPage(Bot bot) {
        loginWindowPage.Login(bot);
        new Actions(driver).moveToElement(loginWindowPage.AccountButton()).perform();
        loginWindowPage.InfoLink().click();
    }
}
