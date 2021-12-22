package tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PlaceOrderUI.PlaceOrdenButton;
import static userinterfaces.PlaceOrderUI.TotalProduct;

public class PlaceOrderTask implements Task{
	String total;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(PlaceOrdenButton)		
				);
		total=TotalProduct.resolveFor(actor).getText();
		 Serenity.setSessionVariable("Total Product").to(total);	 
	}
	public static PlaceOrderTask productTotal(){
		return instrumented(PlaceOrderTask.class);
	}
	 
}
