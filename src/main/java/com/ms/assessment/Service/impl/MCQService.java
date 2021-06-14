package com.ms.assessment.Service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;
import com.ms.assessment.Repository.IMCQRepository;
import com.ms.assessment.Repository.IQuestionRepository;
import com.ms.assessment.Service.IMCQService;

@Service
public class MCQService implements IMCQService{

	@Autowired
	IMCQRepository mcqRepository;
	
	@Autowired
	IQuestionRepository questionRepository;
	
	@Override
	public MCQ saveMCQ(MCQ mcq) {
		// TODO Auto-generated method stub
		MCQ obj = new MCQ();
		obj.setName(mcq.getName());
		obj.setCreator(mcq.getCreator());
		obj.setCourse(mcq.getCourse());
		obj.setCreatedOn(new Date(System.currentTimeMillis()));
		return mcqRepository.save(obj);
				
	}

	@Override
	public List<MCQ> getMCQ() {
		// TODO Auto-generated method stub
		return mcqRepository.findAll();
	}

	@Override
	public List<Question> findQuestions(int id) {
		// TODO Auto-generated method stub
		return questionRepository.findAllById(id);
	}

	@Override
	public void deleteMCQ(int id) {
		// TODO Auto-generated method stub
		 mcqRepository.deleteById(id);
	}

}
