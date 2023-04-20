package ru.kechemasov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kechemasov.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}