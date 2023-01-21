package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }
    @When("^User accept cookies$")
    public void userAcceptCookies()throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().acceptCookie();
    }
    @When("^User click on Slingo tab$")
    public void userClickOnSlingoTab() throws InterruptedException{
        Thread.sleep(1000);
        new HomePage().clickOnSlongoLink();
    }

    @Then("^User should be navigated to slingo with vergin games page successfully$")
    public void userShouldBeNavigatedToSlingoWithVerginGamesPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String actualMessage="Enjoy the World of Slingo with Virgin Games";
        Assert.assertEquals(new HomePage().getSlingoWelcomeText(),actualMessage);
    }


}
