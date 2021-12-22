package userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class PlaceOrderUI {
	public static final Target PlaceOrdenButton = Target.the("Place Orden").locatedBy("//button[text()='Place Order']");
	public static final Target TotalProduct = Target.the("Price Total").located(By.id("totalp"));
	public static final Target PlaceOrderForm = Target.the("Place Order Form").located(By.id("totalm"));
}
