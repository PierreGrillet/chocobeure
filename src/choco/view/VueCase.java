package choco.view;
import choco.model.*;

import java.util.Observer;
import java.util.Observable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class VueCase extends GridPane implements Observer {
    private Button[][] grille;

    public VueCase(Observable observable){
        super();
        ImageView chocolatV;
        ((Plateau) observable).addObserver(this);
        this.grille = new Button[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0){
                    chocolatV = new ImageView(new Image("choco/view/Burger.png"));
                    chocolatV.setFitHeight(48);
                    chocolatV.setFitWidth(48);
                    this.grille[i][j]= new Button("", chocolatV);
                }
                else{
                    chocolatV = new ImageView(new Image("choco/view/chocolat.png"));
                    chocolatV.setFitHeight(48);
                    chocolatV.setFitWidth(48);
                    this.grille[i][j]= new  Button("", chocolatV);
                }
                this.grille[i][j].setOnAction(new EcouteurCase(((Plateau) observable),i,j));
                this.add(this.grille[i][j], i,j);
            }
        }
    }

    @Override
    public void update(Observable observable, Object o) {

        Plateau game = (Plateau) observable;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!game.plate[i][j]) this.getChildren().remove(this.grille[i][j]);
            }
        }
    }
}
