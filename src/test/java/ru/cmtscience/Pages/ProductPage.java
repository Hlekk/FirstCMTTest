package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends HeaderAndFooterFragment {
    public ProductPage (WebDriver driver) {super(driver);}

    // Локаторы
    public WebElement AddProduct(){ return cssFindElements(".tr-bot-items .btn--lk").get(1);}

    public WebElement AddProductToFavorite(){return cssFindElements(".tr-bot-items a[href=\"#\"]").get(0);}

    public String ProductName(){return cssFindElement(".page-title").getText();}
}
