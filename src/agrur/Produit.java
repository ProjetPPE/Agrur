package agrur;
public class Produit {
    private String variete; //exemple "Mayette"
    private String type; //exemple "fraîche entière"
    private int calibre; //exemple : 2
    
    public Produit(  String variete, String type, int calibre){ //Constructeur
        this.calibre=calibre; 
        this.type=type;
        this.variete=variete;
    }
    
    public String getVariete(){ //retourne une chaine contenant la variété
        return this.variete;
    }
    
    public String getType(){ //retourne une chaine contenant le type
        return this.type;
    }
    
    public int getCalibre(){ //retourne un entier contenant le calibre
        return this.calibre;
    }
}