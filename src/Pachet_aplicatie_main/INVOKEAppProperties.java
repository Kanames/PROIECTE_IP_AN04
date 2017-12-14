package Pachet_aplicatie_main;

public class INVOKEAppProperties {
	public static ContextAplicatie contextAplicatieProcessed() {
		ContextAplicatie appInfo = ContextAplicatie.getInstance();
		appInfo.setNumeApp("Yellow");
		appInfo.setIconURL("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\yellowIcon.png");
		appInfo.setThemeColor("YELLOW");
		return appInfo;
	}
}
