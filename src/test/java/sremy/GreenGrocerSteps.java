package sremy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class GreenGrocerSteps {

    Greengrocer greengrocer = new Greengrocer();

    @Given("the following products price per kilo:")
    public void theFollowingProductsPricePerKilo(Map<String, Long> mapProductPrice) {
        greengrocer.appendItems(mapProductPrice);
                                                     
    }

    @When("I buy the following products in the following weight:")
    public void iBuyTheFollowingProductsInTheFollowingWeight(Map<String, Long> mapProductWeight) {
        System.out.println(mapProductWeight);


    }

    @Then("The greengrocer bill should be {int}")
    public void theGreengrocerBillShouldBe(int arg0) {

    }
}
