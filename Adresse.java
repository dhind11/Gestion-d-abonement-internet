
public class Adresse {
//Attributs
private int numrue,codepostal,codeville;
private String nomrue;
//Constructors
public Adresse(int numrue,String nomrue, int codepostal, int codeville) {
	this.numrue = numrue;
	this.nomrue = nomrue;
	this.codepostal = codepostal;
	this.codeville = codeville;
}
public Adresse() {}
//getters & setters 
public int getNumrue() {
	return numrue;
}
public void setNumrue(int numrue) {
	this.numrue = numrue;
}
public String getNomrue() {
	return nomrue;
}
public void setNomrue(String nomrue) {
	this.nomrue = nomrue;
}
public int getCodepostal() {
	return codepostal;
}
public void setCodepostal(int codepostal) {
	this.codepostal = codepostal;
}
public int getCodeville() {
	return codeville;
}
public void setCodeville(int codeville) {
	this.codeville = codeville;
}
//Methods
}
