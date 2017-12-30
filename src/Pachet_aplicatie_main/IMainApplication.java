package Pachet_aplicatie_main;
import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_nivele.NivelFactory;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class IMainApplication extends Application{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	
	
	//EXAMEN 25 (2018)
	static Button btnYellow,startGame,infoGame,settingGame;
	Scene configAPPScene;
	Color c1;
	Boolean win = false;
	double i = 1;
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("<<< IN IMainApplication.start() >>>");
		
		primaryStage.setTitle(NUME_APP);
		
		//Scena 1 Intro applicatie 
		Scene sceneIntro = NivelFactory.creazaScena("Intro", null, 800, 400, Paint.valueOf(THEME_COLOR_APP),primaryStage);
		 
		
		
		//Scena 3 Config
//		Group root2 = new Group();
//		Canvas canvas2 =addPanel1Intro(THEME_COLOR_APP);
//		root2.getChildren().addAll(canvas2);
//		configAPPScene = new Build_ConfigAPP(root2);
		
		
		//Scena 4 Info
		GameHelperSounds.playBackgroundSound();

		//-- finale
		primaryStage.getIcons().add(new Image(ICON_URL_APP));
		primaryStage.setScene(sceneIntro);
		primaryStage.show();
		
		System.out.println("<<< OUT IMainApplication.start() >>>");
	}





		
	


}
