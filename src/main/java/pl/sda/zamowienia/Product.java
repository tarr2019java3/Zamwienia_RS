package pl.sda.zamowienia;

import pl.sda.zamowienia.exceptions.SmallLetterException;

import java.util.regex.Pattern;

public class Product {
    private String name;
    private double price;
    private Category category;

    public Product() {

    }

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws SmallLetterException {
        if (!this.checkName(name)) {
            throw new SmallLetterException("Proszę podawać nazwy produku z dużych liter.");
        } else
            this.name = name;
    }

    public boolean checkName(String name){
        return name ; *// TODO: 08.03.2020 dokończyć, wykorzystując tablice ASCII 
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
