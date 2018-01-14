package Pachet_aplicatie_nivele;

import Pachet_aplicatie_data.GameHelperSounds;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.IMainApplication;
import Pachet_aplicatie_main.INVOKEAppProperties;
import Pachet_nivel_02.ButoaneNivel02;
import Pachet_nivel_02.IteratorButoane;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Build_Nivel02  extends Scena{
	
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private static String THEME_COLOR_APP = APP_INFO.getThemeColor();
	private static int NR_OF_ROWS         = APP_INFO.getNrRanduriNivel02(); 
	private static int NR_OF_BTNS_PER_ROW = APP_INFO.getNrButoanePerRandNivel02();
	
	public static int nrOfBoxexCheck = 0;
	public static Canvas canvas;
	static double i = 1;
	static Boolean win = false;	
	static Timeline fiveSecondsWonder;
	static Color colorBackgroundLvl01;
	public static Pane panelFinal;
	
	public Build_Nivel02(Parent root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	public static Scene setting(Pane root) {
		System.out.println("<<< IN Build_Nivel02() >>>");

		if(root == null) {
			panelFinal = new Pane();
		}else {
			panelFinal = root;
		}
		canvas = Scena.addCanvasYellowBackgroundNivel02(THEME_COLOR_APP,true,200,200);
		
		
		ButoaneNivel02 btnGenerator = new ButoaneNivel02();
		btnGenerator.setNumberOfRows(NR_OF_ROWS);
		btnGenerator.setNumberButtonsPerRow(NR_OF_BTNS_PER_ROW);
		
		IteratorButoane iterator = btnGenerator.getIterator(panelFinal);
		
		while(iterator.hasNext()){	
			Node node = (Node) iterator.next();
			panelFinal.getChildren().add(node);
		}
		
		
		Scene scene = new Scene(panelFinal, 800 ,400);
		System.out.println("<<< OUT Build_Nivel02() >>>");
		return scene;
	}
	public static void checkWin() {
		if(nrOfBoxexCheck == 8) {
			
			double width = 800 , height = 400;
			System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
			IMainApplication.situatieJocS.notifyObserver();
			System.out.println("<<<<<<<<<<<<<ObserverPattern>>>>>>>>>>>>>");
			
			GameHelperSounds.onWin();
			nrOfBoxexCheck = 0;
			NivelFactory.creazaScena("Level03", null);
			
			
		}
		
	}
	
	
	
}
