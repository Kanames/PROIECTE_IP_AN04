package Pachet_aplicatie_data;

import java.io.File;

import javafx.concurrent.Task;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;

public class GameHelperSounds {
	public static void playBackgroundSound() {
		final Task task = new Task() {
			@Override
			protected Object call() throws Exception {
				int repeatSong = 3;
				AudioClip audio = new AudioClip(
						getClass().getResource("../Pachet_aplicatie_resurse/Background (2).mp3").toExternalForm());
				audio.setVolume(0.8f);
				audio.setCycleCount(repeatSong);
				audio.play();
				return null;
			}
		};
		Thread thread = new Thread(task);
		thread.start();
	}

	public static void onClickSound() {
		
		String musicFile2 = "C:\\Users\\Stefan\\git\\PROIECTE_IP_AN04\\src\\Pachet_aplicatie_resurse\\Click2.mp3";
		Media sound2 = new Media(new File(musicFile2).toURI().toString());
		MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
		mediaPlayer2.play();
		
	}
	public static void onWin() {
		final Task task = new Task() {
			@Override
			protected Object call() throws Exception {

				AudioClip audio = new AudioClip(
						getClass().getResource("../Pachet_aplicatie_resurse/Win.mp3").toExternalForm());
				audio.setVolume(0.9f);

				audio.play();
				return null;
			}
		};
		Thread thread = new Thread(task);
		thread.start();
	}

//	public static void onWin() throws MediaException{
//
//		String musicFile2 = "C:\\Users\\Stefan\\ECLIPSE-workspace\\Proiect_IP\\src\\resurse\\Win.mp3";
//		Media sound2 = new Media(new File(musicFile2).toURI().toString());
//		MediaPlayer mediaPlayer2 = new MediaPlayer(sound2);
//		mediaPlayer2.play();
//
//
//	}

}
