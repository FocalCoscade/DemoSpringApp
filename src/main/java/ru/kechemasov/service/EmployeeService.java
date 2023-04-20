package ru.kechemasov.service;

public interface EmployeeService {
	void add(String name, String surname, Long department_id);
	void deleteById(Long id);
}