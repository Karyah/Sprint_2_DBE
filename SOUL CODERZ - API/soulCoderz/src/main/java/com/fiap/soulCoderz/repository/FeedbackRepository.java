package com.fiap.soulCoderz.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.soulCoderz.entity.Feedback;


public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	Page<Feedback> findAllByAtivoFeedbackTrue(Pageable paginacao);
}
