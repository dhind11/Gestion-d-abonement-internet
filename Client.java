import java.io.*;
public class Client {
//Attributs
private int numClient;//see prob of int if numClient is too long
private String numTel;
private String adresse;
private double dette;//should i give it 0 by default 
private double p�nalit�Retard;// should i give it 0 by default 

//Constructer
public Client(int numClient, String numTel, String adresse) {
	super();
	this.numClient = numClient;
	this.numTel = numTel;
	this.adresse = adresse;
	this.dette = 0;
	this.p�nalit�Retard = 0;
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
private void setdette(double dette) {
	this.dette = dette;
}
public double getP�nalit�Retard() {
	return p�nalit�Retard;
}
public void setP�nalit�Retard(double p�nalit�Retard) {
	this.p�nalit�Retard = p�nalit�Retard;
}

//Methods
public void Afficher()
{
	System.out.println(this.toString());
}


}
