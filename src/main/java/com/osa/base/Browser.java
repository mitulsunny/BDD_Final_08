package com.osa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver dr;
	public String basePath=System.getProperty("user.dir");
	public String os=System.getProperty("os.name");
	
	/*public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\Win\\geckodriver.exe");
		dr = new FirefoxDriver();
		Browser ob= new Browser();
		ob.OpenBrowser("chrome");
		dr.get("https://osaconsultingtech.com");
		dr.close();	
	}*/
	
	/**
	 * This method will print out the name of OS and will return webdriver
	 * @param browser
	 * @return webdriver
	 */
	public WebDriver OpenBrowser (String browser){
		if(os.toLowerCase().contains("windows")) {
			System.out.println("The browser is running on "+os);
			setBrowserForWindows(browser);
			
		}else {
			System.out.println("The browser is running on "+os);
			setBrowserForMac(browser);
		}
		return dr;
			
	}
	/** 
	 * This method will open browser in windows OS
	 * @param browser
	 */
	public void setBrowserForWindows(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath+"\\src\\main\\resources\\drivers\\Win\\chromedriver.exe");
			dr = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath+"\\src\\main\\resources\\drivers\\Win\\geckodriver.exe");
			dr = new FirefoxDriver();
		}else {
			System.out.println("Browser is not exicutable");
		}
		
	}
	/** 
	 * This method will open browser in mac OS
	 * @param browser
	 */
	public void setBrowserForMac(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath+"\\src\\main\\resources\\drivers\\Mac\\chromedriver");
			dr = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath+"\\src\\main\\resources\\drivers\\Mac\\geckodriver");
			dr = new FirefoxDriver();
		}else {
			System.out.println("Browser is not exicutable");
		}
		
	}
	/*public void selectOS () {
		//if(os.toLowerCase().contains("windows")) {
			System.out.println("The browser is running on "+os);
		}else {
			System.out.println("The browser is running on "+os);
			
		}
	}*/
}
