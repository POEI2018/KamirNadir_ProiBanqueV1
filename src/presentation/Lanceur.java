package presentation;

import java.util.ArrayList;
import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;
import domaine.VisaElectron;
import domaine.VisaPremier;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iservice service = new ServiceImpl() ;
		
		List <Client> clients = new ArrayList<Client>() ;
		List <Compte> comptes = new ArrayList<Compte>() ;
		List <CarteBancaire> cartes = new ArrayList<CarteBancaire>();
		Conseiller conseiller = new Conseiller ("sisi", "kamir", "2ruetoto", "75014", "paris", 1234, 000) ; 
		
		Client client1 = new Client() ; 
		Client client2 = new Client() ; 
		Client client3 = new Client() ;
		
		
		Compte compteep1 = new CompteEpargne() ; 
		Compte compteep2 = new CompteEpargne() ;
		Compte compteep3 = new CompteEpargne() ;
		
		Compte compteCourant1 = new CompteCourant() ; 
		Compte compteCourant2 = new CompteCourant() ; 
		Compte compteCourant3 = new CompteCourant() ; 
		
		CarteBancaire carte1 = new VisaElectron() ;
		CarteBancaire carte2 = new VisaElectron() ;
		CarteBancaire carte3 = new VisaPremier() ;
		
		service.creerClient(client1);
		service.creerCompte(compteep1);
		service.ajouterTitulaire(compteep1, client1);
		service.creerCarte(carte1);
		service.attribuerCarte(client1, carte1);
		service.attribuerConseiller(client1, conseiller);
		System.out.println(client1);
		
		

		// Fenetre fen = new Fenetre() ;

		// Local variable
		/*int swValue;
		Scanner sc = new Scanner(System.in);
		dessinerMenuPrincipal();
		swValue = sc.nextInt();

		switch (swValue) {
		case 1:
			dessinerSousMenu1() ;
			swValue = sc.nextInt();
			if (swValue == 3)
				dessinerMenuPrincipal();
			break;
		case 2:
			dessinerSousMenu2(); break;
		case 3:
			dessinerSousMenu3(); break;
		default:
			System.out.println("QUITTER"); break;
		}*/
	}

	public static void dessinerMenuPrincipal() {
		// AFFICHER LE MENU DE SELECTION DES OPTIONS
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|            OPTIONS:                                                  |");
		System.out.println("|                                 [1] CREER UN COMPTE                  |");
		System.out.println("|                                 [2] MODIFIER UN COMPTE               |");
		System.out.println("|                                 [3] SUPPRIMER UN COMPTE              |");
		System.out.println("|                                 [3] LISTER LES COMPTES               |");
		System.out.println("|                                 [5] QUITTER                          |");
		System.out.println("========================================================================");
	}
	
	public static void dessinerSousMenu1(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|            CREATION D'UN COMPTE:                                     |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
		
	}
	
    public static void dessinerSousMenu2(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|             MODFIER UN COMPTE:                                       |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
   }
    
    public static void dessinerSousMenu3(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|                          SUPPRIMER UN COMPTE:                        |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
		
	}
}
