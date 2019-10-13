package com.spring.shipment
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)

WebDriver driver;
int passCount=0;
int totalCount=7;
StringBuffer verificationErrors = new StringBuffer();

Given(~'^The page with shipment details$') { ->
	String Xport = System.getProperty("lmportal.xvfb.id", ":20");
	final File firefoxPath = new File(System.getProperty("lmportal.deploy.firefox.path", "/usr/bin/firefox"));
	FirefoxBinary firefoxBinary = new FirefoxBinary(firefoxPath);
	firefoxBinary.setEnvironmentProperty("DISPLAY", Xport);
	driver = new FirefoxDriver();
	driver.navigate().to("http://localhost:8080/Cucumber_10_Jenkins_selenium/");
}

When(~'^I Enter into the about and contact page$') { ->
	try {
		driver.findElement(By.id("about")).click();
		passCount++;
		if (driver.findElement(By.tagName("body")).getText().contains("About Datax Shipments"))
			passCount++;
		else
			verificationErrors.append("Text 'About Datax Shipments' not found\n");
	} catch (Exception e) {
		verificationErrors.append("Text 'About Datax Shipments' not found\n");
	} catch (Error e) {
		verificationErrors.append("Text 'About Datax Shipments' not found\n");
	}
	try{
		text = driver.findElement(By.tagName("body")).getText();
		if(text.length() > 15)
			passCount++;
		else
			verificationErrors.append("About content should be greater than 15 letters\n");
	}catch(Exception e){
		verificationErrors.append("About content should be greater than 15 letters\n");
	}catch(Error e){
		verificationErrors.append("About content should be greater than 15 letters\n");
	}
	try{
		driver.findElement(By.id("contact")).click();
		passCount++;
		if (!(driver.findElement(By.tagName("body")).getText().contains("About Datax Shipments")))
			passCount++;
		else
			verificationErrors.append("Text 'About Datax Shipments' should not present\n");
	}catch(Exception e){
		verificationErrors.append("Text 'About Datax Shipments' should not present\n");
	}catch(Error e){
		verificationErrors.append("Text 'About Datax Shipments' should not present\n");
	}
	try{
		driver.findElement(By.id("home")).click();
		passCount++;
		if(driver.findElement(By.tagName("body")).getText().contains("Welcome to Datax Shipments"))
			passCount++;
		else
			verificationErrors.append("Text 'Welcome to Datax Shipments' not found\n");
	}catch(Exception e){
		verificationErrors.append("Text 'Welcome to Datax Shipments' not found\n");
	}catch(Error e){
		verificationErrors.append("Text 'Welcome to Datax Shipments' not found\n");
	}
}

Then(~'^We get shipment details$') { ->
	System.out.println("#"+Math.round((passCount/(float)totalCount)*100));
	println verificationErrors.toString()
	try {
		driver.close();
	} catch (Exception exception) {}
}