package Pachet_aplicatie_main;
import Pachet_aplicatie_data.GameHelperPosition;
import Pachet_aplicatie_data.GameHelperSounds;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class IMainApplication extends Application{
	//EXAMEN 25 (2018)
	static Button btnYellow,startGame,infoGame,settingGame;
	Scene scene;
	Color c1;
	Boolean win = false;
	double i = 1;
	Timeline fiveSecondsWonder;
	ContextAplicatie appInfo  = INVOKEAppProperties.contextAplicatieProcessed();
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(appInfo.getNumeApp());
		String themeColor = appInfo.getThemeColor();
		
		//Scena 1 Intro applicatie 
		startGame 	= new Button();
		infoGame 	= new Button();
		settingGame = new Button();
		
		startGame.setStyle("-fx-color:"+themeColor+"; -fx-border:none;");
		startGame.setOnAction(e -> 
			{
				GameHelperSounds.onClickSound();
				primaryStage.setScene(scene);
			}
				);
		infoGame.setStyle("-fx-color:"+themeColor+"; -fx-border:none;");
		infoGame.setOnAction(e -> GameHelperSounds.onClickSound());
		settingGame.setStyle("-fx-color:"+themeColor+"; -fx-border:none;");
		settingGame.setOnAction(e -> GameHelperSounds.onClickSound());
		
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
        Canvas canvas =addPanel1Intro(themeColor);
        root.getChildren().addAll(canvas,startGame,settingGame,infoGame);
		Scene sceneIntro = new Scene(root, 800 ,400,Paint.valueOf(themeColor));

		//Scena 2 level 1
		btnYellow = new Button();
		btnYellow.setText("+ more "+themeColor+"+");
		btnYellow.setAlignment(Pos.CENTER);
		btnYellow.setLayoutX(50);
		btnYellow.setLayoutY(50);
		final Group rootGr = new Group(btnYellow);
		scene = new Scene(rootGr, 800 ,400);

		//button.setOnAction(eventsAcitons);
		btnYellow.setOnAction(e -> {
			GameHelperSounds.onClickSound();
			
			i = i -0.15;
			System.out.println(i);
			if(i -0.15<0) {
				System.out.println("nu");
				Text txt = new Text();
				txt.setText("You win");
				txt.setLayoutX(100);
				txt.setLayoutY(145);
				rootGr.getChildren().addAll(txt);
				win=true;
				fiveSecondsWonder.stop();
				try {
					GameHelperSounds.onWin();
				}catch(MediaException mex) {
					System.out.println("RezolvarePosibila: Verifica daca formatele la fisierele mp3/wav/ sunt bune si apoi verifica si path-ul la fiecare");
				}
				btnYellow.setDisable(true);
			}else {
				
				System.out.println("da");
				c1 = new Color(1,1,i,0.8);
				scene.setFill(c1);
				
				
			}
		});
		
		GameHelperSounds.playBackgroundSound();

		fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        System.out.println("this is called every 1 seconds on UI thread");
		        if(i+ 0.10 >0 && (i + 0.10)<1 && win==false) {
		        i = i + 0.10;
		        c1 = new Color(1,1,i,0.8);
				scene.setFill(c1);
		        }
		        
		    }
		}));
		fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		fiveSecondsWonder.play();
		
		
		//-- finale
		primaryStage.getIcons().add(new Image(appInfo.getIconURL()));
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
		    gc.fillText(implodString(themeColor), GameHelperPosition.calcYNameApp(800,implodString(themeColor)), GameHelperPosition.calcXNameApp(400));
		    return canvas;
		}


		private String implodString(String string) {
			System.out.println(string);
			StringBuffer themeFinal = new StringBuffer();
			char ary[] = string.toCharArray();
			System.out.println(ary.length);
			for(int i = 0 ; i < ary.length ; i++){
				themeFinal.append(ary[i]+" ");
				System.out.println(ary[i]);
			}
			return themeFinal.toString();
		}
	


}
