package Pachet_aplicatie_main;

public class INVOKEAppProperties {
	public static String MediaException_01 = "RezolvarePosibila: Verifica daca formatele la fisierele mp3/wav/ sunt bune si apoi verifica si path-ul la fiecare";
	public static ContextAplicatie contextAplicatieProcessed() {
		ContextAplicatie appInfo = ContextAplicatie.getInstance();
		appInfo.setNumeApp("Yellow");
		appInfo.setIconURL("/Pachet_aplicatie_resurse/yellowIcon.png");
		appInfo.setThemeColor("YELLOW");
		
		// -- Nivel02 INFORMATIONS
		appInfo.setNrButoanePerRandNivel02(4);
		appInfo.setNrRanduriNivel02(2);
		
		
		return appInfo;
	}
	
}

//I've also been on this and it turns out that you need to create a package inside of your src folder. 
//for instace if you create a package called images inside of the src folder, your relative path will be /images/yourimage.png.
//Notice that the slash(/) must be there! more info here http://forums.macrumors.com/showthread.php?t=533922
