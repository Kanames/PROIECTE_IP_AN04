package Pachet_nivel_02;

import java.util.ArrayList;

import Pachet_aplicatie_data.GameHelper;
import Pachet_aplicatie_data.GameHelperPosition;
import javafx.scene.layout.Pane;

public class ButoaneNivel02 implements IButoaneNivel02{
	
    public static ArrayList<ButtonNivel02Implementare> butoaneNivel02;
    private int rows = 0 ;
    private int btnsPerRow = 0;
    
    @Override
    public IteratorButoane getIterator(Pane panelFinal){
        butoaneNivel02 = new ArrayList<ButtonNivel02Implementare>();
   
        ArrayList<String> pozitieXsiY = GameHelperPosition.calcularePozitiNivel02(800,400,rows,btnsPerRow);
        System.out.println("pozitieXsiY: "+pozitieXsiY);
		for(String pozitieXsiYStr : pozitieXsiY){
			String[] pozXY = pozitieXsiYStr.split("\\s+");
				int x = Integer.valueOf(pozXY[0]);
				int y = Integer.valueOf(pozXY[1]);
				System.out.println("Button creat ! X="+x+" Y="+y);
				int fillWidth   = Integer.valueOf(pozXY[2]);;
				int fillHeight  = Integer.valueOf(pozXY[3]);;
				ButtonNivel02Implementare btn = new ButtonNivel02Implementare(x ,y,fillWidth,fillHeight);
				butoaneNivel02.add(btn);
		}
        
        return new IteratorButoane();
    }

	public void setNumberOfRows(int rows) {
		this.rows = rows;
		
	}

	public void setNumberButtonsPerRow(int btnsPerRow) {
		this.btnsPerRow = btnsPerRow;
		
	}
}
