package agrur;
import java.util.*;
public class Distributeur {
    private String id;
    private String nom;
    private ArrayList<Commande> lesCommandes;
    
        //constructeur
    
        public Distributeur(String unId, String unNom){
            this.nom=unNom;
            this.id=unId;
            lesCommandes = new ArrayList<Commande>();
    }
        
        //getteur
        
        public String getId(){
            return this.id;
        }
        
        public ArrayList<Commande> getlesCommande(){
            return this.lesCommandes;
        }
        
        public ArrayList<Commande> getCommandesEnCours(){ //retourne les commandes en cours
            ArrayList<Commande> commandesEnCours = new ArrayList<Commande>();
            boolean resultat;
            for(Commande tmp: lesCommandes){
                resultat=tmp.enCours();
                if(resultat == true){
                    commandesEnCours.add(tmp);
                }
            }
            
            return commandesEnCours;
        }
}