package com.ms.assessment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ms.assessment.Entity.Question;

public interface IQuestionRepository extends JpaRepository<Question,Integer> {

	@Query(value = "SELECT * FROM Question WHERE mcq_id = :id ", nativeQuery = true)
	List<Question> findAllById(int id);
}
