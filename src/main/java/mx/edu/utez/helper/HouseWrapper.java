package mx.edu.utez.helper;

import lombok.Data;
import mx.edu.utez.entity.Address;
import mx.edu.utez.entity.House;

@Data
public class HouseWrapper {

	private Address address;
	private House house;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
		
}
