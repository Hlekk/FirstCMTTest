package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends HeaderAndFooterFragment { public CatalogPage (WebDriver driver) {super(driver);}

    // Локаторы
    public WebElement Product(){return cssFindElements(".ml-buy-item.product").get(0);}
}
