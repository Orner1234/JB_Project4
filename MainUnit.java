package automation;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainUnit {

	public static void main(String[] args) throws InterruptedException {
		/** This automation project will do the following:
		  1) set & & open web driver (Firefox, Chrome)
		  2) Log-in into yahoo's email (Firefox, Chrome)
		  3) Navigation to and in NEWS page (Firefox, Chrome)
		  
		  ffDriver = Firefox, chDriver = Chrome
		  
		  August 24, 2023: updates to chromeDriver. Do not use until version is stable.
		  
		 */
		
	// 		1) Web Driver - FireFox:
				System.out.println("Starting Test");
				WebDriver ffDriver = null;
				System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\geckodriver.exe");
				ffDriver = new FirefoxDriver();
				ffDriver.manage().window().maximize();	
				System.out.println("Opening Yahoo's Home page");
				ffDriver.get("https://www.yahoo.com");
				Thread.sleep(3000);
			
			// Count Links in Homepage
				int count = 0;
				int expectedLinks = 73; //count might change due to page updates (every hour or so)
				List<WebElement> link = ffDriver.findElements(By.tagName("a"));
				System.out.println("Counted: " + link.size() + " Links"); // this will print the number of links in a page.
				count =  link.size();
			 
				if(count==expectedLinks){
					System.out.println("Number of links in the News page are correct " + count );
				}else
				{
					System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
				}
			

			
/*
		
	// 		1) Web Driver - Chrome:
				System.out.println("Starting Test");
				WebDriver chDriver = null;
				System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
				chDriver = new chromeDriver();
				chDriver.manage().window().maximize();	
				System.out.println("Opening Yahoo's Home page");
				chCriver.get("https://www.yahoo.com");
				Thread.sleep(3000);
			
			// Count Links in Homepage
				int count = 0;
				int expectedLinks = 73; //count might change due to page updates (every hour or so)
				List<WebElement> link = chDriver.findElements(By.tagName("a"));
				System.out.println("Counted: " + link.size() + " Links"); // this will print the number of links in a page.
				count =  link.size();
			 
				if(count==expectedLinks){
					System.out.println("Number of links in the News page are correct " + count );
				}else
				{
					System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
				}
			
*/
		
			 
			 
	//		2) Log-In into Yahoo's Email: Combo - 2nd Component /Firefox
				/* 
				 * Log-In:
				 * UserName: orly.turner
				Password: jcg123KLP98
				 */
			 	ffDriver.findElement(By.id("root_1")).click();
				System.out.println("Moving on to purple-pink page");
				Thread.sleep(3000);
				ffDriver.findElement(By.linkText("Sign in")).click();
				Thread.sleep(3000);
				ffDriver.findElement(By.id("login-username")).sendKeys("orly.turner");
				System.out.println("Typing UserName");
				ffDriver.findElement(By.ByXPath.cssSelector("label:nth-child(2)")).click();
			    Thread.sleep(4000);
			    ffDriver.findElement(By.name("signin")).click();
			    Thread.sleep(3000);
			    ffDriver.findElement(By.id("login-passwd")).click();
			    ffDriver.findElement(By.id("login-passwd")).sendKeys("jcg123KLP98");
			    System.out.println("Typing Password");
			    Thread.sleep(2000);
			    System.out.println("LINK START!");
			    ffDriver.findElement(By.id("login-signin")).click();
			    Thread.sleep(3000);
			    
			//	Inside Mailbox:
			    //Choosing Value from ComboBox (2nd Option)
			    System.out.println("Choosing from ComboBox");
			    Thread.sleep(2000);
			    ffDriver.findElement(By.cssSelector(".C4_Z29WjXl:nth-child(1)")).click();
			    ffDriver.findElement(By.cssSelector(".G_e:nth-child(2) .X_6Eb4")).click();
			    
			    // Choosing Radio Buttons
			    System.out.println("Changing Background");
			    ffDriver.findElement(By.ByXPath.cssSelector(".P_0 > .i_0")).click();
				Thread.sleep(2000);
				ffDriver.findElement(By.ByXPath.cssSelector(".W_73HH")).click();
				Thread.sleep(2000);
				ffDriver.findElement(By.ByXPath.cssSelector("li:nth-child(3) > div > .e_dRA")).click();
				Thread.sleep(2000);
				ffDriver.findElement(By.ByXPath.cssSelector(".e_dRA > .W_6D6F")).click();
				Thread.sleep(2000);
				ffDriver.findElement(By.ByXPath.cssSelector("li:nth-child(2) > div > .e_dRA")).click();
				Thread.sleep(2000);
				
			    
			    
		   	
	 //		2) Log-In into Yahoo's Email: Combo - 2nd Component /Chrome Driver
					/* 
				 * Log-In:
				 * UserName: orly.turner
				Password: jcg123KLP98
				 */
				/*
			 	chDriver.findElement(By.id("root_1")).click();
				System.out.println("Moving on to purple-pink page");
				Thread.sleep(3000);
				chDriver.findElement(By.linkText("Sign in")).click();
				Thread.sleep(3000);
				chDriver.findElement(By.id("login-username")).sendKeys("orly.turner");
				System.out.println("Typing UserName");
				chDriver.findElement(By.ByXPath.cssSelector("label:nth-child(2)")).click();
			    Thread.sleep(4000);
			    chDriver.findElement(By.name("signin")).click();
			    Thread.sleep(3000);
			    chDriver.findElement(By.id("login-passwd")).click();
			    chDriver.findElement(By.id("login-passwd")).sendKeys("jcg123KLP98");
			    System.out.println("Typing Password");
			    Thread.sleep(2000);
			    System.out.println("LINK START!");
			    chDriver.findElement(By.id("login-signin")).click();
			    Thread.sleep(3000);
			    
			//	Inside Mailbox:
			    //Choosing Value from ComboBox (2nd Option)
			    System.out.println("Choosing from ComboBox");
			    Thread.sleep(2000);
			    chDriver.findElement(By.cssSelector(".C4_Z29WjXl:nth-child(1)")).click();
			    chDriver.findElement(By.cssSelector(".G_e:nth-child(2) .X_6Eb4")).click();
			    
			    // Choosing Radio Buttons
			    System.out.println("Changing Background");
			    chDriver.findElement(By.ByXPath.cssSelector(".P_0 > .i_0")).click();
				Thread.sleep(2000);
				chDriver.findElement(By.ByXPath.cssSelector(".W_73HH")).click();
				Thread.sleep(2000);
				chDriver.findElement(By.ByXPath.cssSelector("li:nth-child(3) > div > .e_dRA")).click();
				Thread.sleep(2000);
				chDriver.findElement(By.ByXPath.cssSelector(".e_dRA > .W_6D6F")).click();
				Thread.sleep(2000);
				chDriver.findElement(By.ByXPath.cssSelector("li:nth-child(2) > div > .e_dRA")).click();
				Thread.sleep(2000);
					    			    
		    	*/
			    
		 
			  
	//		3)	Navigating: Entertainment Page
			    System.out.println("Lets go to the ENTERTAINMENT page");	
			    ffDriver.get("https://www.yahoo.com/entertainment/");
			    Thread.sleep(2000);
			    
			    
			    //Compare Between the Actual and Expected Title
				String expectedTitle = "Yahoo Entertainment";
		        String actualTitle = ffDriver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
		        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
		        	System.out.println("A good Shidduch");
		        } else {
		        	System.out.println("Sorry. Not this time");
		        }
			    
		        
/*
  	//		3)	Navigating: Entertainment Page / Chrome
			    System.out.println("Lets go to the ENTERTAINMENT page");	
			    chDriver.get("https://www.yahoo.com/entertainment/");
			    Thread.sleep(2000);
			    
			    
			    //Compare Between the Actual and Expected Title
				String expectedTitle = "Yahoo Entertainment";
		        String actualTitle = chDriver.getTitle();
		        Assert.assertEquals(actualTitle, expectedTitle);
		        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
		        	System.out.println("A good Shidduch");
		        } else {
		        	System.out.println("Sorry. Not this time");
		        }
 		        
 */

		        
	//		4)	Using the Search Bar
				System.out.println("Lets go back to MainPage and search 'Football'");
				ffDriver.findElement(By.xpath("//a[contains(.,\' HOME\')]")).click();
				Thread.sleep(7000);	
				ffDriver.findElement(By.id("ybar-sbq")).click();
			    Thread.sleep(1000);
			    System.out.println("Searching 'Football'");
			    Thread.sleep(2000);
			    ffDriver.findElement(By.id("ybar-sbq")).sendKeys("football");
			    Thread.sleep(2000);
			    ffDriver.findElement(By.id("ybar-search")).click();	
			    Thread.sleep(2000);
			    System.out.println("Searching Now");
			    WebElement element = ffDriver.findElement(By.id("sbq-submit")); 
			    	Actions builder = new Actions(ffDriver);
			    	builder.moveToElement(element).perform();
			    Thread.sleep(1000);
			    ffDriver.findElement(By.cssSelector(".pt-12 > span")).click();
			    System.out.println("Scrolling down to first link & click");
			    Thread.sleep(5000);
			    System.out.println("and how about in a new tab?");
			    Thread.sleep(5000);

			    /*
	//		4)	Using the Search Bar /Chrome 
				System.out.println("Lets go back to MainPage and search 'Football'");
				chDriver.findElement(By.xpath("//a[contains(.,\' HOME\')]")).click();
				Thread.sleep(7000);	
				chDriver.findElement(By.id("ybar-sbq")).click();
			    Thread.sleep(1000);
			    System.out.println("Searching 'Football'");
			    Thread.sleep(2000);
			    chDriver.findElement(By.id("ybar-sbq")).sendKeys("football");
			    Thread.sleep(2000);
			    chDriver.findElement(By.id("ybar-search")).click();	
			    Thread.sleep(2000);
			    System.out.println("Searching Now");
			    WebElement element = chDriver.findElement(By.id("sbq-submit")); 
			    	Actions builder = new Actions(ffDriver);
			    	builder.moveToElement(element).perform();
			    Thread.sleep(1000);
			    chDriver.findElement(By.cssSelector(".pt-12 > span")).click();
			    System.out.println("Scrolling down to first link & click");
			    Thread.sleep(5000);
			    System.out.println("and how about in a new tab?");
			    Thread.sleep(5000);
			     */
			    
			    
			    
	//		Closing the driver
				System.out.println("Closing the Driver");
			    Set<String> windowHandles = ffDriver.getWindowHandles();	//Closing tabs			
			    for (String handle : windowHandles) {
		            ffDriver.switchTo().window(handle);
			    }
		            ffDriver.quit();		  			    
		        System.out.println("Test Passed");
			   
		        
/*
  	//		Closing the driver/ Chrome
				System.out.println("Closing the Driver");
			    Set<String> windowHandles = chDriver.getWindowHandles();	//Closing tabs			
			    for (String handle : windowHandles) {
		            chDriver.switchTo().window(handle);
			    }
		            chDriver.quit();		  			    
		        System.out.println("Test Passed");
 */
			    
			    
	}

	}
