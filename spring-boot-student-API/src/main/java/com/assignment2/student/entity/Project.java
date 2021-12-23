package com.assignment2.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PROJECT")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID")
	private long projectId;
	
	@Column(name = "PROJECT_NAME")
	//@Pattern(regexp = "^[a-zA-Z][a-zA-Z ]{0,48}[a-zA-Z]$",message = "{project.projectName.errMessage}")
	private String projectName;
	
	@Column(name = "PROJECT_DURATION")
	//@Pattern(regexp = "^[1-9][0-9]{0,2}$",message = "{project.projectDuration.errMessage}")
	private int projectDuration;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	@JsonIgnore
	private Student student;
	

	public Project() {
		super();
	}
	
	public Project(String projectName, int projectDuration, Student student) {
		super();
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.student = student;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(int projectDuration) {
		this.projectDuration = projectDuration;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
