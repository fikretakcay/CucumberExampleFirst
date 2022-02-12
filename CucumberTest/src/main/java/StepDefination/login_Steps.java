package StepDefination;

import PageObjectModel.AbstractClass;
import PageObjectModel.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class login_Steps {

    private WebDriver driver;
    loginPage loginPage = new loginPage();
    @Given("go to facebook website")
    public void go_to_facebook_website() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://tr-tr.facebook.com/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Given("enter e-mail")
    public void enter_e_mail() {
        loginPage.sendKeysEmailWrite();
    }
    @Given("enter password")
    public void enter_password() {
        loginPage.sendKeysPasswordWrite();
    }
    @When("click submit button")
    public void click_submit_button() {
        loginPage.clickClickLoginButton();
    }
    @Then("verify success message")
    public void verify_success_message() {
        loginPage.checkDisplayedText();
        System.out.println("Log-in is Success.");
    }
}
