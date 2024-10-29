package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(max = 50)
	@Column(length = 50)
	private String name;
	
	@NotEmpty
	@Size(max = 50)
	@Column(length = 100)
	private String address;
	
	@Positive
	@Max(20000)
	private Double salary;
	public Employee(String name, String address, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
}
