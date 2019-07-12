import java.util.*;

public class Main {

	public static void main(String[] args) {
		AbonnementPro TabPro[]=new AbonnementPro[100];
		AbonnementResid TabResid[]=new AbonnementResid[100];
		Vector<Abonnement> VAbonnement=new Vector<Abonnement>();
		Vector<Abonnement> VAbonnementRetard=new Vector<Abonnement>();
		Vector<Abonnement> VAbonnementpeutresilier=new Vector<Abonnement>();
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
		    	VAbonnement.add(AR);//ici je l'additionne au vecteur

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
		    	AP=new AbonnementPro(categoriecnx,date,'P',PM);
		    	//Abonnement Professionnel fait!
		    	VAbonnement.add(AP);//ici je l'additionne au vecteur
			}
			else System.out.println("choix non existant!");
			System.out.println("voulez-vous continuer de remplir? (non/oui)");
	    	OUINON=sc.next();
	    	if(OUINON.equals("non")){Continue=0;}
	    	System.out.println(Continue);
		}
       // on vient de remplir le vecteur 
//*********************************************************(A)**************************************************
//creer un tableau d'abonnements professionnels et afficher les abonnement en retard de paiment dans une ville vdonné
		    int i=0;
			Iterator<Abonnement> it= VAbonnement.iterator();
			while(it.hasNext())
			{
				if((it.next()).typeAbonnement =='P'){TabPro[i]=(AbonnementPro) it.next();i++;}
			}
			//Afficher les elements en retard du tableau d'abonnement professionnels dans uen ville Vdonnée
			String Vdonnee;
			System.out.println("quelle est le nom de la ville dont vous voulez afficher les abonnements professionnels en retard de paiment?");
			Vdonnee=sc.next();
			for(i=0;i<TabPro.length;i++)
			{
				if((TabPro[i].retard)&&((TabPro[i].getPM().adresse)).equals(Vdonnee)) 
				{System.out.println("cette société est en retard:");;TabPro[i].getPM().afficher();}
			}
//***********************************************************(B)**********************************************************
			//créer tableau des abonnements residentiels 		
			while(it.hasNext())
			{
				if((it.next()).typeAbonnement =='R'){TabResid[i]=(AbonnementResid)it.next();i++;}
			}
			//Afficher les ellements 
			for(i=0;i<TabResid.length;i++)
			{
				if(TabResid[i].resilier)
				{System.out.println("cette société est resilié:");TabResid[i].getPP().afficher();}
			}
//***********************************************************(C)**********************************************************
	//b)extraire les abonnements professionnels et residentiels qui sont en retard 
	it=VAbonnement.iterator();
	while(it.hasNext())
	{
		if(it.next().retard) {VAbonnementRetard.add(it.next());}
	}
//*********************************************************(D)************************************************************
	//Extraire les elements pouvant etre resilier , i.e s'il depasse 2 mois (ils sont deja en retard)
	//VAbonnementpeutresilier
	System.out.println("donnez date pour voir si l'abonnement peut etre resilié (jj/mm/aaaa)");
	date=new MaDatte(sc.next());
	while(it.hasNext())
	{
		if(it.next().PeutEtreResilier(date)) {VAbonnementpeutresilier.add(it.next());}
	}
//*********************************************************(D)************************************************************	
//afficher les abonnements Actifs par ville 
	//changer en arraylist le tableau des abonnement 
	List<Abonnement> arraylist = new ArrayList<>(); 
	while(it.hasNext())
	{
		arraylist.add(it.next());
	}
	//afficher actif
	it=arraylist.iterator();Iterator it2=arraylist.iterator();
	while(it.hasNext())
	{
		
	}
	
	
	
	}

}
