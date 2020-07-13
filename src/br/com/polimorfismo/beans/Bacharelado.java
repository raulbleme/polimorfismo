package br.com.polimorfismo.beans;

public class Bacharelado extends Formacao {

	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado() {
		super();
	}
	
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public String getAll() {
		return
				"Descri��o: " + super.getDescricao() + "\n" +
				"Per�odo: " + super.getPeriodo() + "\n" +
				"Mensalidade: " + super.getMensalidade() + "\n" +
				"Dura��o: " + super.getDuracao() + "\n" +
				"Projeto de Conclus�o: " + projetoConclusao + "\n" +
				"Carga Hor�ria de Est�gio: " + cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorarioEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorarioEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public void calcularMensalidade(double fator) {
		super.setMensalidade(
				(getDuracao() * fator * 600) + (cargaHorariaEstagio * 12)
				);
	}
}
