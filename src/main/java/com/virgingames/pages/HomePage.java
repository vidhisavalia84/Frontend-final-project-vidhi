package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Cookie;

import java.time.Duration;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Slingo")
    WebElement slingo;

    @FindBy(xpath = "//div[@class='option_set']//div[2]/label")
    WebElement cookieAccept;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Enjoy the World of Slingo with Virgin Games')]")
    WebElement slingoPageText;

    public void acceptCookie() {
        clickOnElement(cookieAccept);
        log.info("Clicking on Accept button" + cookieAccept.toString());
    }


    public void clickOnSlongoLink() {
        // driver.manage().deleteAllCookies();
        clickOnElement(slingo);
        log.info("Clicking on Slingo link" + slingo.toString());
    }

    public String getSlingoWelcomeText() {
        String text = getTextFromElement(slingoPageText);
        log.info("Verifying text After clicking slingo link");
        return text;
    }
}
