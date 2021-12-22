package tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.Utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.IndexPage.SingUp;
import static userinterfaces.SingUPPage.UserNameNewInput;
import static userinterfaces.SingUPPage.UserPasswordNewInput;

import org.apache.commons.lang3.RandomStringUtils;


import static userinterfaces.SingUPPage.SingUpButton;;

public class SingUpTask implements Task{
	Utils util = new Utils();
	@Override
	public <T extends Actor> void performAs(T actor) {
		String user = RandomStringUtils.random(5,true,false);
		String pass = RandomStringUtils.random(5,true,true);
		
		
		actor.attemptsTo(
				
				Click.on(SingUp),
				Enter.theValue(user).into(UserNameNewInput),
				Enter.theValue(pass).into(UserPasswordNewInput),
				Click.on(SingUpButton)
				);
		util.WaitFor();
		
	    while(Utils.getTextAlert().contains("This user already exist.")) {
				user = RandomStringUtils.random(5,true,false);
				actor.attemptsTo(Enter.theValue(user).into(UserNameNewInput),
						Click.on(SingUpButton)
				);
				util.WaitFor();
			}
	    Serenity.takeScreenshot();
	    Serenity.setSessionVariable("User Name").to(user);
	    Serenity.setSessionVariable("Password").to(pass);
	    
	}
	
	public static SingUpTask singupClick(){
		return instrumented(SingUpTask.class);
	}
}
