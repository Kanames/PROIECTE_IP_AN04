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
	
	public Build_InfoAPP(Pane root, double width, double height) {
		super(root, width, height);
	}

	public static Scene setting(Pane root, double width, double height) {
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
				NivelFactory.creazaScena("Intro", null,  width,  height);
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
		

		Scena scenaFinala =  new Build_IntroAPP(panelFinal,  width,  height);
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		return scenaFinala;
	}
	
}
