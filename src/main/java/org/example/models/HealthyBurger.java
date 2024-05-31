package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }



    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        super.setPrice(super.getPrice()+price);
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        super.setPrice(super.getPrice()+price);
    }

    @Override
    public String additionsName() {
        String newLine = System.getProperty("line.separator");
        return super.additionsName() +
                (healthyExtra1Name != null ? "HealthyAddition1: " + healthyExtra1Name + newLine : "")  +
                (healthyExtra2Name != null ? "HealthyAddition2: " + healthyExtra2Name + newLine : "");
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();
    }
}
