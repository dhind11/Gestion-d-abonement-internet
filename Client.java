
public class Client {
//Attributs
private static int numClient;//see prob of int if numClient is too long
private String numTel;
private String adresse;
private double dette;//should i give it 0 by default 
private double pénalitéRetard;// should i give it 0 by default 

//Constructer
public Client(int numClient, String numTel, String adresse) {
	super();
	this.numClient = numClient;
	this.numTel = numTel;
	this.adresse = adresse;
	this.dette = 0;
	this.pénalitéRetard = 0;
}

public Client() {}

//Getters & Setters
public int getNumClient() {
	return numClient;
}
public void setNumClient(int numClient) {
	this.numClient = numClient;
}
public String getNumTel() {
	return numTel;
}
public void setNumTel(String numTel) {
	this.numTel = numTel;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public double getDette() {
	return dette;
}
public void setDette(double dette) {
	this.dette = dette;
}
public double getPénalitéRetard() {
	return pénalitéRetard;
}
public void setPénalitéRetard(double pénalitéRetard) {
	this.pénalitéRetard = pénalitéRetard;
}

//Methods



}
