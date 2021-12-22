package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AddCartPage {

	public static final Target AddCartProduct = Target.the("Add to cart").locatedBy("//a[@class='btn btn-success btn-lg' and text()='Add to cart']");
	public static final Target OptionCart = Target.the("Option Cart").located(By.id("cartur"));
	
}
