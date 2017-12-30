package Pachet_aplicatie_data;

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
}
