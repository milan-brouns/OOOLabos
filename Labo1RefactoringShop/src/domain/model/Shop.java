package domain.model;

import domain.Product;

import java.util.ArrayList;

public class Shop {
    ArrayList<Product> producten;

    public Shop() {
        producten = new ArrayList<>();
    }

    public void add (Product p){
        producten.add(p);
    }

    public ArrayList<Product> getProducten (){
        return producten;
    }

    public Product getProduct (String id){
        for (Product p : producten){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public String printAllProducts (){
        String result = new String();
        for (Product p : producten){
            if (p instanceof Movie){
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        for (Product p : producten){
            if (p instanceof Game){
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        for (Product p : producten){
            if (p instanceof CD){
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        return result;
    }
}