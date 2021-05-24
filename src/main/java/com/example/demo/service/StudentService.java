package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired StudentRepo studentRepo;
	
	public StudentEntity createStudent(StudentDTO studentDto) {
		StudentEntity entity = new StudentEntity();
		entity.setStudentName(studentDto.getStudentName());
		entity.setStudentAge(studentDto.getStudentAge());
		entity.setStudentEmail(studentDto.getStudentEmail());
		entity.setStudentMobileNo(studentDto.getStudentMobileNo());
		return studentRepo.save(entity);
	}
	
	public StudentEntity getStudentById(Long id) {
		return studentRepo.findById(id).orElseThrow(null);
		
	}
	
	public List<StudentEntity> getAllStudentDetails() {
		return studentRepo.findAll();
		
	}

}
