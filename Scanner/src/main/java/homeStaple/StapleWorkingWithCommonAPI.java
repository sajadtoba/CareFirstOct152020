package homeStaple;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
// We need to run the class by using the CommonAPI running method
public class StapleWorkingWithCommonAPI extends CommonAPI {
    @Test
    public void testOfficeSupply(){
        List<String> readyOfficeSupply = getOfficeSupply();
        for(int i=0; i <readyOfficeSupply.size(); i++){
            typeAndClickOnElement("searchInput",readyOfficeSupply.get(i)+ Keys.ENTER);
            clearFieldForNextItem("searchInput");

        }
    }

    public List<String> getOfficeSupply(){
        List<String> officeSupplyList = new ArrayList<String>();
        officeSupplyList.add("hp laptops");
        officeSupplyList.add("Fax machine");
        officeSupplyList.add("PrinterPaper");
        return officeSupplyList;

    }
    // Below 3 methods I can use any module class if I have these 3 methods in my CommonAPI
    // But if i have only this class then I will not able to use in other class at least I can extends with this calss
    // the methods can be called but better save inside the CommonAPI.
    public void typeAndClickOnElement(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public void clearFieldForNextItem(String locator){
        driver.findElement(By.id(locator)).clear();
    }
    // this is also commonAPI method we can use any method but the condition the locator type must by id
    public void clickOnElement(String locator){
        driver.findElement(By.id(locator)).click();
    }

}
// I have other methods that we can use from the CommonAPI if we want to typeOnElement or clearField