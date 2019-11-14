import java.util.*;
public class Librairies {
	ArrayList<Livre>  listeLivre = new ArrayList();
	public  ArrayList<Livre> Commande = new ArrayList<Livre>();
	private String nom;
	private String Adresse;
	private int Numero;
	

	public Librairies(String nom, String Adresse, int Numero) {
		this.nom = nom;
		this.Adresse = Adresse;
		this.Numero = Numero;
		
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}

	public void AfficherInfo() {
		System.out.println("Le nom : " + getNom() + "Adresse : " + getAdresse());

	}

	


	public void AjoutLivre(Livre Livre) {
		listeLivre.add(Livre);

	}

	public void FaireCommande(Livre Livre) {
		
		Commande.add(Livre);
		
	}
	
	public void FaireCommandeMultiple(ArrayList<Livre> listelivre) {
		
		Commande.addAll(listelivre);
		
	}
	

}
