package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.LoggedHouse;
import mx.edu.utez.repository.LoggedHouseRepository;

@Service
public class LoggedHouseService {

	@Autowired
	private LoggedHouseRepository loggedHouseRepository;
	
	public List<LoggedHouse> getAll() {
		return loggedHouseRepository.findAll();
	}
	
}
