package Market;

public class Product extends Main{
    private String name;
    private double price;
    private double count;
    private Category category;
    private double code;

    public Product() {
        this.name = name;
        this.price = price;
        this.count = count;
        this.category = category;
        this.code  = code;
    }

    public Product(String name, double price, double count, double code) {
        super();
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public double getCount() {
        return count;
    }

    public double setCount(double count) {
        this.count = count;
        return count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", category=" + category +
                ", code=" + code +
                '}';
    }
}
