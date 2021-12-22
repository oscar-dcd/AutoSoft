package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IndexPage.LogIn;
import static userinterfaces.LogInPage.UserNameInput;
import static userinterfaces.LogInPage.UserPasswordInput;
import static userinterfaces.LogInPage.LogInButton;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogInTask implements Task{
	 String currentUserName = Serenity.sessionVariableCalled("User Name");
	 String currentPassword = Serenity.sessionVariableCalled("Password");
	@Override
	public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
				
				Click.on(LogIn),
				Enter.theValue(currentUserName).into(UserNameInput),
				Enter.theValue(currentPassword).into(UserPasswordInput),
				Click.on(LogInButton)
				);
		Serenity.takeScreenshot();
	}
	public static LogInTask logIn(){
		return instrumented(LogInTask.class);
	}

}
