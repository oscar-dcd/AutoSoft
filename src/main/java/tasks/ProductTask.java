package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IndexPage.productUI;

public class ProductTask implements Task{

	private String product;
	
	public ProductTask(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		productUI(product).resolveFor(actor).click();
	}
	public static ProductTask productSend(String product){
		return instrumented(ProductTask.class,product);
	}
}
