package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employere")
@CrossOrigin
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employereService) {
		super();
		this.employerService = employereService;
	}
	
	@GetMapping("/getall")
	DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	Result add(@RequestBody Employer employere,String passwordRepeat) {
		return this.employerService.add(employere,passwordRepeat);
	}
}
