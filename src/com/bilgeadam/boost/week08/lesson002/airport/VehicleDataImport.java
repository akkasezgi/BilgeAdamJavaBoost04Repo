package com.bilgeadam.boost.week08.lesson002.airport;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.lang.reflect.InvocationTargetException;


	public class VehicleDataImport {
		private static final String            DATA_FILE_NAME = "C:\\Users\\babur.somer\\OneDrive - BilgeAdam\\Documents\\BA - Academy\\THY\\vehicle-list.csv";
		private static final ApplicationLogger logger         = ApplicationLogger.INSTANCE;

		public static void read() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			logger.info(VehicleDataImport.class, "Importing vehicles");

			try (BufferedReader br = new BufferedReader(new FileReader(VehicleDataImport.DATA_FILE_NAME))) {
				String line = br.readLine(); // first line contains header data and is ignored.
				while ((line = br.readLine()) != null) {
					VehicleFactory.create(line);
				}
			}
			catch (FileNotFoundException ex) {
				logger.error(VehicleDataImport.class, DATA_FILE_NAME + " --> " + ex.getMessage());
				System.exit(100);
			}
			catch (IOException ex) {
				logger.error(VehicleDataImport.class, DATA_FILE_NAME + " --> " + ex.getMessage());
				System.exit(100);
			}
			logger.info(VehicleDataImport.class, "Importing vehicles ended");
		}
	

}
