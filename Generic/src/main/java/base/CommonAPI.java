package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver= null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/abc/Desktop/CareFirst/Generic/src/driver/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","/Users/abc/Desktop/CareFirst/Generic/src/driver/geckodriver");
//        driver = new FirefoxDriver();
       // driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.amazon.com/");
        //driver.get("https://www.staples.com/");
        driver.navigate().to("https://www.cnn.com/");
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
        //driver.quit(); // Only I need to make disable when I am using the Safri Driver. Chrome I do not have any issue
                        // FirefoxDriver is get quit so quick and it does not like too.
    }

    public void clearField(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).clear();
        }catch (Exception e){
            try{
                driver.findElement(By.xpath(locator)).clear();
            }catch (Exception e1){
                try{
                    driver.findElement(By.name(locator)).clear();
                }catch (Exception e2){
                    try{
                        driver.findElement(By.className(locator)).clear();
                    }catch (Exception e3){
                        try{
                            driver.findElement(By.linkText(locator)).clear();
                        } catch (Exception e4){
                            try {
                                driver.findElement(By.partialLinkText(locator)).clear();
                            } catch (Exception e5){
                                driver.findElement(By.tagName(locator)).clear();
                            }// this is the last no more try block inside
                        } // Belong to the catch(Exception e4) method and code block
                    }// Belong to the catch(Exception e3) method and code block
                }// Belong to the catch (Exception e2) method and code block which
            }// belong to 2nd catch (Exception e1)method and code block
        }// Belong to the 1st catch(Exception e) code block
    }// Belong to the method


//******************************* TypeOnElement()method with 2 Parameters locator and value ***********************************************



//Type on the search bar window by using any type of locators
    // in this case we need void method with create 2 parameters
    // We need to create try and catch because if one is not then we can use the others
    // try id code block only
    // catch has () method and code block

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception e) { // open the exception and it will close at the end. Inside the exception we can have more try blocks
            // 2nd try
            try { // opened the 2nd try block
                driver.findElement(By.xpath(locator)).sendKeys(value);
            } catch (Exception e1) {                                                 // closed the 2nd try block and 2nd catch starts
                try { // opened the 3rd try block
                    driver.findElement(By.id(locator)).sendKeys(value);
                } catch (Exception e2) {// Closed the try block and starts the catch() and block which closed at the end
                    try { // opend the 4th try block inside the catch block becasue try block open and close but catch still open
                        driver.findElement(By.name(locator)).sendKeys(value);
                    } catch (Exception e3) {// closed the try block and opened the catch block this is the last no more try block needed
                        driver.findElement(By.className(locator)).sendKeys(value);
                    }
                }
            }
        }
    }

//        public void typeOnElement (String locator, String value){
//            try {
//                driver.findElement(By.cssSelector(locator)).sendKeys(value);
//            } catch (Exception ex) {
//                try {
//                    driver.findElement(By.className(locator)).sendKeys(value);
//                } catch (Exception ex2) {
//                    try {
//                        driver.findElement(By.id(locator)).sendKeys(value);
//                    } catch (Exception ex3) {
//                        driver.findElement(By.xpath(locator)).sendKeys(value);
//                    }
//                }
//            }
//        }


    //******************************* clickOnElement()method with 1 Parameters locator only ***********************************



    // Create a void signature () method that will help to click by using any type of locators
    public void clickOnElement(String locator) {
        try { // 1st try block open and close then starts catch () and block which close at the end
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {// 1st catch() and block starts that will close at the method
            try { // open 2nd try block and close the 2nd try block then 2nd catch block open and close at the end
                driver.findElement(By.xpath(locator)).click();
            } catch (Exception ex1) {// 2nd try block closed and 2nd catch () and code block open inside the Exception open try block
                try { // open the 3rd try block and closed then 3rd catch()method and code block open which will close at the end
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex2) {
                    try { // open the 4th try code block and close then 4th catch () method and code block will open
                        driver.findElement(By.className(locator));
                    } catch (Exception ex3) {// closed the 4th try block and opened the catch() and code block
                        driver.findElement(By.name(locator));

                    } // Belong to the last catch(Exception ex3) and code block
                } // Belong to the 3rd catch (Exception ex2) method and code block
            } // Belong to the 2nd catch (Exception ex1) method and code block
        } // Belong to the 1st catch (Exception(ex) method and code block
    } // Belong to the ()method

    //******************************* Extra short       TypeOnElement()method with 2 Parameters locator and value ***********************************
    public void clickOnElement1 (String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }

        }
    }








}

// In my CommonAPI I have only 2 methods with using testng @ Annotation @BeforeMethod and @AfterMethod
// in my @BeforeMethod I have set up 3 drivers and initialize each of with different Browsers to launch my any type of browsers
