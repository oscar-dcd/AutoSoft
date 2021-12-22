package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.PlaceOrderQuestions;
import tasks.AddCartTask;
import tasks.CategoryTask;
import tasks.LogInTask;
import tasks.PlaceOrderTask;
import tasks.ProductTask;
import tasks.SingUpTask;
import userinterfaces.IndexPage;


public class RecordSteps {

	private Actor actor = Actor.named("User");
	WebDriver driver;
	private IndexPage home;

	@Before
	public void prepareStage() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Given("^User join Product Store home screen$")
	public void user_join_Product_Store_home_screen() {
		actor.can(BrowseTheWeb.with(driver));
		actor.wasAbleTo(Open.browserOn(home));
		driver.manage().window().maximize();    
	}

	@Given("^The user sees the index page correctly$")
	public void the_user_sees_the_index_page_correctly() {   
	   actor.attemptsTo(
			    Ensure.that(driver.getCurrentUrl()).contains("https://demoblaze.com/")
			);
	}
	
	@When("^The user Register a new user$")
	public void the_user_Register_a_new_user() {
		actor.wasAbleTo(
			   SingUpTask.singupClick()
				   );
	}

	@When("^The user login with the new user$")
	public void the_user_login_with_the_new_user() {
	    actor.wasAbleTo(
	    		LogInTask.logIn()
	    		);
	}

	@When("^the user selects a category \"([^\"]*)\"$")
	public void the_user_selects_a_category(String category) {
		actor.wasAbleTo(
				CategoryTask.categorySend(category)
				);
		
	}

	@When("^the user selects a product \"([^\"]*)\"$")
	public void the_user_selects_a_product(String product) {
		actor.wasAbleTo(
				ProductTask.productSend(product)
				);
		
	}

	@When("^the user add to cart the product$")
	public void the_user_add_the_product() {
	    actor.wasAbleTo(
	    		
	    		AddCartTask.addCart()
	    		);
	}

	@When("^the user press the place order button$")
	public void the_user_press_the_place_order_button() {
	    actor.wasAbleTo(
	    		PlaceOrderTask.productTotal()
	    		);
	}

	@Then("^the user sees the same values$")
	public void the_user_sees_the_same_values() {
		String currentTotal = Serenity.sessionVariableCalled("Total Product");

		actor.should(seeThat("Thanks for submitting the form",PlaceOrderQuestions.totalValue(), equalTo(currentTotal)));
		
	}
	
}
