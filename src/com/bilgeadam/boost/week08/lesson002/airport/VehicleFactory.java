package com.bilgeadam.boost.week08.lesson002.airport;




	import java.lang.reflect.InvocationTargetException;
	import java.lang.reflect.Method;


	public class VehicleFactory {
		private static final String BASE_PACKAGE = "com.bilgeadam.thy.course02.airport.model.vehicle";

		@SuppressWarnings("rawtypes")
		public static void create(String line) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
				IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			ApplicationLogger.INSTANCE.info(VehicleFactory.class, "Creating vehicle started");
			Class   clazz   = null;
			if (line.toUpperCase().startsWith("AIRPLANE")) {
				clazz = Class.forName(BASE_PACKAGE + ".Airplane");
			}
			else if (line.toUpperCase().startsWith("FIRECAR")) {
				clazz = Class.forName(BASE_PACKAGE + ".FireCar");
			}
			else if (line.toUpperCase().startsWith("SERVICECAR")) {
				clazz = Class.forName(BASE_PACKAGE + ".ServiceCar");
			}
			else if (line.toUpperCase().startsWith("CATERING")) {
				clazz = Class.forName(BASE_PACKAGE + ".CateringCar");
			}
			else {
				ApplicationLogger.INSTANCE.info(VehicleFactory.class, "Unrecognized vehicle type");
			}
			if (clazz != null) {
				@SuppressWarnings("unchecked")
				Method parseMethod = clazz.getMethod("parse", String.class);
				parseMethod.invoke(null, line);
			}
			ApplicationLogger.INSTANCE.info(VehicleFactory.class, "Creating vehicle ended");
		}
	

}
