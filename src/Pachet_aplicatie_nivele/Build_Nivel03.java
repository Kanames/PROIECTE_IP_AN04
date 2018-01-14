package Pachet_aplicatie_nivele;

import java.util.Collection;
import java.util.List;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.IMainApplication;
import Pachet_aplicatie_main.INVOKEAppProperties;
import Pachet_nivel_03.Cadru;
import Pachet_nivel_03.CadruImplementare;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Build_Nivel03 extends Scena{

	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();

	public static Canvas canvas;
	public static Pane panelFinal;
	public static List<Rectangle> listaCadre;
	private static int winingTimes = 0;
	
	public Build_Nivel03(Parent root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	
	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_Nivel03() >>>");

		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}

		Cadru cadru = new Cadru(6);
		listaCadre = cadru.getCadre();
		for(int i = 0 ; i < listaCadre.size() ; i++) {
			panelFinal.getChildren().add(listaCadre.get(i));
		}
		
		Scene scene = new Scene(panelFinal, 800 ,400);
		System.out.println("<<< OUT Build_Nivel03() >>>");
		return scene;
	}

	public static void checkWin() {
		for(int i = 0 ; i < listaCadre.size() ; i++) {
			System.out.println(listaCadre.get(i).getFill().toString());
			
			if("0xffff00ff".equalsIgnoreCase(listaCadre.get(i).getFill().toString())) {
				winingTimes ++;
				System.out.println("Reusit-> "+winingTimes);
				if(winingTimes ==  listaCadre.size()) {
					GameHelperSounds.onWin();
					winingTimes = 0;
					System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
					IMainApplication.situatieJocS.notifyObserver();
					System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
					NivelFactory.creazaScena("Intro", null);
				}
			}else {
				winingTimes = 0;
			}	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
