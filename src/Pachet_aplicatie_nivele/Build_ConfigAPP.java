package Pachet_aplicatie_nivele;

import java.awt.TextField;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Build_ConfigAPP extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static Pane panelFinal;
	
	private static Button back;
	
	public Build_ConfigAPP(Pane root, double width, double height) {
		super(root);
	}

	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- root:"+root);

		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		
		back = new Button("BACK TO MAIN MENU");
		back.setStyle("-fx-color:"+THEME_COLOR_APP+"; -fx-border:none;");
		back.setOnAction(e -> {
				GameHelperSounds.onClickSound();
				NivelFactory.creazaScena("Intro", null);
			});
		back.setLayoutX(20);
		back.setLayoutY(20);
		Canvas canvasBack= Scena.addCanvasYellowBackground(THEME_COLOR_APP,false);
		Canvas canvasProcessed= Scena.modifConvasConfig(canvasBack);
		
		
		
		panelFinal.getChildren().add(canvasProcessed);
		panelFinal.getChildren().add(back);

		Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(1);
		slider.setValue(0.5);
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setMajorTickUnit(0.1);
		slider.setMinorTickCount(1);
		slider.setBlockIncrement(0.1);
		slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			GameHelperSounds.configON = true;
	        GameHelperSounds.volumeBackground = newValue.doubleValue();
	        GameHelperSounds.OnValueChangedBackground();
	    });
		Text backMusicChange = new Text();
		backMusicChange.setText("Muzica fundal: ");
		backMusicChange.setLayoutX(60);
		backMusicChange.setLayoutY(70);
		slider.setLayoutX(150);
		slider.setLayoutY(57);
		panelFinal.getChildren().add(slider);
		panelFinal.getChildren().add(backMusicChange);
		
		Line linesus = new Line();
		linesus.setStartX(10);
		linesus.setStartY(10);
		linesus.setEndX(790);
		linesus.setEndY(10);
        panelFinal.getChildren().add(linesus);
        Line linedreapta = new Line();
        linedreapta.setStartX(790);
        linedreapta.setStartY(10);
		linedreapta.setEndX(790);
		linedreapta.setEndY(390);
        panelFinal.getChildren().add(linedreapta);
        Line linejos = new Line();
        linejos.setStartX(790);
        linejos.setStartY(390);
        linejos.setEndX(10);
		linejos.setEndY(390);
        panelFinal.getChildren().add(linejos);
        Line linestanga = new Line();
        linestanga.setStartX(10);
        linestanga.setStartY(390);
        linestanga.setEndX(10);
        linestanga.setEndY(10);
        panelFinal.getChildren().add(linestanga);
		
		
		Scena scenaFinala =  new Build_IntroAPP(panelFinal);
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		return scenaFinala;
	}

	
}
