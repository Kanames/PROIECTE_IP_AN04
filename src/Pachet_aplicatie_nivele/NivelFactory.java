package Pachet_aplicatie_nivele;

import Pachet_aplicatie_main.IMainApplication;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class NivelFactory {
	
	static private Long nrCastiguri = 0L;
	
	public static Scene creazaScena(String tipScena,Pane root,double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN NivelFactory.creazaScena() >>>");
		System.out.println("parametriIN: tipScena: "+tipScena+"");
		Scene tipScenaDorit = null;
		
		if(tipScena.equalsIgnoreCase("Config")) {
			System.out.println("Intrat in IF case good(Config)");
			tipScenaDorit = Build_ConfigAPP.setting( root, width,  height,fill,primaryStage);
			System.out.println("iesit din IF(Config)");
		}
		else if(tipScena.equalsIgnoreCase("Info")) {
			System.out.println("Intrat in IF case good(Info)");
			tipScenaDorit = Build_InfoAPP.setting( root, width,  height,fill,primaryStage);
			System.out.println("iesit din IF(Info)");
		}
		else if(tipScena.equalsIgnoreCase("Intro")) {
			System.out.println("Intrat in IF case good(Intro)");
			tipScenaDorit = Build_IntroAPP.setting( root, width,  height,fill,primaryStage);
			System.out.println("iesit din IF(Intro)");
		}
		else if(tipScena.equalsIgnoreCase("Level01")) {
			System.out.println("Intrat in IF case good(Level01)");
			IMainApplication.situatieJocS.setNumeNivel("Nivel 01");
			IMainApplication.situatieJocS.setNrCastiguri(++nrCastiguri);
			tipScenaDorit = Build_Nivel01.setting(root, width,  height,fill,primaryStage);
			System.out.println("iesit din IF(Level01)");
		}
		else if(tipScena.equalsIgnoreCase("Level02")) {
			System.out.println("Intrat in IF case good(Level02)");
			IMainApplication.situatieJocS.setNumeNivel("Nivel 02");
			

			System.out.println("iesit din IF(Level02)");
		}
		else if(tipScena.equalsIgnoreCase("Level03")) {
			System.out.println("Intrat in IF case good(Level03)");
			IMainApplication.situatieJocS.setNumeNivel("Nivel 03");
			
			
			System.out.println("iesit din IF(Level03)");
		}
		return tipScenaDorit;
	}
	
	
	
}
