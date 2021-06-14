package com.ms.assessment.Service;

import java.util.List;

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;

public interface IMCQService {

	public MCQ saveMCQ(MCQ mcq);
	
	public List<MCQ> getMCQ();

	public List<Question> findQuestions(int id);

	public void deleteMCQ(int id);

}
