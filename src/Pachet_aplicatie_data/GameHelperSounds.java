package Pachet_aplicatie_data;

import java.io.File;

import javafx.concurrent.Task;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class GameHelperSounds {
	public static double volumeBackground;
	public static boolean configON = false;
	private static AudioClip audioBackGround ;
	public static void OnValueChangedBackground (){
		System.out.println("aici! volumeBackground: "+volumeBackground+"     configON:"+configON);
		audioBackGround.setVolume(configON == false? 0.5 : volumeBackground);
		audioBackGround.stop();
		audioBackGround.play();
	 }
	
	public static void playBackgroundSound() {
		final Task task = new Task() {
			@Override
			protected Object call() throws Exception {
				int repeatSong = 3;
				audioBackGround  = new AudioClip(this.getClass().getResource("/Pachet_aplicatie_resurse/Background (2).mp3").toExternalForm());
				audioBackGround.setVolume(configON == false? 0.5 : volumeBackground);
				audioBackGround.setCycleCount(repeatSong);
				audioBackGround.play();
				return null;
			}
		};
		Thread thread = new Thread(task);
		thread.start();
	}

	public static void onClickSound() {
		String musicFile2 = "src/Pachet_aplicatie_resurse/Click2.mp3";
		//If you are using eclipse, place your text file in the root of the project folder, outside the /src and /bin folders. It should be now accessible via a relative path directly.
		//If you want to access a file in src folder, you have to append the /src/ prefix before the file path/name
		Media sound2 = new Media(new File(musicFile2).toURI().toString());
		MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
		mediaPlayer2.play();
		
	}
	public static void onWin() {
		final Task task = new Task() {
			@Override
			protected Object call() throws Exception {
				AudioClip audio = new AudioClip(this.getClass().getResource("/Pachet_aplicatie_resurse/win.mp3").toExternalForm());
				audio.setVolume(0.9f);
				audio.play();
				return null;
			}
		};
		Thread thread = new Thread(task);
		thread.start();
	}


}
