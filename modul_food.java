package model;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInfo() {
        return "Food: " + getName() + " - $" + getPrice() + " - Exp: " + expirationDate;
    }
}
