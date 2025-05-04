package model;

public class Drink extends Product {
    private boolean isCold;

    public Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    @Override
    public String getInfo() {
        return "Drink: " + getName() + " - $" + getPrice() + (isCold ? " (Cold)" : " (Room Temp)");
    }
}
