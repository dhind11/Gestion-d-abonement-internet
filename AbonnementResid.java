import java.util.Date;

public class AbonnementResid extends Abonnement {
//Attribut
private PersonnePhysique PP;
//Constructors
public AbonnementResid() {
		super();
	}

//getter & setter
public PersonnePhysique getPP() {
	return PP;
}
public void setPP(PersonnePhysique PP) {
	this.PP = PP;
}

}
