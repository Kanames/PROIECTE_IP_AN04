package Pachet_nivel_03;

import java.util.ArrayList;
import java.util.List;

import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_aplicatie_main.INVOKEAppProperties;
import javafx.scene.shape.Rectangle;

public class Cadru {
	private int nrDeCadre;
	static ContextAplicatie APP_INFO      = INVOKEAppProperties.contextAplicatieProcessed();
	private int WIDTH_PANEL =APP_INFO.getLatimeAplicatie();
	private int HEIGHT_PANEL = APP_INFO.getLungimeAplicatie();
	private List<Rectangle> listeDeCadre = new ArrayList<Rectangle>();;
	
	//Constructor
	public Cadru(int nrDeCadre) {
		this.nrDeCadre = nrDeCadre;
	}
	
	private void add(CadruImplementare cadru) {
		listeDeCadre.add(cadru.getCadru());
	}
	
	private void remove(CadruImplementare cadru) {
		listeDeCadre.remove(cadru);
	}
	
	public List<Rectangle> getCadre() {
		System.out.println("Cadru - this.nrDeCadre: "+this.nrDeCadre);
		int widthCadru = WIDTH_PANEL/nrDeCadre;
		int pozX= 0;
		int pozY = 0;
		for(int i = 0 ; i < this.nrDeCadre ; i++) {
			CadruImplementare cadru = new CadruImplementare(pozX,pozY,widthCadru,HEIGHT_PANEL);
			System.out.println("Cadru - cadru.getCadru(): "+cadru.getCadru().toString());
			listeDeCadre.add(cadru.getCadru());
			pozX = pozX + widthCadru;
		}
		return listeDeCadre;
	}
	
	
}
