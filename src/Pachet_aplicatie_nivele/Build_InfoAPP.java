package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.IMainApplication;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Build_InfoAPP extends Scena{


	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	private static Pane panelFinal;
	public static SituatieJocObserver situatieJocO;
	private static Button back;
	
	private static Text ultimulNivelCastigat;
	private static Text numarDeCastiguri;
	private static Text numeUser;
	
	public Build_InfoAPP(Pane root) {
		super(root);
	}
	
	public Build_InfoAPP(Pane root, double width, double height, Paint fill) {
		super(root, width, height, fill);
	}

	public static Scene setting(Pane root, double width, double height, Paint fill, Stage primaryStage) {
		System.out.println("<<< IN Build_IntroAPP() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("root "+root);
		System.out.println("width "+width);
		System.out.println("height "+height);
		System.out.println("fill "+fill);
		
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
				NivelFactory.creazaScena("Intro", null,  width,  height,  fill,  primaryStage);
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
		
		System.out.println("--parametriOut-- ");
		System.out.println("root "+panelFinal.getChildren().toString());
		System.out.println("<<< OUT Build_IntroAPP() >>>");
		
		Scena scenaFinala =  new Build_IntroAPP(panelFinal,  width,  height,  fill);
		primaryStage.setScene(scenaFinala);
		return scenaFinala;
	}
	
}
