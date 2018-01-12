package Pachet_aplicatie_data;

import java.util.ArrayList;

public class GameHelper {
	public static String implodString(String string) {
		System.out.println("<<< IN GameHelper--implodString() >>>");
		StringBuffer themeFinal = new StringBuffer();
		char ary[] = string.toCharArray();
		for(int i = 0 ; i < ary.length ; i++){
			themeFinal.append(ary[i]+" ");
		}
		System.out.println("<<< IN GameHelper--implodString() >>>");
		return themeFinal.toString();
	}
	
	public static ArrayList<String> calcularePozitiNivel02(int dimensiunePanelX, int dimensiunePanelY, int nrRanduri , int nrButoanePeRand){
		ArrayList<String> listaPozitiButoane = new ArrayList<String>();
	    int randInaltimeY = dimensiunePanelY / nrRanduri;
	    int randLatimeX   = dimensiunePanelX / nrButoanePeRand;
	    	System.out.println("randInaltimeY: "+randInaltimeY);
	   		System.out.println("randLatimeX: "+randLatimeX);
	    
	    int centruObjY = randInaltimeY / 2;
	    int centruObjX = randLatimeX   / 2;
	    int fillWidth = 0;
	    int fillHeight= 0;
	    for(int j = 0 ; j < nrRanduri ; j++){
	    	for(int i = 0 ; i < nrButoanePeRand ; i++){
	      		System.out.println("Obiect nr."+i+" randul:"+j);
					System.out.println("centruObjX: "+centruObjX);
	   				System.out.println("centruObjY: "+centruObjY);
	   				System.out.println("fillWidth: "+fillWidth);
	   				System.out.println("fillHeight: "+fillHeight);
					listaPozitiButoane.add(String.valueOf(centruObjX)+" "+String.valueOf(centruObjY)+" "+String.valueOf(fillWidth)+" "+String.valueOf(fillHeight));
	   				centruObjX = centruObjX + randLatimeX;
	   				fillWidth  =  fillWidth + randLatimeX;
	    	}
	    	fillHeight = fillHeight + randInaltimeY;	
	    	fillWidth = 0;
	    centruObjX = randInaltimeY / 2;
		centruObjY = centruObjY + randInaltimeY;
	    }
		return listaPozitiButoane;	
	  }
	
}
