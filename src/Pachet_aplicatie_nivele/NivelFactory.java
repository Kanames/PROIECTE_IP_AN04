package Pachet_aplicatie_nivele;

import Pachet_aplicatie_main.IMainApplication;
import Pachet_infoScene.SituatieJocSubject;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class NivelFactory {
	
	static private Long nrCastiguri = 0L;
	
	public static void creazaScena(String tipScena,Pane root) {
		System.out.println("<<< IN NivelFactory-alegerea scena >>>");
		System.out.println("parametriIN: tipScena: "+tipScena+"");
		Scene tipScenaDorit = null;
		
		if(tipScena.equalsIgnoreCase("Config")) {
			System.out.println("<< Intrat in IF case good(Config)");
			tipScenaDorit = Build_ConfigAPP.setting(root);
			System.out.println("<< Iesit din IF(Config)");
		}
		else if(tipScena.equalsIgnoreCase("Info")) {
			System.out.println("<< Intrat in IF case good(Info)");
			tipScenaDorit = Build_InfoAPP.setting( root);
			System.out.println("<< Iesit din IF(Info)");
		}
		else if(tipScena.equalsIgnoreCase("Intro")) {
			System.out.println("<< Intrat in IF case good(Intro)");
			tipScenaDorit = Build_IntroAPP.setting( root);
			System.out.println("<< Iesit din IF(Intro)");
		}
		else if(tipScena.equalsIgnoreCase("Level01")) {
			System.out.println("<<< Intrat in IF case good(Level01)");
			SituatieJocSubject.setNumeNivel("Nivel 01");
			tipScenaDorit = Build_Nivel01.setting(root);
			System.out.println("<<< Iesit din IF(Level01)");
		}
		else if(tipScena.equalsIgnoreCase("Level02")) {
			System.out.println("<< Intrat in IF case good(Level02)");
			SituatieJocSubject.setNumeNivel("Nivel 02");
			tipScenaDorit = Build_Nivel02.setting(root);
			System.out.println("<< Iesit din IF(Level02)");
		}
		else if(tipScena.equalsIgnoreCase("Level03")) {
			System.out.println("<< Intrat in IF case good(Level03)");
			SituatieJocSubject.setNumeNivel("Nivel 03");
			SituatieJocSubject.setNrCastiguri(++nrCastiguri);
			tipScenaDorit = Build_Nivel03.setting(root);
			System.out.println("<< Iesit din IF(Level03)");
		}
		System.out.println("<<< OUT NivelFactory-alegerea scena >>>");
		 IMainApplication.primaryStageAPP.setScene(tipScenaDorit);
	}
	
	
	
}
