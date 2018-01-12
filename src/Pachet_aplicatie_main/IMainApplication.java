package Pachet_aplicatie_main;
import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_nivele.Build_InfoAPP;
import Pachet_aplicatie_nivele.NivelFactory;
import Pachet_aplicatie_nivele.SituatieJocObserver;
import Pachet_aplicatie_nivele.SituatieJocSubject;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class IMainApplication extends Application{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed(); \\Pattern:SINGLETON
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	public static SituatieJocSubject situatieJocS;
	
	//EXAMEN 25 (2018)
	//static Button btnYellow,startGame,infoGame,settingGame;
	//Scene configAPPScene;	//? folosesc ?
	//Color c1;		//? folosesc ?
	//Boolean win = false;	//? folosesc ?
	//double i = 1;		//? folosesc ?
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("<<< IN IMainApplication.start() >>>");
		situatieJocS = new SituatieJocSubject();
		 \\prezinta: ultimul nivel jucat, de cate ori sa terminat jocul per asamblu, numele user-ului.
		 \\Pattern:OBSERVER
			 
		Build_InfoAPP.situatieJocO = new SituatieJocObserver(situatieJocS);
		situatieJocS.register(Build_InfoAPP.situatieJocO);
		
		primaryStage.setTitle(NUME_APP);
		
		//Scena 1 Intro applicatie 
		Scene sceneIntro = NivelFactory.creazaScena("Intro", null, 800, 400, Paint.valueOf(THEME_COLOR_APP),primaryStage);
		GameHelperSounds.playBackgroundSound();

		
		
		//-- finale
		primaryStage.getIcons().add(new Image(ICON_URL_APP));
		primaryStage.setScene(sceneIntro);
		primaryStage.show();
		
		
		System.out.println("<<< OUT IMainApplication.start() >>>");
	}





		
	


}
