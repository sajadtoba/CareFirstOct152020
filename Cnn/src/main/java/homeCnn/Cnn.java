package homeCnn;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cnn extends CommonAPI {
    // 1st  we need to extends CommonAPI that way we can get the @Test annotation same time and the driver
    @Test
    public void testClickBusinessTab(){
        driver.findElement(By.name("business")).click();
    }


}
