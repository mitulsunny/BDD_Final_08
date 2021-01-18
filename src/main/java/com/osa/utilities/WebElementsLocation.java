package com.osa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebElementsLocation {

	static WebDriver dr = null;
	static WebElement element = null;

	public WebElementsLocation(WebDriver dr) {
		this.dr = dr;
		//PageFactory.initElements(dr, this);
}

	public static void myClick(String type, String value) {

		getElement(type, value).click();
	}

	public static void typeValue(String type, String value, String text) {
		getElement(type, value).sendKeys(text);
	}

	public static WebElement getElement(String type, String value) {

		if (type.toLowerCase().equals("xpath")) {
			element = dr.findElement(By.xpath(value));
		} else if (type.toLowerCase().equals("cssselector")) {
			element = dr.findElement(By.cssSelector(value));
		} else if (type.toLowerCase().equals("id")) {
			element = dr.findElement(By.id(value));
		} else if (type.toLowerCase().equals("linktext")) {
			element = dr.findElement(By.linkText(value));
		} else if (type.toLowerCase().equals("name")) {
			element = dr.findElement(By.name(value));
		} else if (type.toLowerCase().equals("partiallinktext")) {
			element = dr.findElement(By.partialLinkText(value));
		} else if (type.toLowerCase().equals("tagname")) {
			element = dr.findElement(By.tagName(value));
		} else if (type.toLowerCase().equals("classname")) {
			element = dr.findElement(By.className(value));
		}
		return element;
	}

	public static void myClick(WebDriver dr, String xpath) {

		dr.findElement(By.xpath(xpath)).click();

	}

	public static void myClick(WebElement ele) { 

		ele.click();

	}

	public static void myClick(WebDriver dr, By by) {

		dr.findElement(by).click();

	}

	public static void sendKey(WebDriver dr, String xpath, String value) {

		dr.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public static void sendKey(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void sendKey(WebDriver dr, By by, String value) {

		dr.findElement(by).sendKeys(value);

	}
}
