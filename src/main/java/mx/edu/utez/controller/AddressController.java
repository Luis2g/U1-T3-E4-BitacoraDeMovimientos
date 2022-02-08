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
import mx.edu.utez.service.AddressService;

@RestController
@RequestMapping("/databaseLog")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/addresses")
	public List<Address> list() {
		return addressService.getAll();
	}
	
	@GetMapping("/addresses/{id}")
	public Address edit(long id) {
		return addressService.getOne(id);
	}
	
	@PostMapping("/addresses/{username}")
	public Address save(@PathVariable("username") String username, @RequestBody Address address) {
		return addressService.saveOrUpdate(address);
	}
	
	@PutMapping("/addresses")
	public Address update(@RequestBody Address address) {
		return addressService.saveOrUpdate(address);
	}
	
	@DeleteMapping("/addresses/{id}")
	public void delete(@PathVariable("id") long id) {
		addressService.remove(id);
	}

}
