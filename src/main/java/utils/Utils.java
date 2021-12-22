package utils;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class Utils extends PageObject{
		
	public void WaitFor() {
		
		 try {
			 waitFor(ExpectedConditions.alertIsPresent());
			} catch (Exception e) {
				
			}
	}
	
	public static String getTextAlert() {
		 String alertResult= Serenity.getWebdriverManager().getCurrentDriver().switchTo().alert().getText();
		Serenity.getWebdriverManager().getWebdriver().switchTo().alert().accept();
	return alertResult;
	}

}
