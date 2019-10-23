package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideosPage extends HeaderAndFooterFragment { public VideosPage (WebDriver driver) {super(driver);}

    //Локаторы
    public WebElement VideoPicture(){return cssFindElements(".ml-thumb").get(0);}
}
