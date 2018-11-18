package choco.view;
import choco.model.*;

import java.util.Observer;
import java.util.Observable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class VueCase extends GridPane implements Observer {
    private Button[][] grille;

    public VueCase(Observable observable){
        super();
        ((Plateau) observable).addObserver(this);
        this.grille = new Button[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) this.grille[i][j]= new Button("Burger");
                else this.grille[i][j]= new Button("Choco");
                this.grille[i][j].setOnAction(new EcouteurCase(((Plateau) observable),i,j));
                this.add(this.grille[i][j], i,j);
            }
        }
    }

    @Override
    public void update(Observable observable, Object o) {

        Plateau game = (Plateau) observable;
        if (game.isWon()){
            Joueur winner = game.getWinner();
            //lab.setText("La partie est terminé : "+ a.get_name() + " a gagné");
        }
        int x = 0;
        int y = 0;
        boolean found = false;
        while (x<10 && !found){
            while(y<10 && !found){
                if (this.grille[x][y] == (Button) o) found = true;
                y++;
            }
            x++;
        }
        for (int i = x; i < 10; i++) {
            for (int j = y; j < 10; j++) {
                this.grille[i][j].setVisible(false);
            }
        }
        game.delTile(x, y);


    }
}
