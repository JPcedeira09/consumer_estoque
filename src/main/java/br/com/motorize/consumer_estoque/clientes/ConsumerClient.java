package br.com.motorize.consumer_estoque.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.motorize.consumer_estoque.dtos.MenssagemDTO2;

@FeignClient(name="a72cc26f-6ec2-3190-8a85-f19c8aeff06e", url="http://localhost:8000")
//@RibbonClient("provider_resource")
public interface ConsumerClient {

	@GetMapping("/menssagem")
	MenssagemDTO2 getConsumerMessage();
}
