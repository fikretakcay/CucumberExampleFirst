package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage extends AbstractClass{
    WebDriver driver;

    public loginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")

    private WebElement emailWrite;

    public void sendKeysEmailWrite(){
        sendKeysFunction(emailWrite,"fikret_ant_29@hotmail.com");
    }

    @FindBy(xpath = "//input[@type=\"password\"]")

    private WebElement passwordWrite;

    public void sendKeysPasswordWrite(){

        sendKeysFunction(passwordWrite,"**********");
    }

    @FindBy(xpath = "//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")

    private WebElement clickLoginButton;

    public void clickClickLoginButton(){

        clickFunction(clickLoginButton);
    }

    @FindBy(xpath = "(//span[@class=\"a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7\"])[1]")

    private WebElement isDisplayedText;

    public void checkDisplayedText(){
        isDisplayed(isDisplayedText);
    }
}
