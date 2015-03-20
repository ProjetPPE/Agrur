package agrur;

public class TestAgrur {
	Produit produit1 = new Produit("Châtaigne", "fraiche entière", 2);
	Produit produit2 = new Produit("Pignon", "sec", 5);
	
	
	Distributeur distributeur1 = new Distributeur("D1", "Auchan");
	Distributeur distributeur2 = new Distributeur("D2", "Carrefour");
	
	Commande commande1 = new Commande(1, 2500, "sachet", 50, 07/02/2014,produit1);
	Commande commande2 = new Commande();
}
