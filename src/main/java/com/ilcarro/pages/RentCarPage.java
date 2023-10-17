package com.ilcarro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentCarPage extends BasePage {
    public RentCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement pickUpPlace;
    @FindBy(id = "make")
    WebElement manufactureField;
    @FindBy(id = "model")
    WebElement modelField;
    @FindBy(id = "year")
    WebElement yearField;
    @FindBy(id = "fuel")
    WebElement fuelField;
    @FindBy(id = "seats")
    WebElement seatsField;
    @FindBy(id = "class")
    WebElement classField;
    @FindBy(id = "serialNumber")
    WebElement numberField;
    @FindBy(id = "price")
    WebElement priceField;
    @FindBy(id = "about")
    WebElement aboutField;
    @FindBy(css="div.pac-item")
    WebElement pacitem;


    public RentCarPage enterLocationAndDetails(String location, String manufacture,
                                               String model, String year,
                                               String fuel, String seats,
                                               String carClass, String registrationNum,
                                               String price, String text) {
        type(pickUpPlace, location);
        click(pacitem);
        type(manufactureField, manufacture);
        type(modelField, model);
        type(yearField, year);

        click(fuelField);
        fuelField.sendKeys(fuel);
        fuelField.sendKeys(Keys.ENTER);

        click(seatsField);
        seatsField.sendKeys(seats);
        seatsField.sendKeys(Keys.ENTER);
        type(classField, carClass);
        type(numberField, registrationNum);
        type(priceField, price);
        type(aboutField, text);


        return this;
    }

    //@FindBy(xpath = "//label[text() ='Add photos of your car']")
    @FindBy(id = "photos")
    WebElement uploadPicture;

    public RentCarPage uploadPhoto(String photoPath) {
        uploadPicture.sendKeys(photoPath);


        return this;

}

    @FindBy(xpath = "//button[@type ='submit']")
    WebElement submit;

    public RentCarPage clickOnSubmit() {
        click(submit);
        return this;
    }

    @FindBy(xpath = "//h2[@class='message']")
    WebElement text;

    public RentCarPage carAddingMessage() {
        assert isElementDisplayed(text);
        return this;
    }
}

