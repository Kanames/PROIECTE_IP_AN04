package Pachet_aplicatie_main;

public class INVOKEAppProperties {
	public static ContextAplicatie contextAplicatieProcessed() {
		ContextAplicatie appInfo = ContextAplicatie.getInstance();
		appInfo.setNumeApp("Yellow");
		//appInfo.setIconURL("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\yellowIcon.png");
		appInfo.setIconURL("/Pachet_aplicatie_resurse/yellowIcon.png");
		appInfo.setThemeColor("YELLOW");
		return appInfo;
	}
	
}

//I've also been on this and it turns out that you need to create a package inside of your src folder. 
//for instace if you create a package called images inside of the src folder, your relative path will be /images/yourimage.png.
//Notice that the slash(/) must be there! more info here http://forums.macrumors.com/showthread.php?t=533922
