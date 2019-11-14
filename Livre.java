
/**
 * @author Maximen
 *
 */
import java.util.*;
public class Livre {

	private int ISBN;
	private String Titre;
	private double prix;
	private auteur auteur;
	private Edition Edition;
	ArrayList<auteur> ListeAuteur = new ArrayList<auteur>();
	ArrayList<Edition> ListeEdition = new ArrayList<Edition>();
	
	public Livre (String Titre, int ISBN, double prix,auteur auteur, Edition Edition) {
		this.Titre=Titre;
		this.ISBN= ISBN;
		this.prix=prix;
		this.auteur=auteur;
		this.Edition=Edition;
		ajoutListAuteur(auteur);
		ajoutListEdition(Edition);
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void ajoutListAuteur(auteur auteur)
	{
		auteur.DroitAuteur(this.prix);
		this.ListeAuteur.add(auteur);
		auteur.ajoutListLivre(this);
	}
	
	public void ajoutListEdition(Edition Edition)
	{
		this.ListeEdition.add(Edition);
	}
	
	public auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(auteur auteur) {
		this.auteur = auteur;
	}
	
	
	public Edition getEdition() {
		return Edition;
	}
	public void setEdition(Edition Edition) {
		this.Edition = Edition;
	}
	
	
	public void Afficher()
	{
		System.out.println("    o Le Titre du Live : "+getTitre()+" ISBN : "+getISBN()+" Prix : "+ getPrix());
	
	}
	
}
