package TestPages;

import Base.TestBase;
import Pages.LandingPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;

public class LandingPageTest extends TestBase
{
    LandingPage landingPage = new LandingPage();

    @Given("the user is on the landing page")
    public void isUserOnLandingPageTest()
    {
        Assert.assertTrue("User is not on the landing Page",landingPage.validateLandingPage());
    }

    @And("search for the product by entering the text")
    public void searchByKeywordTest()
    {
        landingPage.validateSearchByKeyword();
    }

    @And("press search button")
    public void clickSearchBttnTest()
    {
        landingPage.validateClickSearchBttn();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }


}
