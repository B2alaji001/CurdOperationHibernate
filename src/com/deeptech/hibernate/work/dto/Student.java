package com.deeptech.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Student {
	
	@Id
	@Column(name="s_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="s_rollnumber")
	private String studentname;
	@Column(name="s_Studentname")
	private int rollnumber;
	@Column(name="s_course")
	private String course;   // class Entites
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
