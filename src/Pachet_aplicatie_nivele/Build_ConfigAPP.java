package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Build_ConfigAPP extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	private static Pane panelFinal;
	
	private static Button back;
	
	public Build_ConfigAPP(Pane root, double width, double height, Paint fill) {
		super(root, width, height, fill);
		// TODO Auto-generated constructor stub
	}

	public static Scene setting(Pane root, double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("root "+root);
		System.out.println("width "+width);
		System.out.println("height "+height);
		System.out.println("fill "+fill);
		
		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		
		back = new Button("BACK TO MAIN MENU");
		back.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		back.setOnAction(e -> {
				GameHelperSounds.onClickSound();
				NivelFactory.creazaScena("Intro", null,  width,  height,  fill,  primaryStage);
			});
		back.setLayoutX(20);
		back.setLayoutY(20);
		
		Canvas canvasBack= Scena.addCanvasYellowBackground(THEME_COLOR_APP,false);
		Canvas canvasProcessed= Scena.modifConvasConfig(canvasBack);
		
		panelFinal.getChildren().add(canvasProcessed);
		panelFinal.getChildren().add(back);
		
		System.out.println("--parametriOut-- ");
		System.out.println("root "+panelFinal.getChildren().toString());
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		
		Scena scenaFinala =  new Build_IntroAPP(panelFinal,  width,  height,  fill);
		primaryStage.setScene(scenaFinala);
		return scenaFinala;
	}

	
}
