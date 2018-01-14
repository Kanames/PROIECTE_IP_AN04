package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import Pachet_infoScene.DetaliInfo;
import Pachet_infoScene.SituatieJocObserver;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Build_InfoAPP extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static Pane panelFinal;
	public static SituatieJocObserver situatieJocO;
	private static Button back;
	
	private static Text ultimulNivelCastigat;
	private static Text numarDeCastiguri;
	private static Text numeUser;
	
	public Build_InfoAPP(Pane root) {
		super(root);
	}
	

	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- root:"+root);

		DetaliInfo info = situatieJocO.printeazaSituatiaJocului();
		numeUser= new Text();
		ultimulNivelCastigat= new Text();
		numarDeCastiguri= new Text();
		numeUser.setFont(Font.font ("Arial", 15));
		ultimulNivelCastigat.setFont(Font.font ("Arial", 15));
		numarDeCastiguri.setFont(Font.font ("Arial", 15));
			numeUser.setText("Nume utilizator :         "+info.getNumeUser());     
			numeUser.setLayoutX(100);
			numeUser.setLayoutY(100);
			ultimulNivelCastigat.setText("Utilmul nivel castigat : "+info.getUltimulNivelCastigat());
			ultimulNivelCastigat.setLayoutX(100);
			ultimulNivelCastigat.setLayoutY(125);
			numarDeCastiguri.setText("Numar castiguri total :  "+info.getNrCatiguriNivel());
			numarDeCastiguri.setLayoutX(100);
			numarDeCastiguri.setLayoutY(150);
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
		Canvas canvasProcessed= Scena.modifConvasInfo(canvasBack);
		
		panelFinal.getChildren().add(canvasProcessed);
		panelFinal.getChildren().add(back);
		panelFinal.getChildren().add(ultimulNivelCastigat);
		panelFinal.getChildren().add(numarDeCastiguri);
		panelFinal.getChildren().add(numeUser);
		

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
