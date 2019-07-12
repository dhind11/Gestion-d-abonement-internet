import java.io.*;
public class Client {
//Attributs
protected static int numClient=0;//see prob of int if numClient is too long
protected String numTel;
protected Adresse adresse;
protected double dette;//should i give it 0 by default 
protected double penaliteRetard;// should i give it 0 by default 

//Constructer
public Client(String numTel, Adresse adresse) {
	numClient++;
	this.numTel = numTel;
	this.adresse = adresse;
	this.dette = 0;
	this.penaliteRetard = 0;
}

public Client() {}

//Getters & Setters
public String getNumTel() {
	return numTel;
}
public void setNumTel(String numTel) {
	this.numTel = numTel;
}
public Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
public double getDette() {
	return dette;
}
private void setdette(double dette) {
	this.dette = dette;
}
public double getPénalitéRetard() {
	return penaliteRetard;
}
public void setPenaliteRetard(double penaliteRetard) {
	this.penaliteRetard = penaliteRetard;
}

//Methods
public void Afficher()
{
	System.out.println(this.toString());
}


}
