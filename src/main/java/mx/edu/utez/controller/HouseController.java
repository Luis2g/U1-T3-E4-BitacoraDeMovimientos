package mx.edu.utez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.entity.Address;
import mx.edu.utez.entity.House;
import mx.edu.utez.helper.HouseWrapper;
import mx.edu.utez.service.AddressService;
import mx.edu.utez.service.HouseService;

@RestController
@RequestMapping("/databaseLog")
public class HouseController {

	@Autowired
	private HouseService houseService;
	
	@GetMapping("/houses")
	public List<House> list() {
		return houseService.getAll();
	}
	
	@GetMapping("/houses/{id}")
	public House edit(@PathVariable("id") long id) {
		return houseService.getOne(id);
	}
	
	@PostMapping("/houses/{username}")
	public House save(@PathVariable("username") String username, @RequestBody HouseWrapper houseWrapper) {
		
		return houseService.saveOrUpdate(houseWrapper, username);
		
	}
	
//	@PostMapping("/housesA")
//	public House saveA(@RequestBody House house) {
//		return houseService.saveOrUpdate(house);
//	}
	
	@PutMapping("/houses/{username}")
	public House udpate(@PathVariable("username") String username, @RequestBody HouseWrapper houseWrapper) {
		return houseService.saveOrUpdate(houseWrapper, username);
	}
	
	
	@DeleteMapping("/houses/{username}")
	public void delete(@PathVariable("username") String username, @RequestBody House house) {
		
		houseService.remove(house, username);
		
	}
	
//	@DeleteMapping("/houses/{id}")
//	public void delete(@PathVariable("id") long id) {
//		houseService.remove(id);
//	}
}
