package Pachet_aplicatie_main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testingYellowElements {
	// Categorie Sabloane creationale - sablon SINGLETON
	//------------------------------------------ Testarea sablonului SINGLETON
	@Test
	void testSingletonGood() {
		ContextAplicatie contextAPP;
		contextAPP = ContextAplicatie.getInstance();
		contextAPP.setLvlNumber(new Long(1));
		assertEquals(contextAPP,ContextAplicatie.getInstance());
		
	}
	@Test
	void testSingletonBad() {
		ContextAplicatie contextAPP;
		contextAPP = ContextAplicatie.getInstance();
		contextAPP.setLvlNumber(new Long(1));
		assertEquals(contextAPP,new ContextAplicatie());
	}
	//------------------------------------------ Testarea sablonului SINGLETON
	
	
	
	
	
	
	
	
	
	
	
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
