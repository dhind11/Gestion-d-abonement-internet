public class AbonnementPro extends Abonnement {

//Attribut
private PersonneMorale PM;//personne morale
//Constructors
public AbonnementPro(CategorieCnx categorie,MaDatte dateDebCnx,char typeAbonnement,PersonneMorale PM) {
		super(categorie, dateDebCnx,typeAbonnement);
		this.PM=PM;
	}
public AbonnementPro(){}

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
			+ ", DernierPaiment=" + DernierPaiment + ", retard=" + retard + ", resilier=" + resilier + "]";
}
public void afficher()
{
	System.out.println(this.toString());
}


}
