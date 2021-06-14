package com.ms.assessment.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class User_Mcq {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	@ManyToOne
	@JoinColumn(name="mcq_id")
	private MCQ mcq;
	
	@Column
	private int score;
	
	@Column
	private Date attemptedOn;

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

	public MCQ getMcq() {
		return mcq;
	}

	public void setMcq(MCQ mcq) {
		this.mcq = mcq;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getAttemptedOn() {
		return attemptedOn;
	}

	public void setAttemptedOn(Date attemptedOn) {
		this.attemptedOn = attemptedOn;
	}

	@Override
	public String toString() {
		return "User_Mcq [id=" + id + ", user=" + user + ", mcq=" + mcq + ", score=" + score + ", attemptedOn="
				+ attemptedOn + "]";
	}
	
	
	
	
}
