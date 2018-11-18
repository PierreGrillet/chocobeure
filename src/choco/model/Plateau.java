package choco.model;
import java.util.Observable;
//import java.util.Observer;

public class Plateau extends Observable{
    private Joueur j1;
    private Joueur j2;
    private boolean turn;
    private boolean won;
    public  boolean[][] plate;

    public Plateau(){
        this.plate = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.plate[i][j]= true;
            }
        }
        this.j1 = new Joueur("Joueur1");
        this.j2 = new Joueur("Joueur2");
    }
    public Plateau(String s1, String s2){
        this.plate = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.plate[i][j]= true;
            }
        }
        this.j1 = new Joueur(s1);
        this.j2 = new Joueur(s2);
    }

    public void delTile(int x, int y){
        for (int i = x; i < 10; i++) {
            for (int j = y; j < 10; j++) {
                this.plate[i][j]= false;
            }
        }
        if (x == 0 && y == 0) setWinner();
        this.setPlayerTurn();
        this.setChanged();
        this.notifyObservers();
    }
    public void setPlayerTurn(){
        this.turn = !this.turn;
    }
    public boolean isWon(){
        return this.won;
    }
    public void setWinner(){
        if(! this.turn) System.out.print(j1.getName() + " has won !\n");
        else  System.out.print(j2.getName() + " has won !\n");
        won = true;
    }
    public Joueur getWinner(){
        if(! this.won) return null;
        if(! this.turn) return this.j1;
        else return this.j2;
    }
    public Joueur getTurnPlayer(){
        if( this.won ) return null;
        if(!this.turn) return this.j1;
        else return this.j2;
    }
    @Override
    public String toString(){
        String res = "C'est à ";
        if(this.turn) res += j1.getName();
        else res += j2.getName();
        res += " de jouer :\n";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                res += this.plate[i][j] + "\t";
            }
            res += "\n";
        }
        return res;
    }

}
