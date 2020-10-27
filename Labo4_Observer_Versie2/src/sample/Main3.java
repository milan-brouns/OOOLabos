package sample;

import domain.Auditor2;
import domain.Bank2;
import domain.Rekening2;
import domain.RekeningLogger2;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bank tool");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Bank2 bank = new Bank2();
        Auditor2 auditor = new Auditor2(bank);
        RekeningLogger2 logger = new RekeningLogger2(bank);

        Rekening2 rekening1 = new Rekening2("BE60 1234 5678 9101", 500);
        bank.voegRekeningToe(rekening1);
        bank.deposit(rekening1, 200);

    }
}
