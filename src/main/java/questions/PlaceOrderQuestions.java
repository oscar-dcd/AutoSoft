package questions;

import static userinterfaces.PlaceOrderUI.PlaceOrderForm;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PlaceOrderQuestions {
	

	public static Question<String> totalValue() {
	 	
	 	return actor -> Text.of(PlaceOrderForm).viewedBy(actor).asString().replaceAll("Total: ","");
}
}
