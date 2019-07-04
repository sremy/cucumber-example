package sremy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Checkout {

    List<Product> productsList = new ArrayList<>();
    List<Discount> discountList= new ArrayList<>();

    public void appendItems(List<Product> productsList) {
        this.productsList.addAll(productsList);
    }

    public void appendDiscounts(List<Discount> discountList) {
        this.discountList.addAll(discountList);
    }

    Long computeTotalPrice() {
        long total = productsList.stream().map(p -> p.getPrice_cts()).reduce((x, y) -> x + y).get();
        total -= discountList.stream().map(p -> p.getDiscount_cts()).reduce((x, y) -> x + y).orElseGet(() -> 0l);
        return total;
    }


}
