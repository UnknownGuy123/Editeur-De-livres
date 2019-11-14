import java.util.ArrayList;
import java.util.*;

public class auteur {
	private String nom;
	private double DroitsAuteur;
	private int NiveauAuteur;
	ArrayList<Livre> ListeLivre = new ArrayList<Livre>();

	public auteur(String nom, int NiveauAuteur) {
		this.nom = nom;
		this.NiveauAuteur = NiveauAuteur;
	}

	public void DroitAuteur(double prix) {
		if (getNiveauAuteur() == 1) {
			setDroitsAuteur(prix * 0.60);

		}
		if (getNiveauAuteur() == 2) {
			setDroitsAuteur(prix * 0.40);

		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getDroitsAuteur() {
		return DroitsAuteur;
	}

	public void setDroitsAuteur(double droitsAuteur) {
		DroitsAuteur = droitsAuteur;
	}

	public int getNiveauAuteur() {
		return NiveauAuteur;
	}

	public void setNiveauAuteur(int niveauAuteur) {
		NiveauAuteur = niveauAuteur;
	}

	public void ajoutListLivre(Livre Livre) {

		this.ListeLivre.add(Livre);
	}

	public void Afficher() {
		System.out.println("Le nom ou les noms : " + getNom() + "/nDroits d'auteur : " + getDroitsAuteur()
				+ "/nNiveau de l'auteur : " + getNiveauAuteur());

	}

}
