package sba;

import java.util.List;

public class Showroom {
	private String showroomName;
	private int showroomID;
	
	List<Car>cars;

	public String getShowroomName() {
		return showroomName;
	}

	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}

	public int getShowroomID() {
		return showroomID;
	}

	public void setShowroomID(int showroomID) {
		this.showroomID = showroomID;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Showroom(String showroomName, int showroomID, List<Car> cars) {
		super();
		this.showroomName = showroomName;
		this.showroomID = showroomID;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Showroom [showroomName=" + showroomName + ", showroomID=" + showroomID + ", cars=" + cars + "]";
	}
	
	public Showroom() {}
}
