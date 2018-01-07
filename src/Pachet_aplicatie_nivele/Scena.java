package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelper;
import Pachet_aplicatie_data.GameHelperPosition;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class Scena extends Scene{
	
	public Scena(Parent root) {
		super(root);
	}

	public Scena(Parent root, double width, double height, Paint fill) {
		super(root, width, height, fill);
	}

	protected static Canvas addCanvasYellowBackground(String themeColorTxt,Boolean wantedText) {
		System.out.println("<<< IN Scena--addCanvasYellowBackground() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("themeColorTxt: "+themeColorTxt);
		Canvas canvas = new Canvas(800, 400);
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	    
	    //--Background
	    gc.setFill(Color.YELLOW);
	    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

	    boolean wantedMiddleText = wantedText;
		if(wantedMiddleText  == true) {
	    //--MiddleText
	    gc.setFont(new Font("Arial", 50));
	    gc.setFill(Color.BLACK);
	    gc.fillText(GameHelper.implodString(themeColorTxt), GameHelperPosition.calcYNameApp(800,GameHelper.implodString(themeColorTxt)), GameHelperPosition.calcXNameApp(400));
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

	public static Canvas addCanvasYellowBackgroundNivel02(String themeColorTxt, boolean b,int length,int height) {
		System.out.println("<<< IN Scena--addCanvasYellowBackground() >>>");
		System.out.println("--parametriIn-- ");
		System.out.println("themeColorTxt: "+themeColorTxt);
		Canvas canvas = new Canvas(length, height);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		  //--Background
	    gc.setFill(Color.YELLOW);
	    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	    
		return canvas;
	}
	
}
