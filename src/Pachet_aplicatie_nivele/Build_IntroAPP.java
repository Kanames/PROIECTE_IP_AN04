package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Build_IntroAPP extends Scena{

	public Build_IntroAPP(Parent root, double width, double height) {
		super(root, width, height);
		// TODO Auto-generated constructor stub
	}

	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();

	private static Button startGame;
	private static Button infoGame;
	private static Button settingGame;
	private static Pane panelFinal;

	public static Scena setting(Pane root, double width, double height) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("root "+root);
		System.out.println("width "+width);
		System.out.println("height "+height);
		
		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		
		startGame = new Button();
		startGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		startGame.setOnAction(e -> {
			GameHelperSounds.onClickSound();
			NivelFactory.creazaScena("Level01", null,  width,  height);
			});
		startGame.setLayoutX(360);
		startGame.setLayoutY(225);
		
		infoGame = new Button();
		infoGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		infoGame.setOnAction(e -> {
			GameHelperSounds.onClickSound();
			NivelFactory.creazaScena("Info", null,  width,  height);		
			});
		infoGame.setLayoutX(455);
		infoGame.setLayoutY(225);
		
		settingGame = new Button();
		settingGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		settingGame.setOnAction(e -> {
				GameHelperSounds.onClickSound();
				NivelFactory.creazaScena("Config", null,  width,  height);		
			});
		settingGame.setLayoutX(263);
		settingGame.setLayoutY(225);
		
		startGame.setGraphic(new ImageView("/Pachet_aplicatie_resurse/btnPlay.png"));
		infoGame.setGraphic(new ImageView("/Pachet_aplicatie_resurse/btnInfo.png"));
		settingGame.setGraphic(new ImageView("/Pachet_aplicatie_resurse/btnConfig.png"));	
		
		Canvas canvas= Scena.addCanvasYellowBackground(THEME_COLOR_APP,true);
		panelFinal.getChildren().add(canvas);
		panelFinal.getChildren().add(infoGame);
		panelFinal.getChildren().add(settingGame);
		panelFinal.getChildren().add(startGame);

		System.out.println("--parametriOut-- ");
		System.out.println("root "+panelFinal.getChildren());
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		
		Scena scenaFinala =  new Build_IntroAPP(panelFinal,  width,  height);
		return scenaFinala;
	}



	
}
