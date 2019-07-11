import java.io.File;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
//creer tableau d'Abonnements professionnels  <Check>
		//1- je crée tt d'abord les fichiers et dossier s'il n'existent pas;
		Scanner sc=new Scanner(System.in);//un scanneur
		int codeville;//un int pour code de ville
		System.out.println("donner le code ville:");//demander code ville
		codeville=sc.nextInt();//lecture de code ville 
		Ville ville=new Ville(codeville);//je crée l'objet ville qui va contenir les path fichierpro et fichierresid et folderville
		File existenceOf=new File("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(codeville));// j'ai besoin de cet objet pour verifier l'existence des fichiers et le dossier 

	   if(!( existenceOf.exists()))
		{
			ville.createfilepro();//fichier professionnel de ville créé
			ville.createfileresid();//fichier residentiel de ville créé 
		    sc.close();//close scanner
		    boolean  Continue=true;
		    while(Continue==true)
		    {
		    	AbonnementPro AP=new AbonnementPro();
		    	AbonnementResid AR=new AbonnementResid();
		    	ville.insertPro(AP);
		    	ville.insertResid(AR);
		    }
		}
		
		
		//2- 

	}

}
