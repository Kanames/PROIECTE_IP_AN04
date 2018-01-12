package Pachet_infoScene;

// The Observers update method is called when the Subject changes

public interface IObserver {
	
	public void update(Long nrOfWins, String levelName);
	
}