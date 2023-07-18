package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccounts extends Utility {


    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement ClickOnMyAccountLink;
    //  By ClickOnMyAccountLink = By.xpath("//span[normalize-space()='My Account']");
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement verifyTheTextRegisterAccount;
    // By verifyTheTextRegisterAccount = By.xpath("//h1[normalize-space()='Register Account']");

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement VerifyTextReturningCustomer;
    //   By VerifyTextReturningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement Myaccount;
    //  By Myaccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    //   By firstName  = By.id("input-firstname");

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    //   By lastName =By.id("input-lastname");

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement eMail;
    //   By eMail = By.id("input-email");

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    //   By telephone = By.id("input-telephone");

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    //   By password = By.id("input-password");

    @CacheLookup
    @FindBy(name = "confirm")
    WebElement passwordConfirm;
    //   By passwordConfirm = By.name("confirm");

    @CacheLookup
    @FindBy(name = "newsletter")
    WebElement selectRadioButton;
    //   By selectRadioButton = By.name("newsletter");

    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;
    //  By privacyPolicy = By.name("agree");

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement clickContinue;
    //  By clickContinue = By.xpath("//input[@value='Continue']");

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement verifyTextMessage;
    //  By verifyTextMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement clickingContinue;
    //   By clickingContinue = By.xpath("//a[@class='btn btn-primary']");

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;
    //   By myAccountLink = By.xpath("//span[normalize-space()='My Account']");

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickOnLogin;
    // By clickOnLogin = By.xpath("//input[@value='Login']");

    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
    WebElement clickOnLogOut;
    //  By clickOnLogOut = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement verifyTheTextAccountLogOut;
    //  By verifyTheTextAccountLogOut = By.xpath("//h1[contains(text(),'Account Logout')]");

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement continueToClick;
    //   By continueToClick = By.xpath("//a[@class='btn btn-primary']");


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement verifyTextMyAccount;

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement clickMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickRegister;

    // By verifyTextMyAccount = By.xpath("//h2[normalize-space()='My Account']");
    public void selectMyAccountOption(String option) {

        if (option == "Register") ;
        WebElement select = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options = select.findElements(By.xpath("//a[normalize-space()='Register']"));

        for (WebElement option1 : options) {

            if (option.equals(option1.getText())) {
                option1.click();
            }

        }
        if (option == "Login") ;
        WebElement select1 = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options1 = select1.findElements(By.xpath("//a[normalize-space()='Login']"));

        for (WebElement option2 : options1) {

            if (option.equals(option2.getText())) {
                option2.click();
            }

        }
        if (option == "Logout") ;
        WebElement select2 = driver.findElement(By.xpath("//a[@title='My Account']"));
        List<WebElement> options2 = select2.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));

        for (WebElement option3 : options2) {

            if (option.equals(option3.getText())) {
                option3.click();
            }

        }
    }

    public void clickOnMyAccount() {
        clickOnElement(ClickOnMyAccountLink);
    }


    public String setVerifyTheTextRegisterAccount() {
        return getTextFromElement(verifyTheTextRegisterAccount);
    }

    public String setVerifyTextReturningCustomer() {
        return getTextFromElement(VerifyTextReturningCustomer);
    }

    public void setMyaccount() {
        clickOnElement(Myaccount);
    }

    public void setFirstName(String Name) {
        sendTextToElement(firstName, Name);
    }

    public void setLastName(String Surname) {
        sendTextToElement(lastName, Surname);
    }

    public void setEMail(String mail) {
        sendTextToElement(eMail, mail);
    }

    public void setTelephone(String Phone) {
        sendTextToElement(telephone, Phone);
    }

    public void setPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void setPasswordConfirm(String confPass) {
        sendTextToElement(passwordConfirm, confPass);
    }

    public void setSelectRadioButton() {
        clickOnElement(selectRadioButton);
    }

    public void setPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public void setClickContinue() {
        clickOnElement(clickContinue);
    }

    public String setVerifyTextMessage() {
        return getTextFromElement(verifyTextMessage);
    }

    public void setClickingContinue() {
        clickOnElement(clickingContinue);
    }

    public void setMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void setClickOnLogOut() {
        clickOnElement(clickOnLogOut);
    }

    public String setVerifyTheTextAccountLogOut() {
        return getTextFromElement(verifyTheTextAccountLogOut);
    }

    public void setContinueToClick() {
        clickOnElement(continueToClick);
    }

    public void setClickOnLogin() {
        clickOnElement(clickOnLogin);
    }

    public String setVerifyTextMyAccount() {
        return getTextFromElement(verifyTextMyAccount);
    }
}

