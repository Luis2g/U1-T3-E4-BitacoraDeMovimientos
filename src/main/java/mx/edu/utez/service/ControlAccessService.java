package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.entity.ControlAccess;
import mx.edu.utez.repository.ControlAccessRepository;

@Service
public class ControlAccessService {

	@Autowired
	private ControlAccessRepository controlAccessRepository;
	
	public List<ControlAccess> getAll () {
		return controlAccessRepository.findAll();
	}
	
}
