import java.util.Date;

public class PersonnePhysique extends Client{
//Attributs
private int NPI;//Numero de piece d'identité
private String nom;
private String prenom;
private MaDatte datenaiss;//date de naissance

//Constructor
public PersonnePhysique(String numTel, Adresse adresse, int nPI, String nom, String prenom,
		MaDatte datenaiss) {
	super(numTel, adresse);
	NPI = nPI;
	this.nom = nom;
	this.prenom = prenom;
	this.datenaiss = datenaiss;
}
public PersonnePhysique(int numClient, String numTel, Adresse adresse) {
	super(numTel, adresse);
}
public PersonnePhysique() {}
//Getters and setters
public int getNPI() {
	return NPI;
}
public void setNPI(int nPI) {
	NPI = nPI;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public MaDatte getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(String datenaiss) {
	this.datenaiss=new MaDatte(datenaiss);
}

//Methods
public void afficher()
{
	System.out.println("PersonnePhysique [NPI=" + NPI + ", nom=" + nom + ", prenom=" + prenom + ", datenaiss=" + datenaiss + "]");
}
}
