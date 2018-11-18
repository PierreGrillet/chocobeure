import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import choco.model.EcouteurCase;
import choco.model.Plateau;

import choco.view.VueCase;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Plateau jeu = new Plateau("Lenôtre","Loiseau");
        BorderPane root = new BorderPane();
        root.setCenter(new VueCase(jeu));

        primaryStage.setScene(new Scene(root, 512, 512));
        primaryStage.setTitle("Chocobar");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
