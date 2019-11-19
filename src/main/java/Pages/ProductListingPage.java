package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListingPage extends TestBase
{
    public boolean validateSearchResultWindowTitle()
    {
    boolean searchResultWndTitle = false;
    if(prop.getProperty("searchResultPgTitle").equals(driver.getTitle()))
        {
            searchResultWndTitle = true;
        }
    return searchResultWndTitle;
    }

    public boolean validateSearchResultWindow()
    {
        boolean searchResultHeading = false;
        boolean searchResultText = false;
        String enteredKeywordSearch = prop.getProperty("landingPgSearchByKeyword");
        String displayedKeywordHeading = driver.findElement(By.xpath(prop.getProperty("searchResultHeading"))).getText();

        if(displayedKeywordHeading.contains(enteredKeywordSearch.toUpperCase()))
        {
            searchResultHeading = true;
        }

        List<WebElement> prdListingByText= driver.findElements(By.xpath(prop.getProperty("searchResultPrdListingByText")));

        for(int i = 0; i< prdListingByText.size(); i++ )
        {
            String disPlayedText= prdListingByText.get(i).getText();

            if(disPlayedText.contains(enteredKeywordSearch.toUpperCase()))
            {
                searchResultText = true;
            }
            else
            {
                searchResultText = false;
                break;
            }
        }
        return (searchResultHeading && searchResultText);
    }

    public boolean validateSelectProductByImage()
    {
        boolean selectPrdByImg = false;
        List<WebElement> prdListingByImage= driver.findElements(By.xpath(prop.getProperty("searchResultPrdListingByImg")));
        System.out.println("The prdListingByImage size is ####" + prdListingByImage.size());

        for(int i = 0; i< prdListingByImage.size(); i++ )
        {
            if(prdListingByImage.get(i).isEnabled())
            {
                selectPrdByImg = true;
            }
            else
            {
                selectPrdByImg = false;
                break;
            }

            if (i == (prdListingByImage.size()-1))
            {
                List<WebElement> clickByImage = driver.findElements(By.xpath(prop.getProperty("clickByImg")));

                WebElement myelement = driver.findElement(By.xpath("//div[@id='productContainer']/article/div/a[@rel='"+clickByImage.get(23).getAttribute("rel")+"']"));
                JavascriptExecutor jse2 = (JavascriptExecutor)driver;
                jse2.executeScript("arguments[0].scrollIntoView()", myelement);


                driver.findElement(By.xpath("//div[@id='productContainer']/article/div/a[@rel='"+clickByImage.get(1).getAttribute("rel")+"']")).click();
            }
        }
        return selectPrdByImg;
    }
}
