package sample;

import domain.Caesar;
import domain.Mirror;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button1;
    Button button2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Geheimschrift Appeke");

        TextField input = new TextField();
        button1 = new Button("Codeer");
        button2 = new Button("Decodeer");
        ChoiceBox<String> methode = new ChoiceBox<>();

        methode.getItems().add("Caesar");
        methode.getItems().add("Mirror");

        methode.setValue("Caesar");

        TextArea output = new TextArea();
        output.setEditable(false);

        button1.setOnAction(e -> output.setText(codeer(methode, input.getText())));
        button2.setOnAction(e -> output.setText(decodeer(methode, input.getText())));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(input, button1, button2, methode, output);

        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String codeer(ChoiceBox<String> methode, String zin) {
        String output = "";
        Caesar caesar = new Caesar();
        Mirror mirror = new Mirror();
        if (methode.getValue().equals("Caesar")) {
            output = caesar.codeer(zin);
        } else if (methode.getValue().equals("Mirror")) {
            output = mirror.codeer(zin);
        }
        return output;
    }

    private String decodeer(ChoiceBox<String> methode, String zin){
        String output = "";
        Caesar caesar = new Caesar();
        Mirror mirror = new Mirror();

        if(methode.getValue().equals("Caesar")){
            output = caesar.decodeer(zin);
        }else if(methode.getValue().equals("Mirror")){
            output = mirror.decodeer(zin);
        }
        return output;
    }

    private void setText() {

    }

    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == button1){
            System.out.println("It works!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
