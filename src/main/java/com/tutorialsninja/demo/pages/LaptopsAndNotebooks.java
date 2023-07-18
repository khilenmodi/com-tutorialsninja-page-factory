package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooks extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement mouseHoverOnLaptopsAndNotebooks;
    //   By mouseHoverOnLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement clickOnShowAllLaptopsAndNotebooks;
//    By clickOnShowAllLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByPrice;
//    By sortByPrice = By.xpath("//select[@id='input-sort']");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement selectMacBook;
//    By selectMacBook = By.xpath("//a[normalize-space()='MacBook']");

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement verifyTextMacbook;
    //   By verifyTextMacbook = By.xpath("//h1[normalize-space()='MacBook']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickOnAddToCartButton;
    //   By clickOnAddToCartButton = By.xpath("//button[@id='button-cart']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement VerifyTheSuccessMessage;
//    By VerifyTheSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartButton;
    //   By clickOnShoppingCartButton = By.xpath("//a[contains(text(),'shopping cart')]");


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement verifyTheMessageShoppingCart;
//    By verifyTheMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement verifyTheTextMacBook;
    //   By verifyTheTextMacBook = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement changeTheQty2;
    //  By changeTheQty2 = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-refresh']")
    WebElement clickOnRefreshButton;
    //   By clickOnRefreshButton = By.xpath("//i[@class='fa fa-refresh']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement VerifyUpdatedCart;
    //   By VerifyUpdatedCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]")
    WebElement clickOnCurrency;
    //   By clickOnCurrency = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]");

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement verifyTheTotal;
    //   By verifyTheTotal = By.xpath("//tbody//tr//td[6]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement clickOnCheckout;
    //   By clickOnCheckout = By.xpath("//a[contains(text(),'Checkout')]");

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement verifyTheTextCheckout;
    //  By verifyTheTextCheckout = By.xpath("//h1[normalize-space()='Checkout']");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement verifyTheNewCustomer;
    //   By verifyTheNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement clickOnGuestCheckout;
    //   By clickOnGuestCheckout = By.xpath("//input[@value='guest']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement ClickOnContinue;
    //  By ClickOnContinue = By.xpath("//input[@id='button-account']");

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    //   By firstName  = By.id("input-payment-firstname");

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
//    By lastName =By.id("input-payment-lastname");

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement eMail;
//    By eMail = By.id("input-payment-email");

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
//    By telephone = By.id("input-payment-telephone");

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement Address1;
//    By Address1 = By.id("input-payment-address-1");

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
//    By city = By.id("input-payment-city");

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;
    //  By postcode = By.id("input-payment-postcode");

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement country;
//    By country = By.id("input-payment-country");

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement state;
    //   By state = By.id("input-payment-zone");

    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement clickOnCon;
    //   By clickOnCon = By.id("button-guest");

    @CacheLookup
    @FindBy(name = "comment")
    WebElement enterComment;
    //  By enterComment = By.name("comment");

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement tickCheckBox;
    //   By tickCheckBox = By.xpath("//input[@name='agree']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueClicking;
//    By continueClicking = By.xpath("//input[@id='button-payment-method']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMessage;
//    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void setMouseHoverOnLaptopsAndNotebooks() {
        mouseHoverToElement(mouseHoverOnLaptopsAndNotebooks);
        clickOnElement(mouseHoverOnLaptopsAndNotebooks);
    }

    public void setClickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(clickOnShowAllLaptopsAndNotebooks);
    }

    public void setSortByPrice() {
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    public void setSelectMacBook() {
        clickOnElement(selectMacBook);
    }

    public String setVerifyTextMacbook() {
        return getTextFromElement(verifyTextMacbook);
    }

    public void setClickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);
    }

    public String setVerifyTheSuccessMessage() {
        return getTextFromElement(VerifyTheSuccessMessage);
    }

    public void setClickOnShoppingCartButton() {
        clickOnElement(clickOnShoppingCartButton);
    }

    public String setVerifyTheMessageShoppingCart() {
        return getTextFromElement(verifyTheMessageShoppingCart);
    }

    public String setVerifyTheTextMacBook() {
        return getTextFromElement(verifyTheTextMacBook);
    }

    public void setChangeTheQty2(String qty) {
        cleartext();
        sendTextToElement(changeTheQty2, qty);
    }

    public void setClickOnRefreshButton() {
        clickOnElement(clickOnRefreshButton);
    }

    public String setVerifyUpdatedCart() {
        return getTextFromElement(VerifyUpdatedCart);
    }

    public void setClickOnCurrency() {
        selectByVisibleTextFromDropDown(clickOnCurrency, "£Pound Sterling");
    }

    public String setVerifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void setClickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String setVerifyTheTextCheckout() {
        return getTextFromElement(verifyTheTextCheckout);
    }

    public String setVerifyTheNewCustomer() {
        return getTextFromElement(verifyTheNewCustomer);
    }

    public void setClickOnGuestCheckout() {
        clickOnElement(clickOnGuestCheckout);
    }

    public void setClickOnContinue() {
        clickOnElement(ClickOnContinue);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
    }

    public void enterEmail(String Mail) {
        sendTextToElement(eMail, Mail);
    }

    public void enterTelephone(String mobile) {
        sendTextToElement(telephone, mobile);
    }

    public void enterAddress1(String Add) {
        sendTextToElement(Address1, Add);
    }

    public void enterCity(String province) {
        sendTextToElement(city, province);
    }

    public void enterPostcode(String Postcode) {
        sendTextToElement(postcode, Postcode);
    }

    public void enterCountry(String coun) {
        selectByVisibleTextFromDropDown(country, coun);
    }

    public void enterState(String county) {
        selectByVisibleTextFromDropDown(state, county);
    }

    public void setClickOnCon() {
        clickOnElement(clickOnCon);
    }

    public void setEnterComment(String comment) {
        sendTextToElement(enterComment, comment);
    }

    public void setTickCheckBox() {
        clickOnElement(tickCheckBox);
    }

    public void setContinueClicking() {
        clickOnElement(continueClicking);
    }

    public String setWarningMessage() {
        return getTextFromElement(warningMessage);
    }

}
