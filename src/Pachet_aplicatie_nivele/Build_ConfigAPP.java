package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Build_ConfigAPP extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static Pane panelFinal;
	
	private static Button back;
	
	public Build_ConfigAPP(Pane root, double width, double height) {
		super(root);
	}

	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- root: "+root);

		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		
		back = new Button("BACK TO MAIN MENU");
		back.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		back.setOnAction(e -> {
				GameHelperSounds.onClickSound();
				NivelFactory.creazaScena("Intro", null);
			});
		back.setLayoutX(20);
		back.setLayoutY(20);
		Canvas canvasBack= Scena.addCanvasYellowBackground(THEME_COLOR_APP,false);
		Canvas canvasProcessed= Scena.modifConvasConfig(canvasBack);
		panelFinal.getChildren().add(canvasProcessed);
		panelFinal.getChildren().add(back);
		
		Scena scenaFinala =  new Build_IntroAPP(panelFinal);
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		return scenaFinala;
	}

	
}
