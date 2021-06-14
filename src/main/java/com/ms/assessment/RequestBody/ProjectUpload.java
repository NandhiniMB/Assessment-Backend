package com.ms.assessment.RequestBody;

import java.util.Date;

import com.ms.assessment.Entity.Course;
import com.ms.assessment.Entity.Project;
import com.ms.assessment.Entity.User;

public class ProjectUpload {

	
	
	private int id;
	

	private User user;
	

	private Project project;
	
	
	private Course course;

	
	private int score;
	
	
	private Date submittedOn;


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


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public Date getSubmittedOn() {
		return submittedOn;
	}


	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}
	
	
	
}
