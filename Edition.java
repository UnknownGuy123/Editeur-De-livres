
public class Edition {

	private String date;
	private String ordreEdition;
	private int NumeroUnique;
	private int nbrExemplaire;
	

	public Edition(String date) {

		setDate(date);
	}

	public Edition(String date, String OrdreEdition) {
		this(date);
		setOrdreEdition(OrdreEdition);
	}

	public Edition(String date, String OrdreEdition, int NumeroUnique) {
		this(date, OrdreEdition);
		setNumeroUnique(NumeroUnique);
	}

	public Edition(String date, String OrdreEdition, int NumeroUnique, int nbrExemplaire) {

		this(date, OrdreEdition, NumeroUnique);
		setNbrExemplaire(nbrExemplaire);

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrdreEdition() {
		return ordreEdition;
	}

	public void setOrdreEdition(String ordreEdition) {
		this.ordreEdition = ordreEdition;
	}

	public int getNumeroUnique() {
		return NumeroUnique;
	}

	public void setNumeroUnique(int numeroUnique) {
		NumeroUnique = numeroUnique;
	}

	public int getNbrExemplaire() {
		return nbrExemplaire;
	}

	public void setNbrExemplaire(int nbrExemplaire) {
		this.nbrExemplaire = nbrExemplaire;
	}

	public void Afficher() {
		System.out.println("La Date : " + getDate() + " Le numero unique : " + getNumeroUnique()
				+ " Nombre d'exemplaire: " + getNbrExemplaire() + " Ordre Edition : " + getOrdreEdition());

	}
}
