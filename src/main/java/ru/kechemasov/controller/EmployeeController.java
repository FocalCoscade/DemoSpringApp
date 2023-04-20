package ru.kechemasov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kechemasov.dto.EmployeeAddDTO;
import ru.kechemasov.dto.EmployeeDeleteDTO;
import ru.kechemasov.service.EmployeeService;

@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody EmployeeAddDTO employeeAddDTO) {
		System.out.println(employeeAddDTO);
		employeeService.add(employeeAddDTO.getName(), employeeAddDTO.getSurname(), employeeAddDTO.getDepartment_id());
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<String> delete(@RequestBody EmployeeDeleteDTO employeeDeleteDTO) {
		System.out.println(employeeDeleteDTO);
		employeeService.deleteById(employeeDeleteDTO.getId());
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
}