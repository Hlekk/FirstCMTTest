package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage extends HeaderAndFooterFragment { public ArticlePage(WebDriver driver) {super(driver);}

    //Локаторы
    public WebElement AddToFavoritArticle() {return cssFindElements(".mlh-socials a[href=\"#\"]").get(1);}

    public WebElement ArticleTitle() {return cssFindElement(".page-title");}
}