package Pachet_aplicatie_data;



public class GameHelperPosition {
	
	public static Double calcXNameApp(double width) {
		return (width/2)-((50)/2);
	}
	public static Double calcYNameApp(double height,String element) {
	    System.out.println(element.length() + " letters.");
		return  (height/2)-((element.length()*25)/2);
	}
	public static void main(String[] args) {
		System.out.println(calcYNameApp(800,"Y E L L O W"));
		System.out.println(calcXNameApp(400));
		
	}
}
