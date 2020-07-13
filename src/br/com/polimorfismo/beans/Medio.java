package br.com.polimorfismo.beans;

public class Medio extends Formacao {

	private String tipo;

	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public String getAll() {
		return
				"Descrição: " + super.getDescricao() + "\n" +
				"Período: " + super.getPeriodo() + "\n" +
				"Mensalidade: " + super.getMensalidade() + "\n" +
				"Duração: " + super.getDuracao() + "\n" +
				"Tipo: " + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(
				getDuracao() * fator * 500
				);
	}	
}
