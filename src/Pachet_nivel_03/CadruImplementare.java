package Pachet_nivel_03;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import Pachet_aplicatie_nivele.Build_Nivel02;
import Pachet_aplicatie_nivele.Build_Nivel03;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class CadruImplementare extends Rectangle{
	
	private Rectangle cadru;
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	
	public CadruImplementare(int x, int y, int width , int height) {
		this.cadru = new Rectangle(x, y, width, height);
		this.cadru.setFill(Color.RED);
		this.cadru.setStroke(Color.BLACK);
		this.cadru.setStrokeWidth(10);
		System.out.println("CadruImplementare - cadru.toString(): "+cadru.toString());
		this.cadru.setOnMouseClicked(e->{
			this.cadru.setFill(Paint.valueOf(APP_INFO.getThemeColor()));
			this.cadru.setStroke(Paint.valueOf(APP_INFO.getThemeColor()));
			GameHelperSounds.onClickSound();
			Build_Nivel03.checkWin();
		});
	}
	
	public Rectangle getCadru() {
		System.out.println("CadruImplementare - cadru.toString(): "+cadru.toString());
		return cadru;
	}
	
}
