package ru.kechemasov.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kechemasov.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}