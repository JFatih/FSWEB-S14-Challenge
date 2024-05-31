package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String  addition1Name,  addition2Name,  addition3Name,  addition4Name;
    private double addition1Price,addition2Price,addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
    }

    public String additionsName(){
        String newLine = System.getProperty("line.separator");
        return (addition1Name != null ? "Addition1: " + addition1Name + newLine : "")  +
                (addition2Name != null ? "Addition2: " + addition2Name + newLine : "")  +
                (addition3Name != null ? "Addition3: " + addition3Name + newLine : "")  +
                (addition4Name != null ? "Addition4: " + addition4Name + newLine : "");
    }

    public void itemizeHamburger(){
        String newLine = System.getProperty("line.separator");
        System.out.println(
                "Name: " + name + newLine +
                "Meat: " + meat + newLine +
                "BreadRollType: " + breadRollType + newLine +
                additionsName() +
                "Price: " + String.valueOf(price)
        );
        System.out.println("**************************");
    }
}
