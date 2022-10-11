package com.bilgeadam.boost.week08.lesson002.airport;

	import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


	public class AirportManager {

		

//	   public AirportManager() {
//	        super();
//	    }
//
//
	   public static void main(String[] args) {
	        AirportManager airport = new AirportManager();
	        airport.menu();
	        ApplicationLogger.INSTANCE.basic("Havaalanýmýzý ziyaret ettiðinz için teþekkür ederiz");
	        System.exit(0);
	    }


	   private void menu() {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("==========================");
	            System.out.println(" Havaalaný Yönetim Sistemi");
	            System.out.println("==========================");
	            while (true) {
	                System.out.println(" (1) - Araç Bilgilerini içe aktar");
	                System.out.println(" (2) - Araç Bilgilerini listele");
	                System.out.println(" (3) - Simulasyona baþla");
	                System.out.println("(99) - Programý sonlandýr");
	                System.out.print("Lütfen seçiminiz yapýnýz: ");
	                int selection = sc.nextInt();
	                sc.nextLine(); // string harici scanner okumalarda satýr sonunu okumak için
	                System.out.println();
	                boolean exit = false;
	                switch (selection) {
	                case 1:
	                    this.importVehicles();
	                    break;
	                case 2:
	                    this.listVehicles();
	                    break;
	                case 3:
	                    this.simulate();
	                    break;
	                case 99:
	                    exit = true;
	                    break;
	                default:
	                    ApplicationLogger.INSTANCE.warning(this.getClass(), "Hatalý seçim. Lütfen tekrarlayýnýz!");
	                    continue;
	                }
	                if (exit) {
	                    break;
	                }
	            }
	        }
	    }


	   private void importVehicles() {
	        try {
	            VehicleDataImport.read();
	        }
	        catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException
	                | IllegalArgumentException | InvocationTargetException ex) {
	            ApplicationLogger.INSTANCE.error(getClass(), "Error whlie parsing data --> " + ex.getMessage());
	            System.exit(500);
	        }
	    }


	   private void listVehicles() {
	        ApplicationLogger.INSTANCE.info(this.getClass(), "List vehicles entered");


	       if (Commons.getInstance().getVehicles().isEmpty()) {
	            System.out.println("Kayýtlý bir araç bulunamadý. \nLütfen önce araçlarý içe aktarýnýz.");
	        }
	        else {
//	            Iterator<Vehicle> vehicles = Commons.getInstance().getVehicles().iterator();
//	            while (vehicles.hasNext()) {
//	                System.out.println(vehicles.next().toString());
//	            } aþaðýdaki satýr ile ayný iþlevsellik
	            Commons.getInstance().getVehicles().stream().forEach(vehicle -> System.out.println(vehicle.toString()));
	        }
	        ApplicationLogger.INSTANCE.info(this.getClass(), "List vehicles ended");
	    }


	   private void simulate() {
	        ApplicationLogger.INSTANCE.info(this.getClass(), "Simulate entered");
	        Airport           airport  = new Airport("Istanbul");


//	        Iterator<Vehicle> vehicles = Commons.getInstance().getVehicles().iterator();
//	        while (vehicles.hasNext()) {
//	            Vehicle vehicle = vehicles.next();
//	            if (vehicle instanceof Airplane) {
//	                vehicle.setAirport(airport);
//	                vehicle.start();
//	            }
//	        }
	        
	        List<Airplane> airplanes = Commons.getInstance().getVehicles().stream()
	                                    .filter(vehicle -> vehicle instanceof Airplane)
	                                    .map(vehicle -> (Airplane)vehicle)
	                                    .collect(Collectors.toList());
	        airplanes.forEach(airplane -> {airplane.setAirport(airport); airplane.start();});


	       ApplicationLogger.INSTANCE.info(this.getClass(), "Simulate ended");
	    
	}
}
