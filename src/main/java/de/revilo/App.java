package de.revilo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Throwable {
		logger.info("Hello World!");
		
		/*
		try {
			int  ie = 5/0;
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;
		}*/

		
		for (int i = 0; i < 10; i++) {

			Thread t = new Thread(new App(), "program " + i);
			t.start();
		}

	}

	@Override
	public void run() {
		logger.info("App starter");
	}
}
