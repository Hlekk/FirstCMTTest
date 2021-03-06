package ru.cmtscience;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.cmtscience.Helpers.Action;
import ru.cmtscience.Helpers.BotHelper.Bot;
import ru.cmtscience.Helpers.BotHelper.BotManager;
import ru.cmtscience.Pages.*;

public class BaseTest {
    protected WebDriver driver;
    public InformationAccountPage informationAccountPage;
    public LoginWindowPage loginWindowPage;
    public HeaderAndFooterFragment headerAndFooterFragment;
    public ProductPage productPage;
    public CatalogPage catalogPage;
    public ArticlesPage articlesPage;
    public ArticlePage articlePage;
    public FavoritePage favoritePage;
    public VideosPage videosPage;
    public VideoPage videoPage;
    public Action action;
    public Bot bot;
    public BotManager botManager;

    @BeforeTest
    public void start(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1280,900));
        action = new Action(driver);
        botManager = new BotManager();
        bot = botManager.getBot("baseBot");

        informationAccountPage = new InformationAccountPage(driver);
        loginWindowPage = new LoginWindowPage(driver);
        headerAndFooterFragment = new HeaderAndFooterFragment(driver);
        productPage = new ProductPage(driver);
        catalogPage = new CatalogPage(driver);
        articlesPage = new ArticlesPage(driver);
        articlePage = new ArticlePage(driver);
        favoritePage = new FavoritePage(driver);
        videosPage = new VideosPage(driver);
        videoPage = new VideoPage(driver);
    }
    @AfterMethod
    public void stop(){
        driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void stopAllTests(){
        driver.close();
    }
}
