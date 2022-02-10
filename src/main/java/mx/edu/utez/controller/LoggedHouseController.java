package mx.edu.utez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.entity.LoggedHouse;
import mx.edu.utez.service.LoggedHouseService;

@RestController
@RequestMapping("/databaseLog")
public class LoggedHouseController {

	@Autowired
	private LoggedHouseService loggedHouseService;
	
	@GetMapping("/loggedHouses")
	public List<LoggedHouse> list () {
		return loggedHouseService.getAll();
	}

}
