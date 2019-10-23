package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPage  extends HeaderAndFooterFragment { public VideoPage (WebDriver driver) {super(driver);}

    //Локаторы
    public WebElement AddToFavoriteVideo() {return cssFindElements(".mlh-socials a[href=\"#\"]").get(1);}

    public WebElement VideoTitle() {return cssFindElement(".page-title");}
}
