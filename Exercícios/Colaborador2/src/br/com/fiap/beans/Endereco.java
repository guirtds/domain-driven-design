package br.com.fiap.beans;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cep;
	
	public Endereco() {
		super();
	}

	public Endereco(String rua, int numero, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	

}
