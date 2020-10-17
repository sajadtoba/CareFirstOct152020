package homeCnn;

import base.BaseAPI;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

//public class Cnn extends CommonAPI {
public class Cnn extends BaseAPI {
    // 1st  we need to extends CommonAPI that way we can get the @Test annotation same time and the driver
    @Test
    public void testClickBusinessTab() throws InterruptedException {
        driver.findElement(By.name("business")).click();
        Thread.sleep(2000);
    }


}
