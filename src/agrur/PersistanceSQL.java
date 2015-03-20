package agrur;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class PersistanceSQL {
    // on cr�e un objet connexion
    private Connection connexion = null;
   
    public PersistanceSQL(String ipBase, int port, String nomBaseDonne){
        /**Constructeur de la classe persistance.
         * On instancie la variable connexion avec l'aide du Driver JDBC
         * Puis on se connecte à la base de donnée
         * on g�re 2 exceptions, si la classe n'existe pas 
         */
        try{
            Class.forName("org.gjit.mm.mysql.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/Agrur","login","mdp");
            System.out.println("Connexion réussie");
            
        
                 
        }catch(ClassNotFoundException ex){
            System.out.println("Classe non trouvée");
        }catch(SQLException ex){
            System.out.println("Connexion échouée");
        }finally{
            try{
                if(connexion != null){
                    connexion.close();
                }
            }catch(SQLException ex){
                System.out.println("Fermeture de la connexion échouée");
            }
        }
    }
       
    
    public void RangerDansBase(Object unObjet){
        
    }
    
    public NomClasse /*?*/ ChargerDepuisBase(String id, String nomClasse){
        return /*objet NomClasse */;
    }
}
