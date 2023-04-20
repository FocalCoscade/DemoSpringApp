package ru.kechemasov.service;

import org.springframework.stereotype.Service;
import ru.kechemasov.model.Department;
import ru.kechemasov.model.Employee;
import ru.kechemasov.repository.DepartmentRepository;
import ru.kechemasov.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	private final DepartmentRepository departmentRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}
	
	@Override
	public void add(String name, String surname, Long department_id) {
		
		Department department = departmentRepository.findById(department_id).orElseThrow();
		
		Employee employee = Employee.builder()
				.name(name)
				.surname(surname)
				.department(department)
				.build();
		
		employeeRepository.save(employee);
	}
	
	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}
}