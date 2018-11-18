package choco.model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;

public class EcouteurCase implements EventHandler<ActionEvent> {
    private int x;
    private int y;
    private Plateau p;
    public EcouteurCase(Plateau p, int x, int y){
        this.x = x;
        this.y = y;
        this.p = p;
    }

    @Override
    public void handle(ActionEvent e){
        p.delTile(this.x, this.y);
    }

}
