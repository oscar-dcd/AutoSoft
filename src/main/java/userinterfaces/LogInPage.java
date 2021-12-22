package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LogInPage {
	public static final Target UserNameInput = Target.the("Username").located(By.id("loginusername"));
	public static final Target UserPasswordInput = Target.the("Password").located(By.id("loginpassword"));
	public static final Target LogInButton = Target.the("Button login").locatedBy("//button[@class='btn btn-primary' and text()='Log in']");
}
