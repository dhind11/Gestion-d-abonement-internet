public class AbonnementResid extends Abonnement {
//Attribut
private PersonnePhysique PP;
//Constructors
public AbonnementResid(CategorieCnx categorie,MaDatte dateDebCnx,PersonnePhysique Pp) {
		super(categorie, dateDebCnx);
		this.PP=Pp;
	}
public AbonnementResid() {}
//getter & setter
public PersonnePhysique getPP() {
	return PP;
}
public void setPP(PersonnePhysique PP) {
	this.PP = PP;
}

@Override
public String toString() {
	return "AbonnementResid [PP=" + PP + ", categorie=" + categorie + ", DateDebCnx=" + DateDebCnx + ", FinCnx="
			+ FinCnx + ", DernierPaiment=" + DernierPaiment + ", retard=" + retard + ", resilier=" + resilier + "]";
}
public void afficher()
{
	System.out.println(this.toString());
}



}