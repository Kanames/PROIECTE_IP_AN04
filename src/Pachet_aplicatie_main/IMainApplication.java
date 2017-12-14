package Pachet_aplicatie_main;
import Pachet_aplicatie_data.GameHelper;
import Pachet_aplicatie_data.GameHelperPosition;
import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_nivele.ConfigAPP;
import Pachet_aplicatie_nivele.IntroAPP;
import Pachet_aplicatie_nivele.NivelFactory;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class IMainApplication extends Application{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	
	
	//EXAMEN 25 (2018)
	static Button btnYellow,startGame,infoGame,settingGame;
	Scene scene = NivelFactory.returnLevel01();
	Scene configAPPScene;
	Color c1;
	Boolean win = false;
	double i = 1;
	Timeline fiveSecondsWonder;
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(NUME_APP);
		
		//Scena 1 Intro applicatie 
		startGame 	= new Button();
		infoGame 	= new Button();
		settingGame = new Button();
		
		startGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		startGame.setOnAction(e -> 
			{
				GameHelperSounds.onClickSound();
				primaryStage.setScene(scene);
			}
				);
		infoGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		infoGame.setOnAction(e -> GameHelperSounds.onClickSound());
		settingGame.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		settingGame.setOnAction(e -> 
		{
			GameHelperSounds.onClickSound();
			primaryStage.setScene(configAPPScene);
		}
			);
		
		settingGame.setLayoutX(263);
		settingGame.setLayoutY(225);
		startGame.setLayoutX(360);
		startGame.setLayoutY(225);
		infoGame.setLayoutX(455);
		infoGame.setLayoutY(225);
		
		startGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnPlay.png"));
		infoGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnInfo.png"));
		settingGame.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\btnConfig.png"));

		Group root = new Group();
        Canvas canvas =addPanel1Intro(THEME_COLOR_APP);
        root.getChildren().addAll(canvas);
        root.getChildren().addAll(startGame,settingGame,infoGame);
		Scene sceneIntro = new IntroAPP(root, 800 ,400,Paint.valueOf(THEME_COLOR_APP));

		//Scena 3 Config
		Group root2 = new Group();
		Canvas canvas2 =addPanel1Intro(THEME_COLOR_APP);
		root2.getChildren().addAll(canvas2);
		configAPPScene = new ConfigAPP(root2);
		
		
		//Scena 4 Info
		GameHelperSounds.playBackgroundSound();

		//-- finale
		primaryStage.getIcons().add(new Image(ICON_URL_APP));
		primaryStage.setScene(sceneIntro);
		primaryStage.show();
	}


		private Canvas addPanel1Intro(String themeColor) {
			System.out.println(themeColor);
			Group root = new Group();
		    Canvas canvas = new Canvas(800, 400);
		    GraphicsContext gc = canvas.getGraphicsContext2D();
		    gc.setFont(new Font("Arial", 50));
		    gc.setStroke(Color.BLACK);
		    gc.fillText(GameHelper.implodString(themeColor), GameHelperPosition.calcYNameApp(800,GameHelper.implodString(themeColor)), GameHelperPosition.calcXNameApp(400));
		    return canvas;
		}


		
	


}
