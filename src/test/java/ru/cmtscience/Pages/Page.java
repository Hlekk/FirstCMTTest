package ru.cmtscience.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfAllElementsLocatedBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement cssFindElement(String locator){
        return wait.until(presenceOfElementLocated(By.cssSelector(locator)));
    }

    public WebElement linkTextFindElement(String locator){
        return wait.until(presenceOfElementLocated(By.linkText(locator)));
    }


    public List<WebElement> cssFindElements(String locator){
        return wait.until(presenceOfAllElementsLocatedBy(By.cssSelector(locator)));
    }

}
