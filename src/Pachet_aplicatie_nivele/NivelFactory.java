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
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class NivelFactory {
	static double i = 1;
	static Boolean win = false;	
	static Timeline fiveSecondsWonder;
	static Color colorBackgroundLvl01;
	
	public static Scene returnLevel01() {
		Button btnYellow = new Button();
		btnYellow.setText("din Factory");
		btnYellow.setAlignment(Pos.CENTER);
		btnYellow.setLayoutX(50);
		btnYellow.setLayoutY(50);
		final Group rootGr = new Group(btnYellow);
		Scene scene = new Scene(rootGr, 800 ,400);
		
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
				colorBackgroundLvl01 = new Color(1,1,i,0.8);
				scene.setFill(colorBackgroundLvl01);
				
				
			}
		});
		
		decriseYellow(scene);
		return scene;
	}
	
	
	public static Scene creazaScena(String tipScena,Parent parent,double width, double height, Paint fill) {
		Scene tipScenaDorit = null;
		
		if(tipScena.equalsIgnoreCase("Config")) {
			tipScenaDorit = new Build_ConfigAPP( parent, width,  height, fill);
		}
		else if(tipScena.equalsIgnoreCase("Info")) {
			tipScenaDorit = new Build_InfoAPP( parent, width,  height, fill);
		}
		else if(tipScena.equalsIgnoreCase("Intro")) {
			tipScenaDorit = new Build_IntroAPP( parent, width,  height,  fill);
		}
		return tipScenaDorit;
	}
	
	private static void decriseYellow(Scene scene) {
		fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        System.out.println("this is called every 1 seconds on UI thread");
		        	if(i+ 0.10 >0 && (i + 0.10)<1 && win==false) {
		        		i = i + 0.10;
		        		colorBackgroundLvl01 = new Color(1,1,i,0.8);
		        		scene.setFill(colorBackgroundLvl01);
		        }
		        
		    }
		}));
		fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		fiveSecondsWonder.play();
	}
	
}
