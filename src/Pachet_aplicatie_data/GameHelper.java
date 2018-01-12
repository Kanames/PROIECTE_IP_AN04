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

	public static ArrayList<String> creatingRGBfromWord(String word) {
		ArrayList<String> colorComponentsRGB = new ArrayList<String>();
		if(word.equalsIgnoreCase("YELLOW")) {
			colorComponentsRGB.add("1");
			colorComponentsRGB.add("1");
			colorComponentsRGB.add("0");
		}else if(word.equalsIgnoreCase("RED")) {
			colorComponentsRGB.add("1");
			colorComponentsRGB.add("0");
			colorComponentsRGB.add("0");
		}else if(word.equalsIgnoreCase("GREEN")) {
			colorComponentsRGB.add("0");
			colorComponentsRGB.add("1");
			colorComponentsRGB.add("0");
		}else if(word.equalsIgnoreCase("BLUE")) {
			colorComponentsRGB.add("0");
			colorComponentsRGB.add("0");
			colorComponentsRGB.add("1");
		}
		return colorComponentsRGB;
	}
	
	
	
}
