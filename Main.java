import java.util.*;
public class Main {

	public static ArrayList<Livre> livreListMain = new ArrayList<Livre>();
	public static  ArrayList listeLibrairies = new ArrayList();
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		auteur auteur1 = new auteur("Tom",1);
		auteur auteur2 = new auteur("Bob",2);
		
		Edition edition1 = new Edition("23 janvier 2018", "Premier", 1, 2);
		Edition edition2 = new Edition("18 mai 2006", "Deuxieme", 4, 6);
		
		Livre Livre1 = new Livre("Harry pother", 234, 20,auteur1, edition1);		
		Livre Livre2 = new Livre("Seigneur des anneaux", 123, 15,auteur1, edition2);
		
		//add livre dans la list
		livreListMain.add(Livre1);
		livreListMain.add(Livre2);
		
		
		//Creer Librairie
		Librairies Librairies1 = new Librairies("SalonLivre", "345 street nine", 23);
		Librairies Librairies2 = new Librairies("ReseauLivre", "Boulevard of street", 18);
		//Ajoute la librairie dans la liste des librairies
		listeLibrairies.add(Librairies1);
		listeLibrairies.add(Librairies2);
		//Librairies1 fait une commande simple d'un livre
		Librairies1.FaireCommande(Livre1);
		//Librairies2 fait une commande de plusieurs livres
		Librairies2.FaireCommandeMultiple(livreListMain);
		
		//Fonctionalite
		affListeLivreAuteur();
		affPourNumLivre();
		affPourNumEdition();
		CommandeList();
		//AfficherToutInfo(Livre1);
	}
	
	//Add librairies dans la liste
	public static void AjoutLibrairie(Librairies Librairies) {
		listeLibrairies.add(Librairies);
	}
	
	//Une fonctionnalité permettant d’afficher pour un numéro d’auteur(Son nom dans mon code) la liste de ses livres
	 public static void affListeLivreAuteur()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entrer le nom de l'auteur vous chercher : ");
			String i = sc.nextLine();
			System.out.println("Liste des Livre de l'auteur "+ i+" : \n");
			for(int x = 0; x< livreListMain.size();x++)
				
			{
				Livre livres =   livreListMain.get(x);
				
				if(i.equals(livres.getAuteur().getNom()))
				{
					System.out.println(" o "+livres.getTitre()+"\n");
				}
			}
		}
		
	//Une fonctionnalité permettant d’afficher pour un numéro de livre le nombre d’éditions, le numéro de l’édition 
		public static void affPourNumLivre()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entrer le ISBN du livre : ");
			int i = sc.nextInt();
			
			for(int x = 0; x< livreListMain.size();x++)
			{
				Livre livres =   livreListMain.get(x);
				if(livres.getISBN()== i)
				{
					System.out.println("Le nombre d'edition : " + livres.getEdition().getNbrExemplaire() + "\nLe numero de l'edition : " + livres.getEdition().getNumeroUnique());
				}
			}
		}
		
		//Une fonctionnalité permettant d’afficher pour un numéro d’édition le nom du livre de l’édition et le nombre d’exemplaire
		public static void affPourNumEdition()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entrer Un Numero d'edition : ");
			int i = sc.nextInt();
			
			for(int x = 0; x< livreListMain.size();x++)
			{
				Livre livres =  livreListMain.get(x);
				if(livres.getEdition().getNumeroUnique()== i)
				{
					System.out.println("Le titre du livre : " + livres.getTitre() + "\nLe nombre d'exemplaire : " + livres.getEdition().getNbrExemplaire());
				}
			}
		}
		//Une fonctionnalité permettant de retourner pour chaque librairie la liste des livres commandés
		public static void CommandeList() {
			System.out.println("-------COMMANDE DES LIBRAIRIES---------");
			
			for (int x = 0; x < listeLibrairies.size(); x++) {
				Librairies NewLibrairie = (Librairies) listeLibrairies.get(x);
				System.out.println("---La liste de Commande de la librairie " + NewLibrairie.getNom());
				
				for (int i = 0; i < NewLibrairie.Commande.size() ; i++) {
					if (NewLibrairie.Commande.size() <= 0) {
						System.out.println("Aucune commande de fait dans cette librairie ");
					} else {
						NewLibrairie.Commande.get(i).Afficher();
					}
				}

			}
		}
		
		
		
		//Affiche toute l'info sur un livre
		 public static void AfficherToutInfo(Livre a )
		    {
		    	System.out.println("-----------Info livre------------------");
		        System.out.println("Livre : " + a.getTitre());
		        System.out.println("ISBN : " + a.getISBN());
		        System.out.println("prix : " + a.getPrix() + " $");
		        
		        
		        System.out.println("--------");
		        System.out.println("Date : " + a.getEdition().getDate());
		        System.out.println("Ordre Edition : " + a.getEdition().getOrdreEdition());
		        System.out.println("Numero Unique : " + a.getEdition().getNumeroUnique());
		        System.out.println("Nombre D'exemplaire :"+a.getEdition().getNbrExemplaire());
		        
		        System.out.println("--------");
		        
		      
		        System.out.println("Info Auteur : \nPrenom  : " + a.getAuteur().getNom() +"\nDroitAuteur : "+a.getAuteur().getDroitsAuteur()+"$" +"\nNiveauAuteur : "+a.getAuteur().getNiveauAuteur());
		        System.out.println("-----------------------------");
		    }
}
