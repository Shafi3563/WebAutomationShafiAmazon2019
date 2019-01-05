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
}