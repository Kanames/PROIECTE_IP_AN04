package Pachet_infoScene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SituatieJocObserver implements IObserver {
	private String pcUser  		= System.getProperty("user.name");
	private Date  playingDate   = new Date();;
	private Long nrOfWins;
	private String nrOfWinsString;
	private String levelName;
	
		// Static used as a counter
		private static int observerIDTracker = 0;
		
		// Used to track the observers
		private int observerID;
		
		// Will hold reference to the scenaCurenta object
		private ISubject scenaCurenta;
		
		
		public SituatieJocObserver(ISubject scenaCurenta){
			this.scenaCurenta = scenaCurenta;
	
			// Assign an observer ID and increment the static counter
			this.observerID = ++observerIDTracker;

			System.out.println("New Observer " + this.observerID);
			// Add the observer to the Subjects ArrayList
			scenaCurenta.register(this);
		}
		
		// Called to update all observers
		public void update(Long nrOfWins, String levelName) {
			this.levelName = levelName;
			this.nrOfWins = nrOfWins;
			this.nrOfWinsString = levelName+" castiguri-> "+ nrOfWins.toString();
			printeazaSituatiaJocului();
			
		}
		
		public DetaliInfo printeazaSituatiaJocului(){
			DetaliInfo listDetaliInfo = new DetaliInfo();
			listDetaliInfo.setUltimulNivelCastigat(levelName == null ? "please play first":levelName);
			listDetaliInfo.setNrCatiguriNivel(nrOfWins == null ? 0 :nrOfWins);
			listDetaliInfo.setNumeUser(pcUser == null ? "please play first":pcUser);
			return listDetaliInfo;
		}
	
}
