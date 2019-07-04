package sremy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AdditionStepDefs {

    Calculator calculator = new Calculator();
    
    @Given("a is {int}")
    public void aIs(int entier) {
        calculator.add(entier);
    }

    @And("b is {int}")
    public void bIs(int entier) {
        calculator.add(entier);
    }

    @When("I ask the addition")
    public void iAskTheAddition() {

    }

    @Then("I should be told {int}")
    public void iShouldBeTold(int total) {
        Assert.assertEquals(total, calculator.getTotal());
    }


    @Given("the following figures:")
    public void theFollowingFigures(List<Integer> list) {
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(calculator.add(list));
    }
}
