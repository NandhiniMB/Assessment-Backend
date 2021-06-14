package com.ms.assessment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ms.assessment.Entity.MCQ;
import com.ms.assessment.Entity.Question;

public interface IMCQRepository extends JpaRepository<MCQ,Integer>{

	

}
