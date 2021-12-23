package com.assignment2.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.assignment2.student.entity.Project;
import com.assignment2.student.entity.Student;
import com.assignment2.student.service.StudentService;

@SpringBootTest
class SpringBootStudentApiApplicationTests {
	
	@Autowired
	StudentService studentService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void addStudentTest() throws ParseException {
		
		Student student = new Student();
		student.setFirstName("Gurpreet112");
		student.setLastName("Singh");
		student.setMobileNo("7658923439");
		student.setEmail("asdf@sg.aaa");
		student.setProject(Arrays.asList(new Project("projectName1", 12, student),
									  new Project("ProjectName2", 21, student))
						);
		assertEquals(HttpStatus.OK, studentService.addStudent(null));
	}
	
	@Test
	void getAllStudentsTest() throws ParseException {
		String userType = "admin";
		assertEquals(HttpStatus.OK, studentService.getAllStudents());
	}
	
	@Test
	void getStudentByIdTest() throws ParseException {
		String userType = "admin";
		Long studentId = 1L;
		assertEquals(HttpStatus.OK, studentService.getStudentById(studentId));
	}

}
