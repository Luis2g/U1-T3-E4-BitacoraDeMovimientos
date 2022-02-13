package mx.edu.utez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.entity.LoggedAddress;
import mx.edu.utez.service.LoggedAddressService;

@RestController
@RequestMapping("/databaseLog")
public class LoggedAddressController {

	@Autowired
	private LoggedAddressService loggedAddressService;
	
	@GetMapping("/loggedAddresses")
	public List<LoggedAddress> list () {
		return loggedAddressService.getAll();
	}
	
}
