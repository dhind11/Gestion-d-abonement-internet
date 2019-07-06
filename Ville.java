import java.util.*;
public class Ville {
//Attributs
private int CodeVille;
private Vector<AbonnementPro> AbonnementsPro=new Vector<AbonnementPro>();
private Vector<AbonnementResid> AbonnementsResid=new Vector<AbonnementResid>();

//Constructors
public Ville(int codeVille, Vector<AbonnementPro> abonnementsPro, Vector<AbonnementResid> abonnementsResid) {
	CodeVille = codeVille;
	AbonnementsPro = abonnementsPro;
	AbonnementsResid = abonnementsResid;
}
public Ville() {}

//getters & setters
public int getCodeVille() {
	return CodeVille;
}
public void setCodeVille(int codeVille) {
	CodeVille = codeVille;
}
public Vector<AbonnementPro> getAbonnementsPro() {
	return AbonnementsPro;
}
public void setAbonnementsPro(Vector<AbonnementPro> abonnementsPro) {
	AbonnementsPro = abonnementsPro;
}
public Vector<AbonnementResid> getAbonnementsResid() {
	return AbonnementsResid;
}
public void setAbonnementsResid(Vector<AbonnementResid> abonnementsResid) {
	AbonnementsResid = abonnementsResid;
}

//Methods
//affichage
}
