package sremy;

public class Product {
    
    String name;

    Long price_cts;


    public Product() {
    }

    public Product(String name, Long price_cts) {
        this.name = name;
        this.price_cts = price_cts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice_cts() {
        return price_cts;
    }

    public void setPrice_cts(Long price_cts) {
        this.price_cts = price_cts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price_cts=" + price_cts +
                '}';
    }
}
