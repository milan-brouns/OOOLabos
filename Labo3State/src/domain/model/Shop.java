package domain.model;

import domain.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Product> producten;

    public Shop() {
        producten = new ArrayList<>();
    }

    public void add(Product p) {
        producten.add(p);
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public Product getProduct(String id) {
        for (Product p : producten) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public String printAllProducts() {
        String result = new String();
        for (Product p : producten) {
            if (p instanceof Movie) {
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        for (Product p : producten) {
            if (p instanceof Game) {
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        for (Product p : producten) {
            if (p instanceof CD) {
                result += p.getClass().getSimpleName() + ": " + p.getId() + " " + p.getTitel() + "\n";
            }
        }
        return result;
    }

    public void readFile(String filenaam) throws FileNotFoundException {
        File shopFile = new File(filenaam);
        Scanner scanner = new Scanner(shopFile);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] dataList = data.split(",");
            if (dataList[0].equals("Movie")) {
                Movie movie = new Movie(dataList[1], dataList[2]);
                producten.add(movie);
            } else if (dataList[0].equals("Game")) {
                Game game = new Game(dataList[1], dataList[2]);
                producten.add(game);
            } else if (dataList[0].equals("CD")) {
                CD cd = new CD(dataList[1], dataList[2]);
                producten.add(cd);
            }else {
                System.out.println("niet toe gevoegt.");
            }
        }
        scanner.close();


    }

    public void writeFile(String filenaam) throws IOException {
        File file = new File(filenaam);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(filenaam);
        for (Product p : producten) {
            fileWriter.write(p.getClass().getSimpleName() + "," + p.getId() + "," + p.getTitel() + "\n");
        }
        fileWriter.close();
    }
}