package Pachet_aplicatie_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import Pachet_aplicatie_data.GameHelperPosition;
import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_nivel_02.ButoaneNivel02;
import Pachet_nivel_02.ButtonNivel02Implementare;
import Pachet_nivel_02.IteratorButoane;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

class testingYellowElements {
	private static final int NR_OF_ROWS = 2;
	private static final int NR_OF_BTNS_PER_ROW = 10;
	private static Logger logger = Logger.getAnonymousLogger();
	
	// Categorie Sabloane creationale - sablon SINGLETON
	//------------------------------------------ Testarea sablonului SINGLETON
	@Test
	void testSingletonGood() {
		logger.info("<<<Testing GOOD singleton>>>");
		ContextAplicatie contextAPP;
		ContextAplicatie contextAPP2;
		logger.info("getting singleton...");
		contextAPP = ContextAplicatie.getInstance();
		logger.info("...got singleton: " + contextAPP);
		contextAPP.setLvlNumber(new Long(1));
		logger.info("getting singleton...");
		contextAPP2 = ContextAplicatie.getInstance();
		logger.info("...got singleton: " + contextAPP2);
		assertEquals(contextAPP,ContextAplicatie.getInstance());
		
	}
	@Test
	void testSingletonBad() {
		logger.info("<<<Testing BAD singleton>>>");
		ContextAplicatie contextAPP;
		ContextAplicatie contextAPP2;
		logger.info("getting singleton...");
		contextAPP = ContextAplicatie.getInstance();
		logger.info("...got singleton: " + contextAPP);
		contextAPP.setLvlNumber(new Long(1));
		logger.info("creating new istance...");
		contextAPP2 = new ContextAplicatie();
		logger.info("...got instance: " + contextAPP2);
		assertEquals(contextAPP,contextAPP2);
	}
	//------------------------------------------ Testarea sablonului SINGLETON
	
	// Categorie Sabloane creationale - sablon FACTORY
	//------------------------------------------ Testarea sablonului FACTORY
//	@Test
//	void testFactoryGood() {
//		//Check to see the object is the correct concrete implementation you were looking for:
//		//You can check if the factory setup the concrete instances with valid instance variables.
//		Scene tipScenaDorit = null;
//		String tipScena = "Intro";
//		if(tipScena.equalsIgnoreCase("Intro")) {
//			System.out.println("<< Intrat in IF case good(Intro)");
//			tipScenaDorit = Build_IntroAPP.setting(null);
//			System.out.println("<< Iesit din IF(Intro)");
//		}
//		Boolean b = tipScenaDorit instanceof Scene;
//	}
//	
//	@Test
//	void testFactoryBad() {
//			
//	}
	//------------------------------------------ Testarea sablonului FACTORY
		
	
	
	// Categorie Sabloane creationale - sablon FACTORY
	//------------------------------------------ Testarea sablonului ITERATOR
	@Test
	void testIteratorGood() {
		int nrObiecte = 0 ;
		IteratorButoane iterator = getIterator();
		while(iterator.hasNext()){	
			Node node = (Node) iterator.next();
			logger.info("...obiectul cu nr: " + (nrObiecte++) +" adaugat prin iteratie.");
		}
	}
	
	public IteratorButoane getIterator(){
		ArrayList<ButtonNivel02Implementare> butoaneNivel02 = new ArrayList<ButtonNivel02Implementare>();
        ArrayList<String> pozitieXsiY = GameHelperPosition.calcularePozitiNivel02(800,400,NR_OF_ROWS,NR_OF_BTNS_PER_ROW);
        System.out.println("pozitieXsiY: "+pozitieXsiY);
		for(String pozitieXsiYStr : pozitieXsiY){
			String[] pozXY = pozitieXsiYStr.split("\\s+");
				int x = Integer.valueOf(pozXY[0]);
				int y = Integer.valueOf(pozXY[1]);
				System.out.println("Button creat ! X="+x+" Y="+y);
				int fillWidth   = Integer.valueOf(pozXY[2]);;
				int fillHeight  = Integer.valueOf(pozXY[3]);;
				ButtonNivel02Implementare btn = new ButtonNivel02Implementare(x ,y,fillWidth,fillHeight);
				butoaneNivel02.add(btn);
		}
        
        return new IteratorButoane();
    }

	//------------------------------------------ Testarea sablonului ITERATOR
	
	
	
	
	
	
	
	
	
	
//------- Testarea sablonului SINGLETON---------	Ex internet !
//	private ClassicSingleton sone = null, stwo = null;
//	   private static Logger logger = Logger.getRootLogger();
//	   public SingletonTest(String name) {
//	      super(name);
//	   }
//	   public void setUp() {
//	      logger.info("getting singleton...");
//	      sone = ClassicSingleton.getInstance();
//	      logger.info("...got singleton: " + sone);
//	      logger.info("getting singleton...");
//	      stwo = ClassicSingleton.getInstance();
//	      logger.info("...got singleton: " + stwo);
//	   }
//	   public void testUnique() {
//	      logger.info("checking singletons for equality");
//	      Assert.assertEquals(true, sone == stwo);
//	   }
//------- Testarea sablonului SINGLETON--------- https://www.javaworld.com/article/2073352/core-java/simply-singleton.html
}
