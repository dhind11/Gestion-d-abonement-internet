
public class PersonneMorale extends Client{
//Attributs
private String RS;//raison sociale pouvant etre enum
private int NRC;//Numero de registre de commerce 

//Constructor
public PersonneMorale(int numClient, String numTel,Adresse adresse, String rS, int nRC) {
	super(numTel, adresse);
	RS = rS;
	NRC = nRC;
}
public PersonneMorale(String numTel, Adresse adresse) {
	super(numTel, adresse);
}
public PersonneMorale() {}
//Getters and setters
public String getRS() {
	return RS;
}
public void setRS(String rS) {
	RS = rS;
}
public int getNRC() {
	return NRC;
}
public void setNRC(int nRC) {
	NRC = nRC;
}

//Methods
public void afficher()
{
	System.out.println("PersonneMorale [RS=" + RS + ", NRC=" + NRC + "]");
}
}
