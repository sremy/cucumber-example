package sremy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import org.junit.Assert;

import java.util.List;

public class CheckoutStepdefs {

    Checkout checkout = new Checkout();

    @Given("the following products:")
    public void theFollowingProducts(List<Product> productList) {
//        List<Product> productList = dataTable.asList(Product.class);
        System.out.println(productList);
        checkout.appendItems(productList);
    }

    @Given("the following discounts:")
    public void theFollowingDiscounts(List<Discount> discountList) {
        checkout.appendDiscounts(discountList);
    }

    @When("I buy all products and ask the bill")
    public void iAskTheBill() {

    }

    @Then("The total should be {long}")
    public void theTotalShouldBe(Long expectedTotal) {
        Long totalPrice = checkout.computeTotalPrice();
        Assert.assertEquals(expectedTotal, totalPrice);
    }
}
