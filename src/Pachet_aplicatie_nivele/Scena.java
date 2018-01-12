package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelper;
import Pachet_aplicatie_data.GameHelperPosition;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public abstract class Scena extends Scene {

	static ContextAplicatie APP_INFO = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();

	public Scena(Parent root) {
		super(root, APP_INFO.getLatimeAplicatie(), APP_INFO.getLungimeAplicatie(), Paint.valueOf(THEME_COLOR_APP));
	}

	protected static Canvas addCanvasYellowBackground(String themeColorTxt, Boolean wantedText) {
		System.out.println("<<< IN Scena--addCanvasYellowBackground() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("themeColorTxt: " + themeColorTxt);
		Canvas canvas = new Canvas(800, 400);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// --Background
		gc.setFill(Paint.valueOf(THEME_COLOR_APP));
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

		boolean wantedMiddleText = wantedText;
		if (wantedMiddleText == true) {
			// --MiddleText
			gc.setFont(new Font("Arial", 50));
			gc.setFill(Color.BLACK);
			gc.fillText(GameHelper.implodString(themeColorTxt),
					GameHelperPosition.calcYNameApp(800, GameHelper.implodString(themeColorTxt)),
					GameHelperPosition.calcXNameApp(400));
		}

		System.out.println("<<< OUT Scena--addCanvasYellowBackground() >>>");
		return canvas;
	}

	public static Canvas modifConvasInfo(Canvas canvasBack) {
		GraphicsContext gc = canvasBack.getGraphicsContext2D();
		return canvasBack;
	}

	public static Canvas modifConvasConfig(Canvas canvasBack) {
		GraphicsContext gc = canvasBack.getGraphicsContext2D();
		return canvasBack;
	}

	public static Canvas addCanvasYellowBackgroundNivel02(String themeColorTxt, boolean b, int length, int height) {
		System.out.println("<<< IN Scena--addCanvasYellowBackground() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("themeColorTxt: " + themeColorTxt);
		Canvas canvas = new Canvas(length, height);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		// --Background
		gc.setFill(Color.YELLOW);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

		return canvas;
	}

}
