package sba;

public class Car {
	private String model;
	private int manufactureYear;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	public Car(String model, int manufactureYear) {
		super();
		this.model = model;
		this.manufactureYear = manufactureYear;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", manufactureYear=" + manufactureYear + "]";
	}
	
	
	public void DispCarDetails() {
		System.out.println("Car [model=" + model + ", manufactureYear=" + manufactureYear + "]");
	}
}

/*public class SortByModel implements Comparator<Car> 
{ 
    public int compare(Car a, Car b) 
    { 
        return a.getModel().compareTo(b.getModel()); 
    } 
} 
  


public class SortByManufactureYear implements Comparator<Car> 
{ 
    public int compare(Car a, Car b) 
    { 
        return a.getManufactureYear() - b.getManufactureYear(); 
    } 
}*/