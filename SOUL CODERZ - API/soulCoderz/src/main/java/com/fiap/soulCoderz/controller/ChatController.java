package com.fiap.soulCoderz.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {
	
	/*O controle dos chats será feito a partir da API OpenAI. A classe ChatController serve como intermédio entre Front-End
	 * e a OpenAI*/
	
	@PostMapping
	@Transactional
	public String postar(@RequestBody String json) {
		return json;
	}
	
	@GetMapping
	public String get(@RequestBody String json) {
		return json;
	}
	
}
