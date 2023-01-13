package com.my.hr.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laborer {
	private int laborerId;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate hireDate;
}
