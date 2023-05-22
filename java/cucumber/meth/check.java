package cucumber.meth;

import java.util.List;

import cucu.pages.homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.datatable;
import io.cucumber.datatable.DataTable;

public class check{
	

@Given("I get the title")
public void i_get_the_title() {
   System.out.println("");
}

	@Given("I lauched nyckaa")
	public void i_lauched_nyckaa() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//start();
		//homepage.search();
	}

	@When("I clicked seach box")
	public void i_clicked_seach_box() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		homepage.search();
	}

	@When("I searched Mens tshirt")
	public void i_searched_mens_tshirt() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I clicked search button")
	public void i_clicked_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("I verify if the searched result appearing")
	public void i_verify_if_the_searched_result_appearing() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("A {string}")
	public void a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	   System.out.println(string);
	}
	@When("B")
	public void b() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("C")
	public void c() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("name and age")
	public void name_and_age(DataTable dataTable) {
	List<List<String>> li= dataTable.asLists(String.class);
	  
	  System.out.println(li.get(0).get(0));
	}



}
