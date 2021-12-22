package tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IndexPage.categoryUI;
public class CategoryTask implements Task{
	private String category;

	public CategoryTask(String category) {
	this.category = category;
	
}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		categoryUI(category).resolveFor(actor).click();
	}
	public static CategoryTask categorySend(String category){
		return instrumented(CategoryTask.class,category);
	}

}
