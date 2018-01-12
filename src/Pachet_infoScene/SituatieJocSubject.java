package Pachet_infoScene;

import java.util.ArrayList;

public class SituatieJocSubject implements ISubject{
	
	private static String numeNivel;
	private static Long nrCastiguri;
	
	private ArrayList<SituatieJocObserver> observers;

	public SituatieJocSubject(){
		  // Creates an ArrayList to hold all observers
		  observers = new ArrayList<SituatieJocObserver>();
	}

	@Override
	public void register(SituatieJocObserver situatieJocObserver) {
		// Adds a new observer to the ArrayList
		observers.add(situatieJocObserver);
	}

	@Override
	public void unregister(SituatieJocObserver o) {
		// Get the index of the observer to delete
		int observerIndex = observers.indexOf(o);
		// Print out message (Have to increment index to match)
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		// Removes observer from the ArrayList
		observers.remove(observerIndex);
	}
	
	@Override
	public void notifyObserver() {
		// Cycle through all observers and notifies them of
		System.out.println("----"+nrCastiguri);
		System.out.println("----"+numeNivel);
		for(SituatieJocObserver observer : observers){
			observer.update(nrCastiguri == null ? 0 : nrCastiguri,numeNivel);
		}
	}

	public static String getNumeNivel() {
		return numeNivel;
	}

	public static void setNumeNivel(String numeNivel) {
		SituatieJocSubject.numeNivel = numeNivel;
	}

	public static Long getNrCastiguri() {
		return nrCastiguri;
	}

	public static void setNrCastiguri(Long nrCastiguri) {
		SituatieJocSubject.nrCastiguri = nrCastiguri;
	}
	
	


}
