package mx.edu.utez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.entity.LoggedHouse;
import mx.edu.utez.service.LoggedActionService;

@RestController
@RequestMapping("/databaseLog")
public class LoggedActionController {

	@Autowired
	private LoggedActionService loggedActionService;
	
	@GetMapping("/loggedActions")
	public List<LoggedHouse> list(){
		return loggedActionService.getAll();
	}
	
	
}
