package br.com.motorize.consumer_estoque.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.motorize.consumer_estoque.dtos.MenssagemDTO2;

@FeignClient(name="ba4eda43-de0c-3a25-b93c-1ec734b78f91", url="localhost:8000" )
public interface ConsumerClient {

	@GetMapping("/menssagem")
	MenssagemDTO2 getConsumerMessage();
}
