package br.com.polimorfismo.beans;

//Garante que ela seja instanciada pelas classes filhas e não possa ser instaciada sozinha com Formacao obj = new Formacao();
public abstract class Formacao {

	private String descricao = new String(); //ou private String descricao = "";
	private int periodo;
	private double mensalidade;
	private int duracao;
		
	public Formacao() {
		super();
	}
	
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
				"Descrição: " + descricao + "\n" +
				"Período: " + periodo + "\n" +
				"Mensalidade: " + mensalidade + "\n" +
				"Duração: " + duracao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//método exibirMedia() respeita o POLIMORFISMO. Um método, várias funções.
	// Overload(sobrecarga): Varios métodos com o mesmo nome, mas com construções diferentes, dentro da mesma classe.
	// Override(sobrescrita): Métodos iguais mas em classes diferentes
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1 + ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return ((((ps1 + ps2) * 0.8) + ((nac1 + nac2) * 0.2)) / 2);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return ((((ps1 + ps2) * 0.5) + ((nac1 + nac2) * 0.2) + ((am1 + am2) * 0.3)) / 3); 
	}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;
		}
		else if (this instanceof Tecnologo) {
			duracao = 24;
		}
		else {
			if (descricao.indexOf("ENGENHARIA") == -1) {
				duracao = 48;
			}
			else {
				duracao = 60;
			}
		}
	}
	
	public void calcularMensalidade(double fator) {}
}
