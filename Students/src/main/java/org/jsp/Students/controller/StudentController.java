package org.jsp.Students.controller;

import org.jsp.Students.dao.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@PostMapping("/students")
	public Student savestudent(@RequestBody Student student) {
		return student;
	}

}
