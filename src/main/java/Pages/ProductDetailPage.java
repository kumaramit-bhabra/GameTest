package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductDetailPage extends TestBase
{
    public boolean validateWindowTitle()
    {
        boolean windowTitle = false;
        String windowTitleDesc = driver.getTitle();
        if (windowTitleDesc.toUpperCase().contains(driver.findElement(By.xpath(prop.getProperty("PDPHeading"))).getText()))
        {
            windowTitle = true;
        }
        driver.findElement(By.xpath(prop.getProperty("PDPHeading"))).getText();
        System.out.println("Title of the window is ##" + windowTitleDesc);
        return windowTitle;
    }

    public void validateFormatSelection()
    {
        String containerDropDown = "";
        List<WebElement> formatSel = driver.findElements(By.xpath(prop.getProperty("PDPFormatOption")));
        System.out.println("Size for formatSel is #####" +formatSel.size());

        for(int i = 0; i <formatSel.size(); i++)
        {
            containerDropDown = formatSel.get(i).getAttribute("class");
            if(containerDropDown.equals("dropdownContainers format") || containerDropDown.equals("format single")  )
            {
                break;
            }
        }

        if(containerDropDown.equals("dropdownContainers format"))
        {
            List<WebElement> dropDownSelection = driver.findElements(By.xpath(prop.getProperty("PDPFormatDrDwnSel")));
            System.out.println(dropDownSelection.size());

            WebElement drpDown = driver.findElement(By.xpath(prop.getProperty("PDPDrpDwnListButton")));
            JavascriptExecutor jse2 = (JavascriptExecutor)driver;
            jse2.executeScript("arguments[0].style='display: block;'", drpDown);

            List<WebElement> dropDownSelectionByPlt = driver.findElements(By.xpath(prop.getProperty("PDPDrpDwnListButtonFinal")));
            System.out.println("Drop down selection by platform   #####  " +dropDownSelectionByPlt.size());

            for(int j = 0; j < dropDownSelectionByPlt.size(); j++)
            {
                if(dropDownSelectionByPlt.size()>=1)
                {
                    System.out.println("Inside making the selection####" + dropDownSelectionByPlt.get(j).getText() );
                    String data_url = dropDownSelectionByPlt.get(j).getAttribute("data-url");
                    WebElement elementToBeSelected = driver.findElement(By.xpath(prop.getProperty("PDPDrpDwnListButtonFinal") +"[@data-url ='"+data_url+"']/span"));
                    //elementToBeSelected.click();
                    System.out.println("Element to be clickable is ##### "+elementToBeSelected);
                    elementToBeSelected.click();
                    //WebElement element = dropDownSelectionByPlt.get(j);

                    //Actions actions = new Actions(driver);
                    //actions.moveToElement(elementToBeSelected).click().build().perform();
                    /*System.out.println(dropDownSelectionByPlt.get(j).getLocation().x);
                    System.out.println(dropDownSelectionByPlt.get(j).getLocation().y);
                    dropDownSelectionByPlt.get(j)
                    dropDownSelectionByPlt.get(j).click();*/
                    break;
                }
            }

        }
    }

    public void validateAddProductByClkOnBuyBttn()
    {
     driver.findElement(By.xpath(prop.getProperty("PDPAddToBkt"))).click();
    }
}
