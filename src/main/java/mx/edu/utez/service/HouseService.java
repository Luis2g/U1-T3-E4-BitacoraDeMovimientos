package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.Address;
import mx.edu.utez.entity.House;
import mx.edu.utez.helper.HouseWrapper;
import mx.edu.utez.repository.AddressRepository;
import mx.edu.utez.repository.HouseRepository;

@Service
public class HouseService {

	@Autowired
	private HouseRepository houseRepository;
	@Autowired
	private AddressService addressService;
	@Autowired 
	
	public List<House> getAll() {
		return houseRepository.findAll();
	}
	
	public House getOne(long id) {
		return houseRepository.findById(id).get();
	}
	
	public House saveOrUpdate(HouseWrapper houseWrapper, String username) {
		Address address = houseWrapper.getAddress();
		House house = houseWrapper.getHouse();
		
		house.setAddress(addressService.saveOrUpdate(address));
		
		house = houseRepository.save(house);
				
		addressService.updateUserAction(username);
		
		houseRepository.UpdateHouseActionUser(username);
		
		return house;
	}
	
	public void remove(House house, String username) {
		houseRepository.deleteById(house.getId());
		addressService.remove(house.getAddress().getId());
		
		// Updating tables with the username who did the actions
		addressService.updateUserAction(username);
		houseRepository.UpdateHouseActionUser(username);
	}
	
	
}
