package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.IMainApplication;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Build_Nivel01  extends Scena{

	static double yellowishUpper = 1;
	static Boolean win = false;	
	static Timeline fiveSecondsWonder;
	static Color colorBackgroundLvl01;

	
	public Build_Nivel01(Parent root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	
	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_Nivel01() >>>");
		Button btnYellow = new Button();
		//btn IMG este 170x170
		btnYellow.setGraphic(new ImageView("/Pachet_aplicatie_resurse/lvl01a.png"));	
		btnYellow.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		btnYellow.setLayoutX(315);
		btnYellow.setLayoutY(115);
		final Group rootGr = new Group(btnYellow);
		Scene scene = new Scene(rootGr, 800 ,400);
		btnYellow.setOnAction(e -> {
			GameHelperSounds.onClickSound();
			yellowishUpper = yellowishUpper -0.15;
			System.out.println("Yellower on click-> "+yellowishUpper);
			if(yellowishUpper -0.15<0) {
				win=true;
				fiveSecondsWonder.stop();
				try {
					GameHelperSounds.onWin();
				}catch(MediaException mex) {
					System.out.println(INVOKEAppProperties.MediaException_01);
				}
				btnYellow.setDisable(true);
				yellowishUpper = 1;
				System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
				IMainApplication.situatieJocS.notifyObserver();
				System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
				NivelFactory.creazaScena("Level02", null);
				
			}else {
				colorBackgroundLvl01 = new Color(1,1,yellowishUpper,0.8);
				scene.setFill(colorBackgroundLvl01);
				
			}
		});
		
		decriseYellow(scene);
		System.out.println("<<< OUT Build_Nivel01() >>>");
		return scene;
	}
	
	private static void decriseYellow(Scene scene) {
		System.out.println("<<< IN Build_Nivel01.decriseYellow() >>>");
		fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        System.out.println("*this is called every 1 seconds on UI thread");
		        	if(yellowishUpper+0.20 >0 && (yellowishUpper + 0.20)<1 && win==false) {
		        		yellowishUpper = yellowishUpper + 0.20;
		        		colorBackgroundLvl01 = new Color(1,1,yellowishUpper,0.8);
		        		scene.setFill(colorBackgroundLvl01);
		        	}
		        
		    }
		}));
		fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		fiveSecondsWonder.play();
		System.out.println("<<< OUT Build_Nivel01.decriseYellow() >>>");
	}

}
