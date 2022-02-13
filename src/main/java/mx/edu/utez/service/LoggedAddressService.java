package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.LoggedAddress;
import mx.edu.utez.repository.LoggedAddressRepository;

@Service
public class LoggedAddressService {

	@Autowired
	private LoggedAddressRepository loggedAddressRepository;
	
	public List<LoggedAddress> getAll(){
		return loggedAddressRepository.findAll();
	}
	
	
}
