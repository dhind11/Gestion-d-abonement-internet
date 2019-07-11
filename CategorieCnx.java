
public class CategorieCnx {
//enumeration for type	
private Typecnx type;
private String debit;
private int duree;
private double tarif;
//constructor
public CategorieCnx(String debit, int durée, Typecnx type, double tarif) {
	
	this.debit = debit;
	this.duree = durée;
	this.type = type;
	this.tarif = tarif;
}
public CategorieCnx() {}

//getters & setters
public Typecnx getType() {
	return type;
}
public void setType(String type) {
	this.type=Typecnx.valueOf(type);
}
public String getDebit() {
	return debit;
}
public void setDebit(String debit) {
	this.debit = debit;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public double getTarif() {
	return tarif;
}
public void setTarif(double tarif) {
	this.tarif = tarif;
}

}

