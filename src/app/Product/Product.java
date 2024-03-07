package app.Product;

import java.util.Objects;

public class Product {

    String name;
    String amount;
    String price;

    public Product(String name, String amount, String price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(amount, product.amount) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
