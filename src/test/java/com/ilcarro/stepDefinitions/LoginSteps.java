package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Log in link")
    public void click_on_Login_Link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("lenova@gmail.com","Qwerty007!");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies log in message is displayed")
    public void veify_login_message(){
        new LoginPage(driver).isLoginMessageDisplayed();
    }
    @And("User enters valid email and wrong password")
    public void enter_valid_email_wrong_password(DataTable dataTable){
        new LoginPage(driver).enterWrongData(dataTable);

    }
    @Then("User verifies error message")
    public void verify_error_message(){
        new LoginPage(driver).getError();
    }
}
