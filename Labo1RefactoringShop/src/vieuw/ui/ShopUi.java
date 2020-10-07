package vieuw.ui;


import domain.Product;
import domain.model.*;

import javax.swing.*;
import java.awt.*;

public class ShopUi {
    public static void showProduct(Shop shop) {
        String id = JOptionPane.showInputDialog("Enter the id:");
        JOptionPane.showMessageDialog(null, shop.getProduct(id).getTitel());
    }


    public static void showPrice(Shop shop) {
        String id = JOptionPane.showInputDialog("Enter the id:");
        Product p = shop.getProduct(id);
        Boolean found = true;
        if (id == null) {
            found = false;
        }
        if (found) {
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");
            int days = Integer.parseInt(daysString);
            JOptionPane.showMessageDialog(null, shop.getProduct(id).getPrice(days));
        }
    }

    public static void addProduct(Shop shop) {
        String id = JOptionPane.showInputDialog("Enter the id:");
        String titel = JOptionPane.showInputDialog("titel");
        String type = JOptionPane.showInputDialog("M for movies, G for games, CD for CD");

        if (type.equals("M")) {
            Product p = new Movie(id, titel);
            shop.add(p);
        } else if (type.equals("CD")) {
            Product p = new CD(id, titel);
            shop.add(p);
        } else {
            Product p = new Game(id, titel);
            shop.add(p);
        }
    }

    public static void showAllProduct (Shop shop){
        System.out.print(shop.printAllProducts());
    }
}
