package Pachet_aplicatie_testing;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;

import Pachet_aplicatie_main.ContextAplicatie;
import Pachet_infoScene.IObserver;
import Pachet_infoScene.ISubject;
import Pachet_infoScene.SituatieJocObserver;
import Pachet_nivel_02.ButoaneNivel02;
import Pachet_nivel_02.IButoaneNivel02;
import Pachet_nivel_03.Cadru;
import javafx.scene.shape.Rectangle;

public class testingYellowElements {
	private static final int NR_OF_ROWS = 2;
	private static final int NR_OF_BTNS_PER_ROW = 10;
	
	private static Logger logger = Logger.getAnonymousLogger();
	
	// Categorie Sabloane creationale - sablon SINGLETON
	//------------------------------------------ Testarea sablonului SINGLETON
	@Test
	public void testSingletonGood() {
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
	public void testSingletonBad() {
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

	//------------------------------------------------------------------------------
	@Test
	public void testIteratorObject() throws Exception{
	  logger.info("<<<Testing iterator object>>>");
	  ButoaneNivel02 btnGenerator = new ButoaneNivel02();
	  btnGenerator.setNumberOfRows(NR_OF_ROWS);
	  btnGenerator.setNumberButtonsPerRow(NR_OF_BTNS_PER_ROW);
	  if(btnGenerator instanceof IButoaneNivel02){
	    logger.info("btnGenerator istanceof IButoaneNivel02 -> TRUE");
	  }
	}
	//------------------------------------------------------------------------------

	//------------------------------------------------------------------------------
	@Test
	public void testObserverObject() throws Exception{
	  logger.info("<<<Testing observer object>>>");
	  logger.info("Crearea de 3 obiecte de tipul SituatieJocObserver");
	  SituatieJocObserver situatieJocObserver1 = new SituatieJocObserver(new ISubject(){

		@Override
		public void register(SituatieJocObserver situatieJocObserver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unregister(SituatieJocObserver o) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notifyObserver() {
			// TODO Auto-generated method stub
			
		}});
	  SituatieJocObserver situatieJocObserver2 = new SituatieJocObserver(new ISubject(){

		@Override
		public void register(SituatieJocObserver situatieJocObserver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unregister(SituatieJocObserver o) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notifyObserver() {
			// TODO Auto-generated method stub
			
		}});
	  SituatieJocObserver situatieJocObserver3 = new SituatieJocObserver(new ISubject(){

		@Override
		public void register(SituatieJocObserver situatieJocObserver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void unregister(SituatieJocObserver o) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void notifyObserver() {
			// TODO Auto-generated method stub
			
		}});
	  if(situatieJocObserver1 instanceof IObserver){
	    logger.info("situatieJocObserver1 istanceof IObserver -> TRUE");
	  }
	}
	//------------------------------------------------------------------------------

	//------------------------------------------------------------------------------
		@Test
		public void testCompositeObject() throws Exception{
		  logger.info("<<<Testing composite object>>>");
		  int cadreCerute = 2;
		  Cadru cadru = new Cadru(cadreCerute);
		  List<Rectangle> listaCadre = cadru.getCadre();
		  for(int i = 0 ; i <listaCadre.size() ; i++){
			  if(listaCadre.get(i) instanceof Rectangle){
				    logger.info("cadru instanceof Rectangle -> TRUE");
			  }
		  }
		  
		}
	//------------------------------------------------------------------------------
	
	//------------------------------------------------------------------------------
	@Test
	public void testNrObiecteCerutePrimiteComposite() throws Exception{
	  logger.info("<<<Testing composite object>>>");
	  int cadreCerute = 2;
	  Cadru cadru = new Cadru(cadreCerute);
	  List<Rectangle> listaCadre = cadru.getCadre();
	  if(listaCadre.size() == cadreCerute){
	    logger.info("Lista de cadre cerute si primite sunt egale !");
	  }
	}
	//------------------------------------------------------------------------------

	

}
