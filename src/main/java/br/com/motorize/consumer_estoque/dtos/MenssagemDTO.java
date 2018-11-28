package br.com.motorize.consumer_estoque.dtos;

public class MenssagemDTO {

	public MenssagemDTO(String menssagem, int provider_port) {
		super();
		this.menssagem = menssagem;
		this.provider_port = provider_port;
	}
	public MenssagemDTO() {
	}

	private String menssagem;
	private int provider_port;
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
}
