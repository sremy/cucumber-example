package sremy;

public class Discount {

    String name;

    Long discount_cts;

    public Discount() {
    }

    public Discount(String name, Long discount_cts) {
        this.name = name;
        this.discount_cts = discount_cts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDiscount_cts() {
        return discount_cts;
    }

    public void setDiscount_cts(Long discount_cts) {
        this.discount_cts = discount_cts;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "name='" + name + '\'' +
                ", dicount_cts=" + discount_cts +
                '}';
    }
}
