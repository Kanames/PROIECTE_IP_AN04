package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class NivelFactory {
	

	
	
	public static Scene creazaScena(String tipScena,Pane root,double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN NivelFactory.creazaScena() >>>");
		System.out.println("parametriIN: tipScena: "+tipScena+"");
		Scene tipScenaDorit = null;
		
		if(tipScena.equalsIgnoreCase("Config")) {
			tipScenaDorit = new Build_ConfigAPP( root, width,  height, fill);
		}
		else if(tipScena.equalsIgnoreCase("Info")) {
			tipScenaDorit = new Build_InfoAPP( root, width,  height, fill);
		}
		else if(tipScena.equalsIgnoreCase("Intro")) {
			System.out.println("Intrat in IF case good");
			tipScenaDorit = Build_IntroAPP.setting( root, width,  height,fill,primaryStage);
			System.out.println("iesit din IF");
		}
		else if(tipScena.equalsIgnoreCase("Level01")) {
			tipScenaDorit = Build_Nivel01.setting(root, width,  height,fill,primaryStage);
		}
		System.out.println("<<< IN NivelFactory.creazaScena() >>>");
		return tipScenaDorit;
	}
	
	
	
}
