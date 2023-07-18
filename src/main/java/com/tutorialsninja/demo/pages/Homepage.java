package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {
    String menu;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement mouseHoverOnDesktop;
    //  By mouseHoverOnDesktop = By.xpath("//a[normalize-space()='Desktops']");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement selectShowAllDesktop;
    //By selectShowAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement verifyTheTextDesktop;
    //   By verifyTheTextDesktop = By.xpath("//h2[contains(text(),'Desktops')]");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement mouseHoverOnLaptopsAndNotebooks;
    //   By mouseHoverOnLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement verifyTheTextLaptopsAndNoteBooks;
    //   By verifyTheTextLaptopsAndNoteBooks = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement mouseHoverOnComponents;
//    By mouseHoverOnComponents = By.xpath("//a[normalize-space()='Components']");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement verifyTheTextComponents;

    //   By verifyTheTextComponents = By.xpath("//h2[contains(text(),'Components')]");
    public void selectMenu(String menu) {
        this.menu = menu;
        clickOnElement(By.xpath(menu));
    }

    public void check() {
        menu = "//a[normalize-space()='Desktops']";
        selectMenu(menu);
    }

    public void check1() {
        menu = "//a[normalize-space()='Show AllLaptops & Notebooks']";
        selectMenu(menu);
    }

    public void check2() {
        menu = "//a[contains(text(),'Show AllComponents')]";
        selectMenu(menu);
    }

    public void setMouseHoverOnDesktop() {
        mouseHoverToElement(mouseHoverOnDesktop);
    }

    public void setSelectShowAllDesktop() {
        clickOnElement(selectShowAllDesktop);
    }


    public String setVerifyTheTextDesktop() {
        return getTextFromElement(verifyTheTextDesktop);
    }

    public void setMouseHoverOnLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(mouseHoverOnLaptopsAndNotebooks);
    }

    public String setVerifyTheTextLaptopsAndNoteBooks() {
        return getTextFromElement(verifyTheTextLaptopsAndNoteBooks);
    }

    public void setMouseHoverOnComponents() {
        mouseHoverToElement(mouseHoverOnComponents);
    }

    public String setVerifyTheTextComponents() {
        return getTextFromElement(verifyTheTextComponents);
    }


}
