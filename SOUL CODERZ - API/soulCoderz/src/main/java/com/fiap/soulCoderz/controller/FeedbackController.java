package com.fiap.soulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fiap.soulCoderz.dto.feedback.DadosCadastroFeedback;
import com.fiap.soulCoderz.dto.feedback.DadosListagemFeedback;
import com.fiap.soulCoderz.entity.Feedback;
import com.fiap.soulCoderz.repository.FeedbackRepository;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository repository;
	
	@PostMapping
	@Transactional
	public void postar(DadosCadastroFeedback dados) {
		Feedback feedback = new Feedback(dados);
		repository.save(feedback);
	}
	
	@GetMapping
	public Page<DadosListagemFeedback> listar(@PageableDefault(sort= {"tipoFeedback"}) Pageable paginacao){
		return repository.findAllByAtivoFeedbackTrue(paginacao).map(DadosListagemFeedback ::new);
	}
	
}
