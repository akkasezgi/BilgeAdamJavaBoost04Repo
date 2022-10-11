package com.bilgeadam.boost.week08.lesson002.airport;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


	public enum ApplicationLogger {
		INSTANCE;

		private static final String LOG_FILE_NAME = "C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Documents\\BA - Academy\\THY\\logfile.txt";
		private Logger              logger;

		private Logger getLogger() {
			if (this.logger == null) { // easy initialization pattern
				this.logger = Logger.getLogger("");
				for (Handler handler : logger.getHandlers()) {
					handler.setLevel(Level.ALL);
				}
				try {
					FileHandler logFileHandler = new FileHandler(ApplicationLogger.LOG_FILE_NAME, false);
					logFileHandler.setFormatter(new SimpleFormatter());
					logger.addHandler(logFileHandler);
					logger.setLevel(Level.FINE);
					logger.log(Level.INFO, LOG_FILE_NAME + " created for logging.");
				}
				catch (Exception ex) {
					System.err.println("Cannot create log file, because " + ex.getMessage() + ". System exiting...");
					System.exit(100);
				}
			}
			return this.logger;
		}

		public void basic(String msg) {
			System.out.println(msg);
		}

		public void info(Class<?> clazz, String msg) {
			this.getLogger().info(clazz.getSimpleName() + " --> " + msg);
		}

		public void warning(Class<?> clazz, String msg) {
			this.getLogger().warning(clazz.getSimpleName() + " --> " + msg);
		}

		public void error(Class<?> clazz, String msg) {
			this.getLogger().severe(clazz.getSimpleName() + " --> " + msg);
		}
	

}
