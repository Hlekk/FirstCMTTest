package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.awt.windows.WEmbeddedFrame;

public class HeaderAndFooterFragment extends Page {
    public HeaderAndFooterFragment(WebDriver driver) { super(driver); }

    // Локаторы Header
    public WebElement LoginHeaderButton(){return cssFindElement(".hr-name");}

    public WebElement AccountButton(){return cssFindElement(".hr-info--no-login");}

    public WebElement FavoritButton(){return cssFindElement("div.hd-menu a[href=\"https://cmtscience.ru/cabinet/favorites\"]");}

    public WebElement LogoCMT(){return cssFindElement(".main-logo a[href=\"https://cmtscience.ru\"]");}

    public WebElement ArticlesButton(){return cssFindElement(".main-menu a[href=\"/articles\"]");}

    public WebElement VideosButton() {return cssFindElement(".main-menu a[href=\"/videos\"]");}

    public WebElement CatalogButton() {return cssFindElement(".main-menu a[href=\"/catalog\"]");}

    public WebElement AboutCMTButton() {return cssFindElement(".main-menu a[href=\"/about\"]");}

    public WebElement SearchButton() {return cssFindElement("#m-search-icon");}

    public WebElement BasketButton() {return cssFindElement(".hr-basket");}

    public WebElement FavoriteLink() {return cssFindElement(".hd-menu a[href=\"https://cmtscience.ru/cabinet/favorites\"]");}

    public WebElement InfoLink() {return cssFindElement(".hd-menu a[href=\"https://cmtscience.ru/cabinet/info\"]");}

    public WebElement OrdersLink() {return cssFindElement(".hd-menu a[href=\"https://cmtscience.ru/cabinet/orders\"]");}

    public WebElement ChangePasswordLink() {return cssFindElement(".hd-menu a[href=\"https://cmtscience.ru/cabinet/settings\"]");}

    public WebElement LogoutLink() {return cssFindElement(".hd-menu a[href=\"https://cmtscience.ru/logout\"]");}






    // Локаторы Footer

    public WebElement ArticlesFooter() {return cssFindElement(".mf-desk a[href=\"/flow/articles\"]"); }

    public WebElement VideosFooter() {return cssFindElement(".mf-desk a[href=\"/flow/videos\"]");}

    public WebElement CatalogFooter() {return cssFindElement(".mf-desk a[href=\"/catalog\"]");}

    public WebElement AboutCMTFooter() {return cssFindElement(".mf-desk a[href=\"/about\"]");}

    public WebElement VkFooter() {return cssFindElement(".mf-blocks a[href=\"https://vk.com/cavemanstech\"]");}

    public WebElement FaceBookFooter() {return cssFindElement(".mf-blocks a[href=\"https://www.facebook.com/cmtsciencecom/\"]");}

    public WebElement TelegramFooter() {return cssFindElement("a[href=\"https://t.me/cmtscience/ \"]");}

    public WebElement YoutubeFooter() {return cssFindElement("a[href=\"https://www.youtube.com/user/CaveMansTech/videos\"]");}

    public WebElement InstagramFooter(){return cssFindElement(".mf-blocks a[href=\"https://www.instagram.com/cmtscience/\"]");}

    public WebElement InfoAboutDelivery() {return cssFindElement("a[href=\"/delivery\"]");}

    public WebElement InfoAboutPartners() {return cssFindElement("a[href=\"/partners\"]");}

    public WebElement PrivacyPolicy() {return cssFindElement("a[href=\"/docs/privacy.pdf\"]");}


}
