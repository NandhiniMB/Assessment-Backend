package com.ms.assessment.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class User_Project {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Project project;
	
	@ManyToOne
	private Course course;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	@Lob
	@Column(length=100000)
	private byte[] file;
	
	@Column
	private int score;
	
	@Column
	private Date submittedOn;

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User_Project [id=" + id + ", user=" + user + ", project=" + project + ", file=" + file + ", score="
				+ score + "]";
	}
	
	
	
}
