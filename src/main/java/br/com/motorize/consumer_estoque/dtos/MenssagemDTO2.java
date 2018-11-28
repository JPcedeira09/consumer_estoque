package br.com.motorize.consumer_estoque.dtos;

public class MenssagemDTO2 {
	public MenssagemDTO2(String menssagem, int provider_port, int envia_port) {
		super();
		this.menssagem = menssagem;
		this.provider_port = provider_port;
		this.envia_port = envia_port;
	} 
	
	public MenssagemDTO2() {
	}

	private String menssagem;
	private int provider_port;
	private int envia_port;

	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	public int getProvider_port() {
		return provider_port;
	}
	public void setProvider_port(int provider_port) {
		this.provider_port = provider_port;
	}
	public int getEnvia_port() {
		return envia_port;
	}
	public void setEnvia_port(int envia_port) {
		this.envia_port = envia_port;
	}

}
