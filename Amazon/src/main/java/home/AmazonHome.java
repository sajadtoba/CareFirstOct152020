package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonHome extends CommonAPI {
    // How to write the test case?
    // It always starts with the test @Test annotation
    //It will void
    // then the name of the test start with the word test

    @Test
    public void testSearchItem(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptops"+ Keys.ENTER);
    }
}
