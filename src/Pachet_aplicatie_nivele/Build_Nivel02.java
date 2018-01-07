package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.IMainApplication;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Build_Nivel02  extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	private static int nrOfBoxexCheck = 0;
	
	static double i = 1;
	static Boolean win = false;	
	static Timeline fiveSecondsWonder;
	static Color colorBackgroundLvl01;
	private static Pane panelFinal;
	
	public Build_Nivel02(Parent root, double width, double height, Paint fill) {
		super(root, width, height, fill);
		// TODO Auto-generated constructor stub
	}
	public static Scene setting(Pane root, double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN Build_Nivel02() >>>");


		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		
		Button btnRand1Coloana1  = new Button();
		Button btnRand1Coloana2  = new Button();
		Button btnRand1Coloana3  = new Button();
		Button btnRand1Coloana4  = new Button();
		
		Button btnRand2Coloana1  = new Button();
		Button btnRand2Coloana2  = new Button();
		Button btnRand2Coloana3  = new Button();
		Button btnRand2Coloana4  = new Button();
		
		btnRand1Coloana1.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand1Coloana1.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand1Coloana1.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(0);
			canvas.setLayoutY(0);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			btnRand1Coloana1.setDisable(true);
			System.out.println("nrOfBoxexCheck---------------->"+nrOfBoxexCheck);
			checkWin(primaryStage,width, height, fill);
			});
		btnRand1Coloana2.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand1Coloana2.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand1Coloana2.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(200);
			canvas.setLayoutY(0);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			btnRand1Coloana2.setDisable(true);
			System.out.println("nrOfBoxexCheck---------------->"+nrOfBoxexCheck);
			checkWin(primaryStage,width, height, fill);
		});
		btnRand1Coloana3.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand1Coloana3.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand1Coloana3.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(400);
			canvas.setLayoutY(0);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			btnRand1Coloana3.setDisable(true);
			System.out.println("nrOfBoxexCheck---------------->"+nrOfBoxexCheck);
			checkWin(primaryStage,width, height, fill);
		});
		btnRand1Coloana4.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand1Coloana4.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand1Coloana4.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(600);
			canvas.setLayoutY(0);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			btnRand1Coloana4.setDisable(true);
			System.out.println("nrOfBoxexCheck---------------->"+nrOfBoxexCheck);
			checkWin(primaryStage,width, height, fill);
		});
		
		
		
		btnRand2Coloana1.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand2Coloana1.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand2Coloana1.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(0);
			canvas.setLayoutY(200);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			checkWin(primaryStage,width, height, fill);
			});
		btnRand2Coloana2.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand2Coloana2.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand2Coloana2.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(200);
			canvas.setLayoutY(200);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			checkWin(primaryStage,width, height, fill);
			});
		btnRand2Coloana3.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand2Coloana3.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand2Coloana3.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(400);
			canvas.setLayoutY(200);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			checkWin(primaryStage,width, height, fill);
			});
		btnRand2Coloana4.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnRand2Coloana4.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl02a.png"));
		btnRand2Coloana4.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(600);
			canvas.setLayoutY(200);
			panelFinal.getChildren().add(canvas);
			nrOfBoxexCheck++;
			checkWin(primaryStage,width, height, fill);
			});

		btnRand1Coloana1.setLayoutX(100);
		btnRand1Coloana1.setLayoutY(100);
		btnRand1Coloana2.setLayoutX(300);
		btnRand1Coloana2.setLayoutY(100);
		btnRand1Coloana3.setLayoutX(500);
		btnRand1Coloana3.setLayoutY(100);
		btnRand1Coloana4.setLayoutX(700);
		btnRand1Coloana4.setLayoutY(100);
		
		btnRand2Coloana1.setLayoutX(100);
		btnRand2Coloana1.setLayoutY(300);
		btnRand2Coloana2.setLayoutX(300);
		btnRand2Coloana2.setLayoutY(300);
		btnRand2Coloana3.setLayoutX(500);
		btnRand2Coloana3.setLayoutY(300);
		btnRand2Coloana4.setLayoutX(700);
		btnRand2Coloana4.setLayoutY(300);
		
		panelFinal.getChildren().add(btnRand1Coloana1);
		panelFinal.getChildren().add(btnRand1Coloana2);
		panelFinal.getChildren().add(btnRand1Coloana3);
		panelFinal.getChildren().add(btnRand1Coloana4);
		
		panelFinal.getChildren().add(btnRand2Coloana1);
		panelFinal.getChildren().add(btnRand2Coloana2);
		panelFinal.getChildren().add(btnRand2Coloana3);
		panelFinal.getChildren().add(btnRand2Coloana4);
		
	
		
		Scene scene = new Scene(panelFinal, 800 ,400);
		primaryStage.setScene(scene);
		return scene;
	}
	private static void checkWin(Stage primaryStage, double width, double height, Paint fill) {
		if(nrOfBoxexCheck == 8) {
			
			System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
			IMainApplication.situatieJocS.notifyObserver();
			System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
			
			GameHelperSounds.onWin();
			NivelFactory.creazaScena("Intro", null, width, height, fill, primaryStage);
		}
		
	}
	
	
	
}
