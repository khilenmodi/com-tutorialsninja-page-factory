package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Desktops extends Utility {
    String year = "2023";
    String month = "November";
    String date = "30";
    @CacheLookup
            @FindBy(xpath = "//span[normalize-space()='Currency']")
            WebElement  SwitchToPound;
 //   By SwitchToPound = By.xpath("//span[normalize-space()='Currency']");
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement mouseHoverOnDesktop;
   // By mouseHoverOnDesktop = By.xpath("//a[normalize-space()='Desktops']");
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement selectShowAllDesktop;
  //  By selectShowAllDesktop = By.xpath("//a[normalize-space()='Show AllDesktops']");

    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortNameZToA;
   // By sortNameZToA = By.xpath("//select[@id='input-sort']");
    @FindBy(xpath = "//h4/a")
    WebElement originalProductList;
   // By originalProductList = By.xpath("//h4/a");
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortNameAtoZ;
  //  By sortNameAtoZ = By.xpath("//select[@id='input-sort']");
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectHPLP3065;
  //  By selectHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");

    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyTextHPLP3065;
   // By verifyTextHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");

    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement selectDate;
   // By selectDate = By.xpath("//div[@class = 'input-group date']//button");

    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement selectQty;
   // By selectQty = By.xpath("//input[@id='input-quantity']");

    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement selectAddToCart;
   // By selectAddToCart = By.xpath("//button[@id='button-cart']");
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
           WebElement verifyTextSuccess;
  //  By verifyTextSuccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");

   @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
           WebElement selectTheCart;
  //  By selectTheCart = By.xpath("//a[contains(text(),'shopping cart')]");
  @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
  WebElement verifyTheTextShoppingCart;
  //  By verifyTheTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement verifyTheNameHPLP3065;
 //  By verifyTheNameHPLP3065 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");

    @FindBy(xpath = "//td[contains(text(),'Product 21')]")
    WebElement  verifyTheProduct21;
   // By verifyTheProduct21 = By.xpath("//td[contains(text(),'Product 21')]");
   @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
   WebElement  deliveryDate;
  //  By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
  @FindBy(xpath = "//tbody/tr[1]/td[6]")
  WebElement  VerifyTotalPrice;
  //  By VerifyTotalPrice = By.xpath("//tbody/tr[1]/td[6]");
    public void setSwitchToPound(){
        selectByVisibleTextFromDropDown(SwitchToPound,"£Pound Sterling");
    }
    public void setMouseHoverOnDesktop() {
        mouseHoverToElement(mouseHoverOnDesktop);
    }

    public void setSelectShowAllDesktop() {
        clickOnElement(selectShowAllDesktop);
    }

    public void setSortNameZToA() {
        selectByVisibleTextFromDropDown(sortNameZToA, "Name (Z - A)");
    }

    public void SetSortNameAtoZ () {
        selectByVisibleTextFromDropDown(sortNameAtoZ,"Name (A - Z)");
    }
    public void setSelectHPLP3065(){
        clickOnElement(selectHPLP3065);
    }
    public String setVerifyTextHPLP3065(){
        return getTextFromElement(verifyTextHPLP3065);
    }

    public void setSelectDate(){
        clickOnElement(selectDate);
        while (true){
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String [] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month)&& yer.equalsIgnoreCase(year)){
                break;
            }else{
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e: allDates) {
            if(e.getText().equalsIgnoreCase(date)){
                e.click();
                break;
            }
        }
    }
    public void setSelectQty(){
        cleartext();
        clickOnElement(selectQty);
    }
    public void setSelectAddToCart(){
        clickOnElement(selectAddToCart);
    }
    public String setVerifyTextSuccess(){
        return  getTextFromElement(verifyTextSuccess);
    }
    public void setSelectTheCart(){
        clickOnElement(selectTheCart);
    }
    public String setVerifyTheTextShoppingCart(){
        return getTextFromElement(verifyTheTextShoppingCart);
    }
    public String setVerifyTheNameHPLP3065(){
        return getTextFromElement(verifyTheNameHPLP3065);
    }
    public String setDeliveryDate(){
        return getTextFromElement(deliveryDate);
    }
    public String setVerifyTheProduct21(){
        return  getTextFromElement(verifyTheProduct21);
    }
    public String setVerifyTotalPrice(){
        return getTextFromElement(VerifyTotalPrice);
    }



}
