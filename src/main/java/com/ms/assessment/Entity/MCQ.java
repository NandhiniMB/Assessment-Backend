package com.ms.assessment.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mcq")
public class MCQ {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	
	@ManyToOne
	private User creator;
	
	@ManyToOne
	private Course course;
	
//	@ManyToMany
//	private List<User> participants;
	
	@JsonIgnore
	@OneToMany(mappedBy="mcq",cascade=CascadeType.ALL)
	private List<User_Mcq> userMcqList;
	
	@JsonIgnore
	@OneToMany(mappedBy="mcq",cascade=CascadeType.ALL)
	private List<Question> questions;
	
	public List<User_Mcq> getUserMcqList() {
		return userMcqList;
	}

	

	@Column
	private Date createdOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public void setUserMcqList(List<User_Mcq> userMcqList) {
		this.userMcqList = userMcqList;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "MCQ [id=" + id + ", name=" + name + ", creator=" + creator + ", course=" + course + ", userMcqList="
				+ userMcqList + ", createdOn=" + createdOn + "]";
	}
	
}

