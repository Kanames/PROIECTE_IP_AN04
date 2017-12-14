package Pachet_aplicatie_data;

public class GameHelper {
	public static String implodString(String string) {
		System.out.println(string);
		StringBuffer themeFinal = new StringBuffer();
		char ary[] = string.toCharArray();
		System.out.println(ary.length);
		for(int i = 0 ; i < ary.length ; i++){
			themeFinal.append(ary[i]+" ");
			System.out.println(ary[i]);
		}
		return themeFinal.toString();
	}
}
