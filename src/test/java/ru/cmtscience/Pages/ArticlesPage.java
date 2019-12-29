package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlesPage extends HeaderAndFooterFragment {
    public ArticlesPage (WebDriver driver) {super(driver);}

    //Локаторы
    public WebElement ArticlePicture(){return cssFindElements(".ml-thumb").get(0);}
}
