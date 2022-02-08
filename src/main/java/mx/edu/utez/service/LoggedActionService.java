package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.LoggedHouse;
import mx.edu.utez.repository.LoggedActionRepository;

@Service
public class LoggedActionService {

	@Autowired
	private LoggedActionRepository loggedActionRepository;
	
	public List<LoggedHouse> getAll(){
		return loggedActionRepository.findAll();
	}
		
}
