package br.com.polimorfismo.beans;

import br.com.polimorfismo.padroes.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{

	private boolean planoEstendido;
	
	public Tecnologo() {
		super();
	}
	
	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	public String getAll() {
		return
				"Descrição: " + super.getDescricao() + "\n" +
				"Período: " + super.getPeriodo() + "\n" +
				"Mensalidade: " + super.getMensalidade() + "\n" +
				"Duração: " + super.getDuracao() + "\n" +
				"Plano extendido?: " + planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(
				getDuracao() * fator * 600
				);
	}

	@Override
	public void cadastrar(Formacao formacao) {
		// TODO Auto-generated method stub
		
	}
	
}
