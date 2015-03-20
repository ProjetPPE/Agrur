package agrur;
import java.util.Date;
public class Commande {
    private int id;
    private Produit leProduit;
    private float prixHt;
    private String conditionnement;
    private int quantite;
    private Date dateConditionnement;
    private Date dateEnvoi;
    
    
    //constructeur
    public Commande(int unId, float unPrixHt, String unConditionnement, int uneQuantite, Date uneDateConditionnement, Produit unProduit){
        this.id = unId;
        this.prixHt = unPrixHt;
        this.conditionnement = unConditionnement;
        this.quantite = uneQuantite;
        this.leProduit = unProduit;
        this.dateConditionnement = uneDateConditionnement;
        this.dateEnvoi = null;
    }
    
    //getteur
    public int getId(){
        return this.id;
    }
    
    public Produit getProduit(){
        return this.leProduit;
    }
    
    public float getPrixHt(){
        return this.prixHt;
    }
    
    public String getConditionnement(){
        return this.conditionnement;
    }
    
    public int getQuantite(){
        return this.quantite;
    }
    
    public Date getDateConditionnement(){
        return this.dateConditionnement;
    }
    
    public Date getDateEnvoi(){
        return this.dateEnvoi;
    }
    
    //setteur
    public void setDateEnvoi(Date uneDate){
    	this.dateEnvoi = uneDate;
    }
    
    //retourne vrai si la commande n'est pas encore expédiée, faux sinon.
    public boolean enCours(){
        if(this.dateEnvoi == null){//test de la variable dateEnvoi
            return true;//si dateEnvoi null alors commande en cours
        }
        else{
            return false;
        }
    }
}
