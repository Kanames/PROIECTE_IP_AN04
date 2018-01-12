package Pachet_aplicatie_main;

public class ContextAplicatie {
	private String  NumeApp;
	private Long  	lvlNumbers;
	private String  iconURL;
	private String  backgroundSound1;
	private String  backgroundSound2;
	private String  ThemeColor;
	private int  latimeAplicatie;
	private int  lungimeAplicatie;
	private static ContextAplicatie instance = null;

	private int nrButoanePerRandNivel02;
	private int nrRanduriNivel02;
	
	public ContextAplicatie() {
		// Exists only to defeat instantiation.
	}

	public static ContextAplicatie getInstance() {
		if (instance == null) {
			instance = new ContextAplicatie();
		}
		return instance;
	}
	
	public String getNumeApp() {
		return NumeApp;
	}
	public void setNumeApp(String numeApp) {
		NumeApp = numeApp;
	}
	public Long getLvlNumber() {
		return lvlNumbers;
	}
	public void setLvlNumber(Long lvlNumbers) {
		this.lvlNumbers = lvlNumbers;
	}

	public String getIconURL() {
		return iconURL;
	}

	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	public String getBackgroundSound1() {
		return backgroundSound1;
	}

	public void setBackgroundSound1(String backgroundSound1) {
		this.backgroundSound1 = backgroundSound1;
	}

	public String getBackgroundSound2() {
		return backgroundSound2;
	}

	public void setBackgroundSound2(String backgroundSound2) {
		this.backgroundSound2 = backgroundSound2;
	}

	public String getThemeColor() {
		return ThemeColor;
	}

	public void setThemeColor(String themeColor) {
		ThemeColor = themeColor;
	}

	public int getNrRanduriNivel02() {
		return nrRanduriNivel02;
	}

	public void setNrRanduriNivel02(int nrRanduriNivel02) {
		this.nrRanduriNivel02 = nrRanduriNivel02;
	}

	public int getNrButoanePerRandNivel02() {
		return nrButoanePerRandNivel02;
	}

	public void setNrButoanePerRandNivel02(int nrButoanePerRandNivel02) {
		this.nrButoanePerRandNivel02 = nrButoanePerRandNivel02;
	}

	public int getLatimeAplicatie() {
		return latimeAplicatie;
	}

	public void setLatimeAplicatie(int latimeAplicatie) {
		this.latimeAplicatie = latimeAplicatie;
	}

	public int getLungimeAplicatie() {
		return lungimeAplicatie;
	}

	public void setLungimeAplicatie(int lungimeAplicatie) {
		this.lungimeAplicatie = lungimeAplicatie;
	}

	
}
