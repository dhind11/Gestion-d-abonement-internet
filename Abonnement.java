import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Abonnement {
	
//Attributs
protected CategorieCnx categorie;
protected MaDatte DateDebCnx;
protected MaDatte FinCnx;
protected MaDatte DernierPaiment;
protected boolean retard,resilier;
//Constructers
public Abonnement(CategorieCnx categorie,MaDatte dateDebCnx,MaDatte finCnx,MaDatte dernierPaiment) {

	this.categorie = categorie;
	this.DateDebCnx = dateDebCnx;
	this.FinCnx = finCnx;
	this.DernierPaiment = dernierPaiment;
	this.retard=false;
	this.resilier=false;
}
public Abonnement() {}

//Getters & Setters
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
//Methods
//abonnement payé , le relancer se fait comme suit:
public void Relancer()
{
	//*******get current date********
			LocalDate date = LocalDate.now();  
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
			String currentDate=date.format(formatter);//current date to string
			//**********************
	this.DernierPaiment=new MaDatte(currentDate);
	this.resilier=false;
	this.retard=false;
}
//abonnement resilié si date depasse datefincnx de 90 jrs=3mois
public boolean EstResilier()
{
	MaDatte x=this.FinCnx.AddToDate(3);
	//*******get current date********
		LocalDate date = LocalDate.now();  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		String currentDate=date.format(formatter);//current date to string
		//**********************
		MaDatte y=new MaDatte(currentDate);
		if(x.depasserdate(y)) {this.setFinCnx(x);return true;}//je change datefincnx et je retourne true "estresilié"
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
}
