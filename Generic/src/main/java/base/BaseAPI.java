package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAPI {
    public WebDriver driver;
    @BeforeMethod
    @Parameters("url")
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","/Users/abc/Desktop/CareFirst/Generic/src/driver/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","/Users/abc/Desktop/CareFirst/Generic/src/driver/geckodriver");
//        driver = new FirefoxDriver();
        //driver =new SafariDriver();
        //driver.navigate().to("https://www.staples.com/");
        driver.get(url);
    }

    @AfterMethod
    public void clearUp() {
        driver.close();
    }
//************************************************************************************************************
//******************* Cloud (BrowserStack )Setup Below
//public static WebDriver driver = null;



    } // Belong to the class




























//************************                 ********************************************************************
//************************                  *******************************************************************
//************************                  *******************************************************************
//public String browserstack_username= "sajjad65";
//    public String browserstack_accesskey = "WKrsTRMyZ4FFSoNPz6wg";
//    public String saucelabs_username = "";
//    public String saucelabs_accesskey = "";
//
//    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
//    @BeforeMethod
//    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
//                      @Optional("OS X") String os, @Optional("10") String os_version, @Optional("chrome-options") String browserName, @Optional("34")
//                              String browserVersion, @Optional("http://www.amazon.com") String url)throws IOException {
//        //System.setProperty("webdriver.chrome.driver", "/Users/peoplentech/eclipse-workspace-March2018/SeleniumProject1/driver/chromedriver");
//        if(useCloudEnv==true){
//            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
//                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os,os_version, browserName, browserVersion);
//            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
//                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,os,os_version, browserName, browserVersion);
//            }
//        }else{
//            getLocalDriver(os, browserName);
//        }
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        //driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        driver.get(url);
//        //driver.manage().window().maximize();
//    }
//    public WebDriver getLocalDriver(@Optional("mac") String OS, String browserName){
//        if(browserName.equalsIgnoreCase("chrome")){
//            if(OS.equalsIgnoreCase("OS X")){
//                System.setProperty("webdriver.chrome.driver","../Generic/driver/chromedriver");
//                //chromedriver is inside the driver and driver is inside the Generic module
//                // Follow MafiSystem.setProperty("webdriver.chrome.driver","../Generic/browser-driver/chromedriver");
//                // (if want to use the absolute path)System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProjects/unWebAutoMationSep2020titled/driver/chromedriver");
//            }else if(OS.equalsIgnoreCase("Windows")){
//                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");            }
//            driver = new ChromeDriver();
//        } else if(browserName.equalsIgnoreCase("chrome-options")){
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-notifications");
//            if(OS.equalsIgnoreCase("OS X")){
//                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver");
//            }else if(OS.equalsIgnoreCase("Windows")){
//                System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
//            }
//            driver = new ChromeDriver(options);
//        } // now I will try to use the Geckodriver to see if it is working or not
//        else if(browserName.equalsIgnoreCase("firefox")){
//            if(OS.equalsIgnoreCase("OS X")){
//                System.setProperty("webdriver.gecko.driver","../Generic/driver/geckodriver" );
//            }else if(OS.equalsIgnoreCase("Windows")) {
//                System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver.exe");
//            }
//            driver = new FirefoxDriver();
//        } else if(browserName.equalsIgnoreCase("ie")) {
//            System.setProperty("webdriver.ie.driver", "../Generic/browser-driver/IEDriverServer.exe");
//            driver = new InternetExplorerDriver();        }
//        return driver;    }
//    // Mafi already set up another class(DesiredCapabilities) with all of the required properties
//    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String os, String os_version,String browserName,
//                                    String browserVersion)throws IOException {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("browser",browserName);
//        cap.setCapability("browser_version",browserVersion);
//        cap.setCapability("os", os);
//        cap.setCapability("os_version", os_version);
//        if(envName.equalsIgnoreCase("Saucelabs")){
//            //resolution for Saucelabs
//            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
//                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
//        }else if(envName.equalsIgnoreCase("Browserstack")) {
//            cap.setCapability("resolution", "1024x768");
//            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
//                    "@hub-cloud.browserstack.com/wd/hub"), cap);
//        }
//        return driver;
//    }




