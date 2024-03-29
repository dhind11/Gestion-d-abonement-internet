import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Abonnement {
	
//Attributs
protected CategorieCnx categorie;
protected MaDatte DateDebCnx;
protected MaDatte FinCnx;
protected MaDatte DernierPaiment;
protected boolean retard,resilier;
char typeAbonnement;
//Constructers
public Abonnement(CategorieCnx categorie,MaDatte dateDebCnx,char typeAbonnement) {

	this.typeAbonnement=typeAbonnement;
	this.categorie = categorie;
	this.DateDebCnx = dateDebCnx;
	this.FinCnx =(this.DateDebCnx).AddToDate((this.categorie).getDuree());
	LocalDate date = LocalDate.now();  
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
	String currentDate=date.format(formatter);//current date to string
	this.DernierPaiment=new MaDatte(currentDate);
	this.retard=false;
	this.resilier=false;
}
public Abonnement() {}

//Getters & Setters
public char gettypeAbonnement()
{
	return this.typeAbonnement;
}
public CategorieCnx getCategorie() {
	return categorie;
}
public void setCategorie(CategorieCnx categorie) {
	this.categorie = categorie;
}
public MaDatte getDateDebCnx() {
	return DateDebCnx;
}
public void setDateDebCnx(MaDatte dateDebCnx) {
	DateDebCnx = dateDebCnx;
}
public MaDatte getFinCnx() {
	return FinCnx;
}
public void setFinCnx(MaDatte finCnx) {
	FinCnx = finCnx;
}
public MaDatte getDernierPaiment() {
	return DernierPaiment;
}
public void setDernierPaiment(MaDatte dernierPaiment) {

	DernierPaiment = dernierPaiment;
}
public void setretard()
{
	if (this.EstRetard())this.retard=true;
}
public void setresilier()
{
	if (this.EstResilier())this.resilier=true;
}
public boolean getretard()
{
	return this.retard;
}
public boolean getresilier()
{
	return this.resilier;
}
//Methods***********************************************************************************
//abonnement pay� , le relancer se fait comme suit:
public void Relancer()

{
	this.DernierPaiment=this.DateDebCnx;
	//*******get current date********
			LocalDate date = LocalDate.now();  
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
			String currentDate=date.format(formatter);//current date to string
			//**********************
	this.DateDebCnx=new MaDatte(currentDate);
	this.resilier=false;
	this.retard=false;
}
//abonnement resili� si date depasse datefincnx de 90 jrs=3mois
public boolean EstResilier()
{
	MaDatte x=this.FinCnx.AddToDate(3);
	//*******get current date********
		LocalDate date = LocalDate.now();  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		String currentDate=date.format(formatter);//current date to string
		//**********************
		MaDatte y=new MaDatte(currentDate);
		if(x.depasserdate(y)) {this.setFinCnx(x);return true;}//je change datefincnx et je retourne true "estresili�"
		else return false;
}
//en retard si date depasse datefincnx de 30 jrs=1 mois
public boolean EstRetard()
{
	MaDatte x=this.FinCnx.AddToDate(1);
	//*******get current date********
		LocalDate date = LocalDate.now();  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		String currentDate=date.format(formatter);//current date to string
   //*********************************
		MaDatte y=new MaDatte(currentDate);
		if(x.depasserdate(y)) {return true;}//est en retard
		else return false;// n'est pas en retard
}

//affichage()

public void Afficher()
{
	System.out.println(this.toString());
}
public String toString() {
	return "Abonnement [categorie=" + categorie + ", DateDebCnx=" + DateDebCnx + ", FinCnx=" + FinCnx
			+ ", DernierPaiment=" + DernierPaiment + ", retard=" + retard + ", resilier=" + resilier + "]";
}
//peut etre resilier s'il depasse 2 mois 
public boolean PeutEtreResilier(MaDatte date)
{
	
	if (  ((this.DateDebCnx).AddToDate(2)).depasserdate(date) ) {return true;}
	else return false;
}

}
