package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SingUPPage {
	
	public static final Target UserNameNewInput = Target.the("New Username").located(By.id("sign-username"));
	public static final Target UserPasswordNewInput = Target.the("New Password").located(By.id("sign-password"));
	public static final Target SingUpButton = Target.the("Button Sign up").locatedBy("//button[@class='btn btn-primary' and text()='Sign up']");
	
	
}
