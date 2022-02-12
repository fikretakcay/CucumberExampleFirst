package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver,10);


    public void clickFunction(WebElement clickElement){
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement,String value){

        sendKeysElement.sendKeys(value);

    }
    public boolean isDisplayed(WebElement isDisplayedElement){
        return isDisplayedElement.isDisplayed();
    }




}
