package homeStaple;
import base.BaseAPI;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class Staples extends BaseAPI {
    @Test
    public void testSearchOfficeItems() {
        List<String> officeSupply = getItem();
        for (int i = 0; i < officeSupply.size(); i++) {
            typeOnElement1("//input[@id='searchInput']", officeSupply.get(i) + Keys.ENTER);
            clearField1("//input[@id='searchInput']");
            //driver.findElement(By.xpath("//input[@id='searchInput']")).clear();
        }
    }
    @Test
    public void testSearch(){
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("scanner"+Keys.ENTER);
    }

    public List<String> getItem(){
        List<String> mylist = new ArrayList<String>();
        mylist.add("printer");
        mylist.add("hp printer ink");
        mylist.add("Toshiba labtop");
        mylist.add("Sprint water");
        mylist.add("iphone cover");
        return mylist;
    }

    public void typeOnElement1(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void clearField1(String locator){
        driver.findElement(By.xpath(locator)).clear();
    }
}

// There are 2 ways to use the typeOnElement
// We can use from the CommonAPI which I have created with try and catch options or if we know which locator we are going to use
// Then even we can create a simple one method and then can use for each test.

