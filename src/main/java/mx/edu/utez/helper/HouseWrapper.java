package mx.edu.utez.helper;

import lombok.Data;
import mx.edu.utez.entity.Address;
import mx.edu.utez.entity.House;

@Data
public class HouseWrapper {

	private Address address;
	private House house;
	
	
}
