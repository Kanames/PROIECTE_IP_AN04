package Pachet_infoScene;

import java.util.Observer;

//This interface handles adding, deleting and updating
//all observers 

public interface ISubject {
	
	public void register(SituatieJocObserver situatieJocObserver);
	public void unregister(SituatieJocObserver o);
	public void notifyObserver();
	
}