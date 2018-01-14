package Pachet_aplicatie_main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log4Debug {
	static ContextAplicatie APP_INFO = INVOKEAppProperties.contextAplicatieProcessed(); // Pattern:SINGLETON
	private static Log4Debug log4debug = new Log4Debug();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private Log4Debug() {
	}

	/* Static 'instance' method */
	public static Log4Debug getInstance() {
		return log4debug;
	}

	/* Other methods protected by singleton-ness */
	protected static void debug(String str1) throws IOException {
		System.out.println("APP_INFO.getLogURL(): " + APP_INFO.getLogURL());
		BufferedWriter b = null;
		PrintWriter p = null;
		try {
			FileWriter f = new FileWriter(APP_INFO.getLogURL(), true);
			b = new BufferedWriter(f);
			p = new PrintWriter(b);
			p.println(str1);
		} catch (IOException i) {
			i.printStackTrace();
		} finally {
			b.close();
			p.close();
		}
	}

}
