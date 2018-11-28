package br.com.motorize.consumer_estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.motorize.consumer_estoque.clientes.ConsumerClient;
import br.com.motorize.consumer_estoque.dtos.MenssagemDTO2;

@Service
public class MenssagemService {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ConsumerClient client;
	
	public MenssagemDTO2 getMenssagem() {
		MenssagemDTO2 dto2 = client.getConsumerMessage();
		String message = dto2.getMenssagem() + "Ja conquistamos essa merda";
		return new MenssagemDTO2(message,Integer.valueOf(environment.getProperty("local.server.port")),dto2.getProvider_port());
	}
}
