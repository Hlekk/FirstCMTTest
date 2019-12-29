package ru.cmtscience.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class InformationAccountPage extends HeaderAndFooterFragment {
    public InformationAccountPage (WebDriver driver) {
        super(driver);
    }



    //Локаторы

    public WebElement NumberInput(){ return cssFindElement(".js-tel");}

    public WebElement EmailInput(){ return cssFindElement(".js-mail"); }

    public WebElement SaveButton(){
        return cssFindElement("#user-save");
    }

    public WebElement SuccessAlert(){
        return cssFindElement(".alert-success");
    }

    public WebElement NameInput(){ return cssFindElement(".js-name");}

    public WebElement PatronymicInput(){ return cssFindElement(".js-otcl");}

    public WebElement LastNameInput(){ return cssFindElement(".js-fio");}


    // Повторяющиеся методы

    public void ChangeMail(String mail) {
        EmailInput().clear();
        EmailInput().sendKeys(mail);
        SaveButton().click();
    }

    public void ChangeNumber(String number) {
        NumberInput().clear();
        NumberInput().sendKeys(number);
        SaveButton().click();
    }

    public void ChangeName(String name) {
        NameInput().clear();
        NameInput().sendKeys(name);
        SaveButton().click();
    }

    public void ChangePatronymic(String patronymic) {
        PatronymicInput().clear();
        PatronymicInput().sendKeys(patronymic);
        SaveButton().click();
    }

    public void ChangeLastName(String lastName) {
        LastNameInput().clear();
        LastNameInput().sendKeys(lastName);
        SaveButton().click();
    }
}
