package Pachet_aplicatie_main;

public class INVOKEAppProperties {
	public static ContextAplicatie contextAplicatieProcessed() {
		ContextAplicatie appInfo = ContextAplicatie.getInstance();
		appInfo.setNumeApp("Yellow");
		appInfo.setIconURL("file:C:\\Users\\Stefan\\ECLIPSE-workspace\\Proiect_IP\\src\\Pachet_aplicatie_main\\yellowIcon.png");
		appInfo.setThemeColor("YELLOW");
		return appInfo;
	}
}
