package com.tutorialsninja.demo.testsuite;


import com.tutorialsninja.demo.pages.Homepage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TopMenuTest extends BaseTest {
    Homepage homepage;
    @BeforeMethod (alwaysRun = true)
    public void inIt(){
        homepage = new Homepage();
    }

    @Test (groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.setMouseHoverOnDesktop();
        homepage.setSelectShowAllDesktop();
        homepage.check();
        String actualMessage = homepage.setVerifyTheTextDesktop();
        String expectedMessage = "Desktops";
        Assert.assertEquals(actualMessage, expectedMessage, "Display the message is not Desktop");
    }

    @Test (groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homepage.setMouseHoverOnLaptopsAndNotebooks();
        homepage.check1();
        String actualText = homepage.setVerifyTheTextLaptopsAndNoteBooks();
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText,expectedText,"Display the message is not laptops&Notebooks");
    }
    @Test (groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homepage.setMouseHoverOnComponents();
        homepage.check2();
        String actualText = homepage.setVerifyTheTextComponents();
        String expectedText = "Components";
        Assert.assertEquals(actualText,expectedText,"Display the message is not components");
    }

}
