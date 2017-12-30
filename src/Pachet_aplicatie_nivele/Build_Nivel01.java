package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Build_Nivel01  extends Scena{

	static double i = 1;
	static Boolean win = false;	
	static Timeline fiveSecondsWonder;
	static Color colorBackgroundLvl01;
	
	public Build_Nivel01(Parent root, double width, double height, Paint fill) {
		super(root, width, height, fill);
		// TODO Auto-generated constructor stub
	}
	
	public static Scene setting(Pane root, double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN Build_Nivel01() >>>");
		Button btnYellow = new Button();
		//btn IMG este 170x170
		btnYellow.setGraphic(new ImageView("file:C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\lvl01a.png"));	
		btnYellow.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnYellow.setLayoutX(315);
		btnYellow.setLayoutY(115);
		final Group rootGr = new Group(btnYellow);
		Scene scene = new Scene(rootGr, 800 ,400);
		btnYellow.setOnAction(e -> {
			GameHelperSounds.onClickSound();
			i = i -0.15;
			System.out.println(i);
			if(i -0.15<0) {
				win=true;
				fiveSecondsWonder.stop();
				try {
					GameHelperSounds.onWin();
				}catch(MediaException mex) {
					System.out.println("RezolvarePosibila: Verifica daca formatele la fisierele mp3/wav/ sunt bune si apoi verifica si path-ul la fiecare");
				}
				btnYellow.setDisable(true);
				i = 1;
				primaryStage.setScene(NivelFactory.creazaScena("Intro", null, width, height, fill, primaryStage));
				
			}else {
				
				System.out.println("da");
				colorBackgroundLvl01 = new Color(1,1,i,0.8);
				scene.setFill(colorBackgroundLvl01);
				
			}
		});
		
		decriseYellow(scene);
		primaryStage.setScene(scene);
		return scene;
	}
	
	private static void decriseYellow(Scene scene) {
		fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        System.out.println("this is called every 1 seconds on UI thread");
		        	if(i+0.20 >0 && (i + 0.20)<1 && win==false) {
		        		i = i + 0.20;
		        		colorBackgroundLvl01 = new Color(1,1,i,0.8);
		        		scene.setFill(colorBackgroundLvl01);
		        	}
		        
		    }
		}));
		fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		fiveSecondsWonder.play();
	}

}
