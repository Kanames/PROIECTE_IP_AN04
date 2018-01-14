package Pachet_aplicatie_main;
import java.io.File;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_nivele.Build_InfoAPP;
import Pachet_aplicatie_nivele.NivelFactory;
import Pachet_infoScene.SituatieJocObserver;
import Pachet_infoScene.SituatieJocSubject;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class IMainApplication extends Application{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed(); //Pattern:SINGLETON
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	Log4Debug log = Log4Debug.getInstance();
	public static SituatieJocSubject situatieJocS;
	public static Stage primaryStageAPP;
	//EXAMEN 25 (2018)

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("<<< IN IMainApplication.start() >>>");
		//log.debug("<<< IN IMainApplication.start() >>>");
		
		primaryStageAPP = primaryStage;
		primaryStageAPP.setTitle(NUME_APP);
		primaryStageAPP.getIcons().add(new Image(ICON_URL_APP));
	
		//Pattern:OBSERVER
		situatieJocS = new SituatieJocSubject();
		Build_InfoAPP.situatieJocO = new SituatieJocObserver(situatieJocS);
		situatieJocS.register(Build_InfoAPP.situatieJocO);
		//prezinta: ultimul nivel jucat, de cate ori sa terminat jocul per asamblu, numele user-ului.

		//Scena 1 "Intro" applicatie 
		NivelFactory.creazaScena("Intro", null);
		GameHelperSounds.playBackgroundSound();
		
		primaryStageAPP.show();
		System.out.println("<<< OUT IMainApplication.start() >>>");
	}





		
	


}
