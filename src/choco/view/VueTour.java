package choco.view;
import choco.model.*;

import java.util.Observer;
import java.util.Observable;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class VueTour extends VBox implements Observer {
    private Text tour;

    public VueTour(Observable observable){
        super();
        Plateau game = (Plateau) observable;
        game.addObserver(this);
        this.tour= new Text("C'est au tour de "+game.getTurnPlayer().toString()+" de jouer.");
        tour.setX(50);
        tour.setY(50);
    }

    @Override
    public void update(Observable observable, Object o){
        Plateau game = (Plateau) observable;
        if (game.isWon()){
            this.tour.setText(game.getWinner().toString()+" a gagné !");
        }
        else this.tour.setText("C'est au tour de "+game.getTurnPlayer().toString()+" de jouer.");

    }
}
