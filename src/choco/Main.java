package choco;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import choco.model.EcouteurCase;
import choco.model.Plateau;

import choco.view.VueCase;
import choco.view.VueTour;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Plateau jeu = new Plateau("Lenôtre","Loiseau");
        BorderPane root = new BorderPane();

        VueCase vueGame = new VueCase(jeu);
        VueTour vueTour = new VueTour(jeu);
        jeu.addObserver(vueGame);
        jeu.addObserver(vueTour);

        root.setCenter(vueGame);
        root.setTop(vueTour);
        
        primaryStage.setScene(new Scene(root, 675, 590));
        primaryStage.setTitle("Chocobar");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
