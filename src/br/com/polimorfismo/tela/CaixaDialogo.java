package br.com.polimorfismo.tela;
import javax.swing.JOptionPane;

public class CaixaDialogo {
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog
	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	//metodo para simplificar a chamada do JOptionPane com showConfirmDialog para casos de boolean
		public static boolean b(String msg) {
			int resp = JOptionPane.showConfirmDialog(null, msg, "Atenção",JOptionPane.YES_NO_OPTION);
			if (resp == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog convertendo para int
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog convertendo para float
	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	
	//metodo para simplificar a chamada do JOptionPane com showInputDialog convertendo para double
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}

}
