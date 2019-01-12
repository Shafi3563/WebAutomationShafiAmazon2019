package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import javax.xml.xpath.XPath;

public class MainPage extends BaseUtil {

    @FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
    public static WebElement viewAmazonLogo;

    public void checkviewAmazonLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewAmazonLogo.click();
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public static WebElement viewSearchBox;

    public void checkviewSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewSearchBox.click();
    }

    @FindBy(xpath = "//a[@class='nav-a' and@tabindex='48']")
    public static WebElement viewTodaysDeal;

    public void checkviewTodaysDeal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewTodaysDeal.click();
    }
    @FindBy(id = "nav-your-amazon")
    public static WebElement yourAmazonDotCom;

    public void checkYourAmazonDotCom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        yourAmazonDotCom.click();
    }

    @FindBy(xpath = "//a[text()='Gift Cards']")
    public static WebElement giftCards;

    public void checkGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.click();
    }
    /*@FindBy(xpath = "//div[@id='nav-xshop-container']//div[@id='nav-xshop']//a[contains(text(),'Whole Foods')]")
    public static WebElement wholeFoods;

    public void checkWholeFoods() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
    }*/
    @FindBy(xpath = "//div[@id='nav-xshop-container']//a[text()='Registry']")
    public static WebElement registry;

    public void checkregistry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registry.click();
    }


    @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
    public static WebElement orders;

    public void checkorders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        orders.click();
    }

//    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/div[1]/label")
//    public static WebElement emailphoneformobileaccounts;
//
//    public void checkemailphoneformobileaccounts() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        emailphoneformobileaccounts.click();
//    }



    @FindBy(xpath = "//*[@id=\"navSwmHoliday\"]/a/img")
    public static WebElement newyear;

    public void checknewyear() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newyear.click();
    }




}
