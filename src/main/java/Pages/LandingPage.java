package Pages;

import Base.TestBase;
import org.openqa.selenium.By;


public class LandingPage extends TestBase
{
    public LandingPage()
    {
        super();
        initialization();
    }

    public boolean validateLandingPage()
    {
        boolean lp = false;
        lp = driver.getTitle().equals(prop.getProperty("landingPgTitle"));
        return lp;
    }

    public void validateSearchByKeyword()
    {
        driver.findElement(By.id(prop.getProperty("landingPgSearchTextBox"))).sendKeys(prop.getProperty("landingPgSearchByKeyword"));
    }

    public void validateClickSearchBttn()
    {
        driver.findElement(By.id(prop.getProperty("landingPgSearchBttn"))).submit();
    }



}
