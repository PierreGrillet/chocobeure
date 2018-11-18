package choco.model;
public class Joueur {
    private String name;
    Joueur(){
        this.name = null;
    }
    public Joueur(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
