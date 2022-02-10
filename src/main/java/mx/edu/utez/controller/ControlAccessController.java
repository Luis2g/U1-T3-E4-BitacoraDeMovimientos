package mx.edu.utez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.entity.ControlAccess;
import mx.edu.utez.service.ControlAccessService;

@RestController
@RequestMapping("/databaseLog")
public class ControlAccessController {
	
	@Autowired
	private ControlAccessService controlAccessService;
	
	
	@GetMapping("/controlAcesses")
	public List<ControlAccess> list() {
		return controlAccessService.getAll();
	}

}
