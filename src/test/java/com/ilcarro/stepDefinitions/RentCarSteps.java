package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.RentCarPage;
import data.CarData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static com.ilcarro.pages.BasePage.driver;

public class RentCarSteps {
    @And("User clicks on Let the car work in link")
    public void click_on_Let_the_car_work_link() {
        new HomePage(driver).clickOnCarWork();
    }

    @And("User enters location and car details")
    public void enter_location_and_car_details() {
        new RentCarPage(driver).enterLocationAndDetails(CarData.LOCATION, CarData.MANUFACTURE,
                CarData.MODEL, CarData.YEAR, CarData.FUEL, CarData.SEATS, CarData.CAR_CLASS,
                CarData.REGISTRATION_NUM, CarData.PRICE, CarData.ABOUT);
    }

    @And("User add photo the car")
    public void add_photo() {
        new RentCarPage(driver).uploadPhoto(CarData.PHOTO_PATH);
    }

    @And("User clicks on Submit button")
    public void submit() {
        new RentCarPage(driver).clickOnSubmit();

    }

    @Then("Car adding in message displayed")

    public void car_adding() {
        new RentCarPage(driver).carAddingMessage();

    }
}
