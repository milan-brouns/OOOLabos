package vieuw.ui;

import static vieuw.ui.ShopUi.*;
import javax.swing.*;
import domain.model.*;

import java.io.File;
import java.io.IOException;


public class appeke {
    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();
        String filenaam= "shop.txt";
        File shopProducten =new File(filenaam);
        try {
            shopProducten.createNewFile();
        }catch (IOException e){

        }
        shop.readFile(filenaam);
        shopProducten.delete();



        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. show all Product\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct(shop);
            } else if (choice == 2) {
                showProduct(shop);
            } else if (choice == 3) {
                showPrice(shop);
            } else if (choice == 4) {
                showAllProduct(shop);
            }
        }
        shop.writeFile(filenaam);
    }
}