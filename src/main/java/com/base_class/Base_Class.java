package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver driver1;
	
	public static WebDriver getBrowser(String browser ) throws InterruptedException {
		
		if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prabu\\eclipse-workspace\\Maven_project\\Driverr\\chromedriver.exe");
			 driver1 = new FirefoxDriver();
			 Thread.sleep(2000);
			}
	    else if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabu\\eclipse-workspace\\Maven_project\\Driverr\\chromedriver.exe");
		     driver = new ChromeDriver();
		    }
		return driver;
	    }
	    public static void url(String url) {
        	driver.get(url);
        }
        public static void max() {
        	driver.manage().window().maximize();
        }
        public static void clickElement(WebElement element,String key) {
        	element.sendKeys(key);
        }
        public static void login(WebElement element) {
        	element.click();
        } 
	    public static void navigateForward() {
	    	driver.navigate().forward();
	    }
	    public static void navigateBack() {
	    	driver.navigate().back();
	    }
	    public static void navigateTo() {
			driver.navigate().to("https://www.amazon.in/");
	    }
	    public static void navigateRefresh() {
	    	driver.navigate().refresh();
	    }
	    public static void scrollDown() {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	JavascriptExecutor j = (JavascriptExecutor) driver;
	    	j.executeScript("window.scroll(0,2000)", "");
	    }
	    public static void scrollUp() {
	    	JavascriptExecutor j = (JavascriptExecutor) driver;
	    	j.executeScript("window.scroll(0,0)","");
	    }
	    //ACTIONS AND ROBOT
	    public static void contextClick(WebElement ele) throws AWTException, InterruptedException {
	    	Actions a = new Actions(driver);
	    	a.contextClick(ele).build().perform();
	    	
	    	Robot r = new Robot();
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	
	    	r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			}
        public static void Click(WebElement ele) {
	    	ele.click();
	    }
        
	     public static void Text(WebElement ele) {
	    	 String text = ele.getText();
	 		 System.out.println("***GET_TEXT***"+text);
	    }
	     public static void Attribute(WebElement ele) {
	    	 String attributes = ele.getAttribute("value");
	    	 System.out.println("****Get_Attribute****"+attributes);
	    }
	     public static void Current_url() {
	    	 String url = driver.getCurrentUrl();
	    	 System.out.println("***Current_URL***"+url);
	    	 
	    	 driver.quit();
	    }
	     public static void firefox(String url) {
	    	 driver1.get(url);
	    } 
	     public static void Drop_Down(WebElement ele) {
	    	 Select s = new Select(ele);
	    	List<WebElement> options = s.getOptions();
	    	 for (WebElement option:options) {
	    		 System.out.println(option.getText());
	     }
	     }	
	     public static void multiple(WebElement ele) {
	    	 Select s1 = new Select(ele);
	    	 s1.selectByVisibleText("Swift");
	    	 boolean multi = s1.isMultiple();
	    	 System.out.println(multi);
	    	 
	    	 List<WebElement> selectedoption = s1.getAllSelectedOptions();
	    	 for(WebElement element : selectedoption) {
	    		 String a = element.getText();
	    		 System.out.println("****ALL SELECTED OPTIONS****");
	    		 System.out.println(a);
	     }
	     }
	     public static void Is_enable(WebElement ele) {
	    	 ele.isEnabled();
	     }
	     public static void Is_displayed(WebElement ele) {
	    	 ele.isDisplayed();
	     }
	     public static void gett() {
	    	 driver1.get("http://www.leafground.com/pages/Alert.html");
	     }
	     public static void normal_alert(WebElement ele) {
	    	 ele.click();
	    	 driver1.switchTo().alert().accept();
	     }
	     public static void confirm_alert(WebElement ele) {
	    	 ele.click();
	    	 driver1.switchTo().alert().dismiss();
	     }
	     public static void prompt_alert(WebElement ele) {
	    	 ele.click();
	    	 driver1.switchTo().alert().accept();
	     }
	     public static void url() {
	    	 driver1.get("http://demo.automationtesting.in/Frames.html");
	     }
	     public static void frames(WebElement ele) {
	    	 driver1.switchTo().frame(ele);
	     }
	     public static void sendkeys(WebElement ele , String key) {
	    	 ele.sendKeys(key);
	     }
	     public static void takescreenshot(String key) throws IOException {
	    	 
			File ss=  ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss, new File("C:\\Users\\Prabu\\eclipse-workspace\\Automation\\Screenshots"+key+".jpg"));
	     }
	     
	     
	     
	     }
	     
	     
	     
	    	 
	    	 
	     
	     
		
	    


