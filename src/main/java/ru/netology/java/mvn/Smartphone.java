package ru.netology.java.mvn;

public class Smartphone extends Product {
    private String Manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        Manufacturer = manufacturer;
    }
}
