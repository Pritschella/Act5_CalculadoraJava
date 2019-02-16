
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calculos{
	
	public double sumar(double n1, double n2) {
		return n1 + n2;
	}
	
	public double restar(double n1, double n2 ) {
		return n1 - n2;
	}
	
	public double multiplicar(double n1, double n2 ) {
		return n1 * n2;
	}
	
	public double dividir(double n1, double n2 ) {
		return n1 / n2;
	}
	
	public double residuo(double n1, double n2 ) {
		return n1 % n2;
	}
	
	public double raiz(double n1, double n2 ) {
		return (Math.sqrt(n1));
	}
	
	public double potencia(double n1) {
		return (Math.pow(n1, 2));
	}
	
	public double fraccion(double n1 ) {
		return (1 / n1);
	}
	
	
}//ClassCalculos

class Calculadora extends JFrame implements ActionListener{

	JTextField entrada, lectura;
	JButton residuo, raiz, potencia, fracción, ce, c, borrar, division, siete, ocho, nueve, multipliacion;
	JButton cuatro, cinco, seis, resta, uno, dos, tres, suma, masMenos, cero, punto, igual;
	String boton = "";
	
	public  Calculadora() {
		setTitle("Calculadora");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel estandar =  new JLabel("ESTÁNDAR");
		estandar.setFont(new Font("Arial", Font.BOLD, 14));
		estandar.setBounds(5, 5, 100, 10);
		panel.add(estandar);
		
		lectura = new JTextField(10);
		lectura.setEditable(false);
		entrada.setBounds(10, 50, 360, 60);
		panel.add(entrada);
		
		JButton mc = new JButton("MC");
		mc.setBounds(10, 120, 60, 30);
		mc.setToolTipText("Borrar");
		mc.setOpaque(false);
		mc.setContentAreaFilled(false);
		mc.setBorderPainted(false);
		panel.add(mc);
		
		JButton mm = new JButton("M+");
		mm.setBounds(130, 120, 60, 30);
		mm.setToolTipText("Sumar en memoria");
		mm.setOpaque(false);
		mm.setContentAreaFilled(false);
		mm.setBorderPainted(false);
		panel.add(mm);
		
		JButton m3 = new JButton("M-");
		m3.setBounds(190, 120, 60, 30);
		m3.setToolTipText("Restar en memoria");
		
		pack();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}//ClassCalculadora

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

SwingUtilities.invokeLater(new Runnable() {

			

			@Override

			public void run() {

				new Calculadora();

				

			}

		});
		
	}

}
