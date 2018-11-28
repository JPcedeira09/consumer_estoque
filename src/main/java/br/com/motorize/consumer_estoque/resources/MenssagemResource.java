package br.com.motorize.consumer_estoque.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.motorize.consumer_estoque.dtos.MenssagemDTO2;
import br.com.motorize.consumer_estoque.services.MenssagemService;

@RestController
public class MenssagemResource {

	@Autowired
	private MenssagemService service;

	@GetMapping("/menssagem")
	public MenssagemDTO2 getMenssagem() {
		return service.getMenssagem();
	}
}
