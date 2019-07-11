import java.util.*; 
import java.io.*;
public class Ville implements Serializable {
//Attributs
private int CodeVille;
private File fichierPro;//abonnements professionnels
private File fichierResid;//abonnements résidentiels
private File dossierVille;//ville

//Constructors
public Ville() {}
public Ville(int codeville) 
{
	this.CodeVille=codeville;
	this.fichierPro=new File("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsProfessionnels.txt");
	this.fichierResid=new File("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsResidentiels.txt");
}
//getters & setters
public int getCodeVille() {
	return CodeVille;
}
public void setCodeVille(int codeVille) {
	CodeVille = codeVille;
}
public File getfichierPro() {
	return this.fichierPro;
}
public void setfichierA(File fichierPro) {
	this.fichierPro = fichierPro;
}
public File getfichierResid() {
	return this.fichierResid;
}
public void setfichierResid(File fichierResid) {
	this.fichierResid = fichierResid;
}
public File getdossierVille() {
	return this.dossierVille;
}
public void setdossierVille(File dossierVille) {
	this.dossierVille = dossierVille;
}
                                       //*********Methodes pour Dossier************

//*******Creation Folder ******
public void createfolder() 
{
	//pour bien arranger les dossiers des villes
	File path =new File("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami");//objet File pour le dossier*****L2IsilA_G1_DjebienHind_BentebbicheSami*******
	if(!(path.exists())) //condition de creation si not exist folder 
	{
		path.mkdir();
	}
	//fin arrangement 
	//objet pour creer dossier de ville du nom de son code s'il n'existe pas 
	this.dossierVille=new File("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille));
	if(!(this.dossierVille.exists())) 
	{
		(this.dossierVille).mkdir();
	}
}
//*****Suppression folder of ville********
//*****close*************


                                      //************Methodes pour fichiers************
//1-creation fichier                                    
//creation fichier des abonnements professionnels
public void createfilepro() 
{
	this.createfolder();
	
	if(!((this.fichierPro).exists())) 
	{
		try {(this.fichierPro).createNewFile();} 
	    catch (IOException e){e.printStackTrace();}
	}
}
//creation fichier des abonnements residentiels
public void createfileresid()
{
	this.createfolder();
	if(!((this.fichierResid).exists())) 
	{
		try {(this.fichierResid).createNewFile();} 
	    catch (IOException e){e.printStackTrace();}
	}
}
//2-insertion d'abonnement dans un fichier
//insertion dans fichier des abonnements professionnels 
public void insertPro(AbonnementPro AP)
{
	try { 
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsProfessionnels.txt"));
		os.writeObject(AP);
		os.close();
	    }
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
    }
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
//insertion dans fichier des abonnements residentiels
public void insertResid(AbonnementResid AR)

{
	try { 
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsResidentiel.txt"));
		os.writeObject(AR);
		os.close();
	    }
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
    }
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
//lirefichierpro
public AbonnementPro lirefichierPro()
{
	AbonnementPro AP=null;
	try
	{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsProfessionnels.txt"));
	   AP=(AbonnementPro) is.readObject();
		
		is.close();return AP;
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();return AP;
		}catch(IOException e) {
			e.printStackTrace();return AP;
			}catch (ClassNotFoundException e) {
				e.printStackTrace();return AP;
				}
	
	
}
//public AbonnementPro lirefichierResid()
public AbonnementResid lirefichierResid()

{
	AbonnementResid AR=null;
	try
	{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\L2IsilA_G1_DjebienHind_BentebbicheSami\\"+Integer.toString(this.CodeVille)+"\\AbonnementsResidentiels.txt"));
	   AR=(AbonnementResid) is.readObject();
		
		is.close();return AR;
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();return AR;
		}catch(IOException e) {
			e.printStackTrace();return AR;
			}catch (ClassNotFoundException e) {
				e.printStackTrace();return AR;
				}
	
	
}
//4-Rechercher
//Rechercher dans fichier pro

//modification
//suppression 
//creer tableau a partir de fichier 
}

