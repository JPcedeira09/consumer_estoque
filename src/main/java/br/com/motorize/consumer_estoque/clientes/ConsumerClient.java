package br.com.motorize.consumer_estoque.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.motorize.consumer_estoque.dtos.MenssagemDTO2;

@FeignClient(name="d62c8cf6-80cc-3486-afb6-6c305f35f436", url="http://localhost:8000")
//@RibbonClient("provider_resource")
public interface ConsumerClient {

	@GetMapping("/menssagem")
	MenssagemDTO2 getConsumerMessage();
	
}