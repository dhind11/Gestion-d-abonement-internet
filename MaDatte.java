
public class MaDatte {
private int jj;
private int mm;
private int aa;
//
public int getJj() {
	return jj;
}
public void setJj(int jj) {
	this.jj = jj;
}
public int getMm() {
	return mm;
}
public void setMm(int mm) {
	this.mm = mm;
}
public int getAa() {
	return aa;
}
public void setAa(int aa) {
	this.aa = aa;
}
//
public MaDatte(int jj, int mm, int aa) {
	this.jj = jj;
	this.mm = mm;
	this.aa = aa;
}
public MaDatte(String s)//j'en ai besoin pour convertire localdate en MaDatte(ma propre creation) à ravers le string biensur
{
	this.jj=Integer.valueOf(s.substring(0, 2));
	this.mm=Integer.valueOf(s.substring(3, 5));
	this.aa=Integer.valueOf(s.substring(6));
}
// 
public void afficher()
{
	System.out.println(this.toString());
}
//
public MaDatte AddToDate(int nbmois)//additionne datefincnx de 3 mois ou 1 mois ;

{
	this.mm=this.mm+nbmois;
	if (this.mm>12)
	{
		int plus=this.mm-12;
		this.mm=plus;
		this.aa++;
	}
	MaDatte intermediaire=new MaDatte(this.jj,this.mm,this.aa);
	return intermediaire;
}
public boolean depasserdate(MaDatte date)//voit si dans la datte courante on depasse datefin cnx apres avoir utilisé addTodate ci dessus
{//dans cette methode j'aurai tjr comme argument la date courrante!
	if (this.aa<date.aa)return true;
	if (this.mm<date.mm)return true;
	return false;
}


}
