package sample;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;
import domain.RekeningLogger;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bank tool");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Auditor auditor = new Auditor(bank);
        RekeningLogger logger = new RekeningLogger(bank);

        Rekening rekening1 = new Rekening("BE60 1234 5678 9101", 500);
        bank.voegRekeningToe(rekening1);

        Rekening rekening2 = new Rekening("BE60 9876 5432 1098", 54);
        bank.voegRekeningToe(rekening2);
    }
}
