package com.ms.assessment.RequestBody;

import java.util.List;

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;

public class McqQuestionWrap {

	
	private  List<Question> questions;
	
	private MCQ mcq;

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public MCQ getMcq() {
		return mcq;
	}

	public void setMcq(MCQ mcq) {
		this.mcq = mcq;
	}

	@Override
	public String toString() {
		return "McqQuestionWrap [questions=" + questions + ", mcq=" + mcq + "]";
	}

	public McqQuestionWrap(List<Question> questions, MCQ mcq) {
		super();
		this.questions = questions;
		this.mcq = mcq;
	}
	
	
	
	
}
