package br.com.polimorfismo.implementacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.CaixaDialogo;

public class TesteFormacao {

	public static void main(String[] args) {
		
		//Formacao obj = new Formacao();
		//System.out.println(obj.exibirMedia(10, 5));
		//System.out.println(obj.exibirMedia(10, 5, 7, 3));
		//System.out.println(obj.exibirMedia(10, 7, 10, 7, 10, 7));
		
		Formacao formacao = null;
		char decisao = CaixaDialogo.t("Qual formação deseja cadastrar? (Medio/Tecnico/Bacharelado)").toUpperCase().charAt(0);
		do {
			if(decisao == 'M') {			
				formacao = new Medio(
						CaixaDialogo.t("Descrição:"),
						CaixaDialogo.i("Período:"),
						0,
						CaixaDialogo.i("Duração:"),
						CaixaDialogo.t("Tipo:")
						);
			}
			else if(decisao == 'T') {
				formacao = new Tecnologo(
						CaixaDialogo.t("Descrição:"),
						CaixaDialogo.i("Período:"),
						0,
						CaixaDialogo.i("Duração:"),
						true
						);
			}
			else if(decisao == 'B') {
				formacao = new Bacharelado(
						CaixaDialogo.t("Descrição:"),
						CaixaDialogo.i("Período:"),
						0,
						CaixaDialogo.i("Duração:"),
						CaixaDialogo.t("Projeto de Conclusão:"),
						CaixaDialogo.i("Carga Horária:")
						);
			}
			else {
				JOptionPane.showMessageDialog(null, "Operação Inexistente!");
			}
			System.out.println(formacao.getAll());
		} while((JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção!", JOptionPane.YES_NO_CANCEL_OPTION) == 0));
		
	}

}
