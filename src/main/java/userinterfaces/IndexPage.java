package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoblaze.com/")
public class IndexPage extends PageObject{

	public static final Target IndexText = Target.the("Product Store").locatedBy("//a[@href='index.html' and contains(text(),'Home')]");
	public static final Target SingUp = Target.the("Sing up").located(By.id("signin2"));
	public static final Target LogIn = Target.the("Log in").located(By.id("login2"));
	
	
	
	public static Target categoryUI(String text) {
	    return Target.the(String.format("the '%s' button", text))
	            .locatedBy("//a[@class='list-group-item' and text()='{0}']")
	            .of(text);
	}
	public static Target productUI(String text) {
	    return Target.the(String.format("the '%s' button", text))
	            .locatedBy("//a[@class='hrefch' and text()='{0}']")
	            .of(text);
	}
	
}
