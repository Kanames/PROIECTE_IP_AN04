package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;

public class IntroAPP extends Scene{


	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	
	private Button startGame,infoGame,settingGame;

	public IntroAPP(Parent root, double width, double height, Paint fill) {
		super(root, width, height, fill);
		
		startGame = new Button();
		startGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		startGame.setLayoutX(360);
		startGame.setLayoutY(225);
		
		infoGame = new Button();
		infoGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		infoGame.setOnAction(e -> GameHelperSounds.onClickSound());
		infoGame.setLayoutX(455);
		infoGame.setLayoutY(225);
		
		settingGame = new Button();
		settingGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		settingGame.setLayoutX(263);
		settingGame.setLayoutY(225);
		
		startGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnPlay.png"));
		infoGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnInfo.png"));
		settingGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnConfig.png"));	
		
	}	
}
