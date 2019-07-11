import java.util.Scanner;

public class AbonnementPro extends Abonnement {

//Attribut
private PersonneMorale PM;//personne morale
//Constructors
public AbonnementPro(CategorieCnx categorie,MaDatte dateDebCnx,MaDatte finCnx,MaDatte dernierPaiment,PersonneMorale PM) {
		super(categorie, dateDebCnx, finCnx, dernierPaiment);
		this.PM=PM;
	}
public AbonnementPro()
{
	Scanner sc=new Scanner(System.in);int jj,mm,aaaa;
	System.out.println("donner le num de client:");(this.PM).setNumClient(sc.nextInt());// numClient
	System.out.println("donner le numero de son telephone::");(this.PM).setNumTel(sc.next());//numtel
	System.out.println("donner son adresse:");this.PM.setAdresse(sc.next());//adresse 
	System.out.println("donner la penalité de retard:");this.PM.setPénalitéRetard(sc.nextInt());//penaliteRetard
	System.out.println("donner la RS:");(this.PM).setNumClient(sc.nextInt());//RS
	System.out.println("donner le NRC:");(this.PM).setNumClient(sc.nextInt());//NRC
	System.out.println("donner le debit:");this.categorie.setDebit(sc.next());//categoriecnx.debit
	System.out.println("donner le tarif:");this.categorie.setTarif(sc.nextDouble());//categoriecnx.tarif
	System.out.println("donner la durée:");this.categorie.setDuree(sc.nextInt());//categoriecnx.durée
	System.out.println("donner la durée:");this.categorie.setType(sc.next());//categoriecnx.type
	System.out.println("************************Date debut de connexion******************");
    System.out.println("donner le jour debut cnx en numero:");jj=sc.nextInt();
    System.out.println("donner le mois debut cnx en numero:");mm=sc.nextInt();
    System.out.println("donner l'année  debut cnx en numero:");aaaa=sc.nextInt();
	this.DateDebCnx=new MaDatte(jj,mm,aaaa);
	//************************Date fin de connexion******************
	this.FinCnx=null;
	this.DernierPaiment=null;
	//*********************************************************************
	sc.close();
}

//Getter & Setter 
public PersonneMorale getPM() {
	return PM;
}

public void setPM(PersonneMorale pM) {
	this.PM = pM;
}
//methods
@Override
public String toString() {
	return "AbonnementPro [PM=" + PM + ", categorie=" + categorie + ", DateDebCnx=" + DateDebCnx + ", FinCnx=" + FinCnx
			+ ", DernierPaiment=" + DernierPaiment + ", retard=" + retard + "]";
}

}
