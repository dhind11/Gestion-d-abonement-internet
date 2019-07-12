import java.util.*;

public class Main {

	public static void main(String[] args) {
		Vector<Abonnement> Abonnementpro=new Vector<Abonnement>();
		Vector<Abonnement> Abonnementresid=new Vector<Abonnement>();
		Vector<Abonnement> Abonnement=new Vector<Abonnement>();
		PersonnePhysique PP=new PersonnePhysique();
		PersonneMorale PM=new PersonneMorale();
		AbonnementPro AP=new AbonnementPro();
		AbonnementResid AR=new AbonnementResid();
		Scanner sc=new Scanner(System.in);
		CategorieCnx categoriecnx=new CategorieCnx();
		MaDatte date;
		int choix;
		int Continue=1;
		Adresse adr=new Adresse();
		String OUINON;
		while(Continue==1)
		{
			System.out.println(Continue);
			System.out.println("voulez-vous créer un abonnement pour:"+"\n"+"1)une personne normale"+"\n"+"2) une société"+"\n"+"inserez le numero de votre choix...");
			choix=sc.nextInt();
			if(choix==1)
			{
				
				//je remplis PP
		    	PP=new PersonnePhysique();
		    	System.out.println("donnez num tel");//num tel
		    	PP.setNumTel(sc.next());
		    	System.out.println("donnez adresse:");//Adresse
		    	System.out.println("-num rue:");
		    	adr.numrue=sc.nextInt();
		    	System.out.println("-nom de rue:");
		    	adr.nomrue=sc.next();
		    	System.out.println("-codepostale:");
		    	adr.codepostal=sc.nextInt();
		    	System.out.println("-nom de la ville:");
		    	adr.ville=sc.next();
		    	System.out.println("-codeville:");
		    	adr.codeville=sc.nextInt();
		    	PP.setAdresse(adr);//fin adresse 
		    	System.out.println("donnez Numero de piece d'identité: ");//Numero de piece d'identité
		    	PP.setNPI(sc.nextInt());
		    	System.out.println("donnez Nom:");//nom
		    	PP.setNom(sc.next());
		    	System.out.println("donnez prenom:");//prenom
		    	PP.setPrenom(sc.next());
		    	System.out.println("donnez date de naissance (jj/mm/aaaa):");//date de naissance
		    	PP.setDatenaiss(sc.next());
		    	// PP remplit!!!!!
		    	//remplir abonnement residentiel
		    	System.out.println("donnez Categorie cnx");
		    	System.out.println("type (ETHERNET/USB/WIFI):");
		    	categoriecnx.setType(sc.next());
		    	System.out.println("debit (256K, 512K, 1M, 2M):");
		    	categoriecnx.setDebit(sc.next());
		    	System.out.println("durée:");
		    	categoriecnx.setDuree(sc.nextInt());
		    	System.out.println("tarif:");
		    	categoriecnx.setTarif(sc.nextDouble());
		    	System.out.println("donnez date debut cnx (jj/mm/aaaa)");
		    	date=new MaDatte(sc.next());//here
		    	AR=new AbonnementResid(categoriecnx,date,PP);
		    	//Abonnement Residentiel fait!
		    	Abonnement.add(AR);//ici je l'additionne au vecteur

			}
			else if(choix==2)
			{
				//je remplis PM***************
		    	PM=new PersonneMorale();//instanciation de personne morale PM
		    	System.out.println("donnez num tel");//numTelephone**********
		    	PM.setNumTel(sc.next());
		    	System.out.println("donnez adresse:");//Adresse*********
		    	System.out.println("-num rue:");
		    	adr.numrue=sc.nextInt();
		    	System.out.println("-nom de rue:");
		    	adr.nomrue=sc.next();
		    	System.out.println("-codepostale:");
		    	adr.codepostal=sc.nextInt();
		    	System.out.println("-nom de la ville:");
		    	adr.ville=sc.next();
		    	System.out.println("-codeville:");
		    	adr.codeville=sc.nextInt();
		    	PP.setAdresse(adr);//fin adresse***********
		    	System.out.println("donnez Raison sociale:");//Raison sociale******************
		    	PM.setRS(sc.next());
		    	System.out.println("donnez Numero de registre de commerce:");//numero de registre de commerce**************
		    	PM.setNRC(sc.nextInt());
		    	// PM remplit!!!!!
				//je crée l'abonnement professionnel**************
				System.out.println("donnez Categorie cnx");
		    	System.out.println("type (ETHERNET/USB/WIFI):");//type cnx *************
		    	categoriecnx.setType(sc.next());
		    	System.out.println("debit (256K, 512K, 1M, 2M):");//debit***************
		    	categoriecnx.setDebit(sc.next());
		    	System.out.println("durée:");//durée********************
		    	categoriecnx.setDuree(sc.nextInt());
		    	System.out.println("tarif:");//tarif*********************
		    	categoriecnx.setTarif(sc.nextDouble());
		    	System.out.println("donnez date debut cnx (jj/mm/aaaa)");//date deb cnx**************
		    	date=new MaDatte(sc.next());
		    	AP=new AbonnementPro(categoriecnx,date,PM);
		    	//Abonnement Professionnel fait!
		    	Abonnement.add(AP);//ici je l'additionne au vecteur
			}
			else System.out.println("choix non existant!");
			System.out.println("voulez-vous continuer de remplir? (non/oui)");
	    	OUINON=sc.next();
	    	if(OUINON.equals("non")){Continue=0;}
	    	System.out.println(Continue);
		}
		// on vient de remplir le vecteur 
//1)creer un tableau d'abonnements professionnels et afficher les abonnement en retard de paiment dans une ville vdonnée
		

	}

}
