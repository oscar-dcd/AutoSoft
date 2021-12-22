package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import utils.Utils;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.AddCartPage.AddCartProduct;
import static userinterfaces.AddCartPage.OptionCart;

public class AddCartTask implements Task{
	Utils util = new Utils();
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Click.on(AddCartProduct)
	);
		util.WaitFor();
		Utils.getTextAlert();
		actor.attemptsTo(
		Click.on(OptionCart)
		);
	}
	public static AddCartTask addCart(){
		return instrumented(AddCartTask.class);
	}

}
