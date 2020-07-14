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
		char decisao = CaixaDialogo.t("Qual forma��o deseja cadastrar? (Medio/Tecnico/Bacharelado)").toUpperCase().charAt(0);
		do {
			if(decisao == 'M') {			
				formacao = new Medio(
						CaixaDialogo.t("Descri��o:"),
						CaixaDialogo.i("Per�odo:"),
						0,
						0,
						CaixaDialogo.t("Regular ou T�cnico?")
						);
			}
			else if(decisao == 'T') {
				formacao = new Tecnologo(
						CaixaDialogo.t("Descri��o:"),
						CaixaDialogo.i("Per�odo:"),
						0,
						0,
						CaixaDialogo.b("Plano Estendido?")
						);
			}
			else if(decisao == 'B') {
				formacao = new Bacharelado(
						CaixaDialogo.t("Descri��o:"),
						CaixaDialogo.i("Per�odo:"),
						0,
						0,
						CaixaDialogo.t("Projeto de Conclus�o:"),
						CaixaDialogo.i("Carga Hor�ria de Est�gio:")
						);
			}
			else {
				JOptionPane.showMessageDialog(null, "Opera��o Inexistente!");
			}
			
			formacao.definirDuracao();
			formacao.calcularMensalidade(CaixaDialogo.f("Digite o fator:"));
			System.out.println(formacao.getAll());
			System.out.println("-------------------------------");
			
		} while((JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Aten��o!", JOptionPane.YES_NO_CANCEL_OPTION) == 0));
	}

}
