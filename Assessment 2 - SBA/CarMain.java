package sba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarMain {
	Map<String, List<Car>> carstore;
	public void dispCarsByShowroom(String showroomName) {
		List<Car> cars=carstore.get(showroomName);
		for (Car car:cars) {
			System.out.println(car);
		}
	}
		Map<String, List<Car>> carstore2;
		public void dispCarsAfterSorting(String showroomName) {
			List<Car> cars=carstore2.get(showroomName);
			System.out.println("Sorted By Model");
			Collections.sort(cars,new SortByModel());
			for (Car car:cars) {
				System.out.println(car);
			}
			System.out.println("Sorted By Manufactured Year");
			Collections.sort(cars,new SortByManufactureYear());
			for (Car car:cars) {
				System.out.println(car);
			}
		}
			
		Map<String, List<Car>> carstore3;
		public void dispCarsBySNameAfterSorting(String showroomName) {
			List<Car> cars=carstore3.get(showroomName);
			System.out.println("Showroomwise and Sorted By Model");
			Collections.sort(cars,new SortByModel());
			for (Car car:cars) {
				car.DispCarDetails();
			}
			System.out.println("Showroomwise and Sorted By Manufactured Year");
			Collections.sort(cars,new SortByManufactureYear());
			for (Car car:cars) {
				car.DispCarDetails();;
			}
		}
	
	
	public static void main(String[] args) {
		Car car1= new Car("Phantom", 2015);
		Car car2= new Car("Ghost", 2017);
		Car car3= new Car("Cullinan", 2020);
		List<Car> cars=new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		Showroom showroom=new Showroom("RollsRoyceChennai", 101, cars);
		
		Car car4= new Car("Q8", 2015);
		Car car5= new Car("RS8", 2016);
		Car car6= new Car("A7", 2019);
		List<Car> cars2=new ArrayList<Car>();
		cars2.add(car4);
		cars2.add(car5);
		cars2.add(car6);
		Showroom showroom2=new Showroom("AudiChennai", 102, cars2);
		
		CarMain cm=new CarMain();
		cm.carstore=new HashMap<String, List<Car>>();
		cm.carstore.put(showroom.getShowroomName(), showroom.getCars());
		cm.carstore.put(showroom2.getShowroomName(), showroom2.getCars());
		
		cm.carstore2=new HashMap<String, List<Car>>();
		cm.carstore2.put(showroom.getShowroomName(), showroom.getCars());
		cm.carstore2.put(showroom2.getShowroomName(), showroom2.getCars());
		
		cm.carstore3=new HashMap<String, List<Car>>();
		cm.carstore3.put(showroom.getShowroomName(), showroom.getCars());
		cm.carstore3.put(showroom2.getShowroomName(), showroom2.getCars());
		
		cm.dispCarsByShowroom("AudiChennai");
		cm.dispCarsAfterSorting("AudiChennai");
		cm.dispCarsBySNameAfterSorting("AudiChennai");
		

	}
	
}
