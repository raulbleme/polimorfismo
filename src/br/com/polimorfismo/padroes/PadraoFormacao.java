package br.com.polimorfismo.padroes;

import br.com.polimorfismo.beans.Formacao;

public interface PadraoFormacao {

	void calcularMensalidade(double fator);
	void cadastrar(Formacao formacao);
}
