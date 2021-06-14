package com.ms.assessment.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity	
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private MCQ mcq;
	
	@Column
	private String question;
	
	@Column
	private String option1;
	
	@Column
	private String option2;
	
	@Column
	private String answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MCQ getMcq() {
		return mcq;
	}

	public void setMcq(MCQ mcq) {
		this.mcq = mcq;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", mcq=" + mcq + ", question=" + question + ", option1=" + option1 + ", option2="
				+ option2 + ", answer=" + answer + "]";
	}
	
	
}
