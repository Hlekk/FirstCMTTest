package ru.cmtscience;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.FileAssert;
import org.testng.annotations.*;
import ru.cmtscience.Helpers.BotHelper.Bot;
import ru.cmtscience.Helpers.BotHelper.BotManager;
import ru.cmtscience.Pages.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class PositiveTests extends BaseTest {

    @Test
    public void loginTest(){
        driver.get("https://cmtscience.ru");
        headerAndFooterFragment.LoginHeaderButton().click();
        loginWindowPage.EmailInput().sendKeys("hlekkamaya@yandex.ru");
        loginWindowPage.PasswordInput().sendKeys("DotaTest11");
        loginWindowPage.LoginToAccountButton().click();
        sleep(1);
        String accountName = driver.findElements(By.cssSelector("div.hr-info.hr-info--no-login span")).get(0).getText().trim();
        assertEquals("Hlekk", accountName);

    }

    @Test
    public void addToCart(){
      driver.get("https://cmtscience.ru/catalog");
      driver.findElements(By.className("to-basket-desktop")).get(6).click();
      productPage.AddProduct().click();
      sleep (3);
      String baksItemCount = driver.findElement(By.className("baks-item-count")).getText();
      int intBaskItemCount = Integer.parseInt(baksItemCount);
      assertEquals(1, intBaskItemCount);
    }

    @Test
    public void filterTest(){
        driver.get("https://cmtscience.ru/catalog");
        int a = driver.findElements(By.className("product")).size();
        driver.findElements(By.cssSelector(".left-check")).get(1).click();
        int b = a - driver.findElements(By.cssSelector(".product[style=\"display: none;\"]")).size();
        assertNotEquals(a,b);
    }

    @Test
    public void changeName(){
        action.LoginAndOpenInfoPage(bot);
        informationAccountPage.ChangeName("1");
        informationAccountPage.SuccessAlert();
        String accountName = informationAccountPage.NameInput().getAttribute("value");
        assertEquals("1",accountName);
        informationAccountPage.ChangeName("Hlekk");
        sleep(1);

    }

    @Test
    public void changePatronymic(){
        action.LoginAndOpenInfoPage(bot);
        informationAccountPage.ChangePatronymic("1234");
        informationAccountPage.SuccessAlert();
        String patronymic = informationAccountPage.PatronymicInput().getAttribute("value");
        assertEquals("1234", patronymic);
        informationAccountPage.ChangePatronymic("123");
        sleep(1);
    }

    @Test
    public void changeLastName(){
        action.LoginAndOpenInfoPage(bot);
        informationAccountPage.ChangeLastName("123");
        sleep(2);
        informationAccountPage.SuccessAlert();
        String lastName = informationAccountPage.LastNameInput().getAttribute("value");
        assertEquals("123", lastName);
        sleep(2);
        informationAccountPage.ChangeLastName("Amaya");
        sleep(1);
    }

    @Test
    public void changeNumber(){
        action.LoginAndOpenInfoPage(bot);
        informationAccountPage.ChangeNumber("1111111111");
        sleep ( 1);
        informationAccountPage.SuccessAlert();
        String number = informationAccountPage.NumberInput().getAttribute("value");
        assertEquals("+7 (111) 111-11-11", number);
        sleep(1);
        informationAccountPage.ChangeNumber("8374345345");
        sleep(1);

    }



    @Test
    public void changeMail(){
        action.LoginAndOpenInfoPage(bot);
        informationAccountPage.ChangeMail("qw@mail.ru");
        informationAccountPage.SuccessAlert();
        String mail = informationAccountPage.EmailInput().getAttribute("value");
        assertEquals("qw@mail.ru", mail);
        informationAccountPage.ChangeMail("hlekkamaya@yandex.ru");
        sleep(1);

    }


    @Test
    public void addProductToFavorite(){
        loginWindowPage.Login(bot);
        Set<Cookie> allcookies = driver.manage().getCookies();
        System.out.println(allcookies);
        informationAccountPage.CatalogButton().click();
        catalogPage.Product().click();
        String productName = productPage.ProductName();
        System.out.println(productName);
        productPage.AddProductToFavorite().click();
        new Actions(driver).moveToElement(catalogPage.AccountButton()).perform();
        catalogPage.FavoritButton().click();
        favoritePage.favoriteInCatalog().click();
        sleep (1);
        String favoriteProductName = favoritePage.favoriteProductName().getText();
        System.out.println(favoriteProductName);
        assertTrue(favoriteProductName.contains(productName));
        favoritePage.favoriteProductName().click();
        productPage.AddProductToFavorite().click();


    }


    @Test
    public void addArticleToFavorite(){
        loginWindowPage.Login(bot);
        informationAccountPage.ArticlesButton().click();
        articlesPage.ArticlePicture().click();
        articlePage.AddToFavoritArticle().click();
        String articleName = articlePage.ArticleTitle().getText();
        System.out.println(articleName);
        sleep(3);
        new Actions(driver).moveToElement(articlePage.AccountButton()).perform();
        articlePage.FavoritButton().click();
        String favoriteArticleTitle = favoritePage.favoriteArticleName().getText();
        System.out.println(favoriteArticleTitle);
        assertEquals(articleName, favoriteArticleTitle);
        favoritePage.favoriteArticleName().click();
        articlePage.AddToFavoritArticle().click();


    }

    @Test
    public void addVideoToFavorite(){
        loginWindowPage.Login(bot);
        informationAccountPage.VideosButton().click();
        videosPage.VideoPicture().click();
        videoPage.AddToFavoriteVideo().click();
        String videoName = videoPage.VideoTitle().getText();
        System.out.println(videoName);
        new Actions(driver).moveToElement(videoPage.AccountButton()).perform();
        videoPage.FavoritButton().click();
        favoritePage.favoriteInVideo().click();
        sleep(1);
        String favoriteVideoName = favoritePage.favoriteVideoName().getText();
        System.out.println(favoriteVideoName);
        assertEquals(videoName, favoriteVideoName);
        favoritePage.favoriteVideoName().click();
        videoPage.AddToFavoriteVideo().click();
    }



    private void sleep(int second) {
        try {
            Thread.sleep (second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
