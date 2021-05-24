package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("studentDetails")
public class StudentController {
	@Autowired StudentService studentService;
	
	@PostMapping("/create")
	public StudentEntity createStudent(@RequestBody StudentDTO studentDto) {
		return studentService.createStudent(studentDto);
	}
	
	@GetMapping("/getById/{id}")
	public StudentEntity getStudentByID(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAll")
	public List<StudentEntity> getAllStudentDetails() {
		return studentService.getAllStudentDetails();
	}

}
