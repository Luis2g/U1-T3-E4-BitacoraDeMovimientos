package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.Address;
import mx.edu.utez.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> getAll(){
		return addressRepository.findAll();
	}
	
	public Address getOne(long id) {
		return addressRepository.findById(id).get();
	}
	
	public Address saveOrUpdate(Address address) {
		return addressRepository.save(address);
	}
	
	public void remove(long id) {
		addressRepository.deleteById(id);
	}
	public void updateUserAction(String username) {
		addressRepository.AddressUpdateActionUser(username);
	}
	
}
