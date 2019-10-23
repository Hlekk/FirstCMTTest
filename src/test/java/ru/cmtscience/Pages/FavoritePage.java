package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavoritePage extends HeaderAndFooterFragment {public FavoritePage (WebDriver driver) {super(driver);}

    //Локаторы
    public WebElement favoriteProductName(){return cssFindElement(".zt-item-title");}

    public WebElement favoriteInCatalog(){return cssFindElement("#contact-tab");}

    public WebElement favoriteArticleName(){return cssFindElements(".promo-footer-title").get(0);}

    public WebElement favoriteInVideo(){return cssFindElement("#profile-tab");}

    public WebElement favoriteVideoName(){return cssFindElements(".promo-footer-title").get(0);}
}
