package ru.kechemasov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeAddDTO {
	private String name;
	private String surname;
	private Long department_id;
}