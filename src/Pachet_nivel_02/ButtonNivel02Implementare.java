package Pachet_nivel_02;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import Pachet_aplicatie_nivele.Build_Nivel02;
import Pachet_aplicatie_nivele.Scena;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class ButtonNivel02Implementare extends Button{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String NUME_APP        = APP_INFO.getNumeApp();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static String ICON_URL_APP    = APP_INFO.getIconURL();
	
	public ButtonNivel02Implementare(int width,int height,int fillWidth, int fillHeight) {
		this.setStyle("-fx-color:"+"none"+"; -fx-border:none;");
		this.setGraphic(new ImageView("/Pachet_aplicatie_resurse/lvl02a.png"));
		this.setOnAction(e-> {
			GameHelperSounds.onClickSound();
			Canvas canvas= Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
			canvas.setLayoutX(fillWidth);
			canvas.setLayoutY(fillHeight);
			Build_Nivel02.panelFinal.getChildren().add(canvas);
			Build_Nivel02.nrOfBoxexCheck++;
			Build_Nivel02.checkWin();
			});
		this.setLayoutX(width);
		this.setLayoutY(height);
	}
	
}
