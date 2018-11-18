package choco.model;
public class TestPlateau {
    public static void main(String[] args) {
        Plateau jeu = new Plateau();
        int i = 1;
        while( !jeu.isWon() && i < 12){
            System.out.print(jeu.toString());
            jeu.delTile(10-i,10-i);
            jeu.setPlayerTurn();
            i++;
        }
    }
}
