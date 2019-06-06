import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

class Operaciones{
	
	public double sumar(double n1, double n2) {
		return n1+n2;
	}
	
	public double restar (double n1, double n2) {
		return n1-n2;
	}
	
	public double multiplicar (double n1, double n2) {
		return n1*n2;
	}
	
	public double dividir (double n1, double n2) {
		return n1/n2;
	}
	public double residuo(double n1, double n2) {
		return n1%n2;
	}
	public double raiz(double n1) {
		return (Math.sqrt(n1));
	}
	public double potencia(double n1) {
		return (n1*n1);
	}
	public double fraccion(double n1) {
		return (1/n1);
	}
}//class operaciones

class Calculadora extends JFrame implements ActionListener{
	JTextField entrada, lectura;
	JButton residuo, raiz,potencia,fraccion,ce,c,borrar,division,siete,ocho,nueve,multiplicacion;
	JButton cuatro,cinco,seis,resta,uno,dos,tres,suma,masMenos,cero,punto,igual;
	String botonPulsado="";
	
	public Calculadora() {
		setTitle("Calculadora");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(395,555);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setLayout(null);
		panel.setSize(395,555);
		
		//componentes GUI
		JLabel estandar = new JLabel("ESTÁNDAR");
		estandar.setFont(new Font("Arial",Font.BOLD,14));
		estandar.setBounds(5, 5, 100, 10);
		panel.add(estandar);
		
		lectura=new JTextField(10);
		lectura.setEditable(false);
	    lectura.setBorder(null);
		lectura.setBounds(10,25,360,20);
		panel.add(lectura);
		
		entrada=new JTextField(10);
		entrada.setEditable(false);
		entrada.setBorder(null);
		entrada.setBounds(10,50,360,60);
		panel.add(entrada);
		
		JButton mc=new JButton ("MC");
		mc.setBounds(10, 120, 60, 30);
		mc.setToolTipText("Borrar toda la memoria");
		mc.setOpaque(false);
		mc.setContentAreaFilled(false);
		mc.setBorderPainted(false);
		panel.add(mc);
		
		JButton mr=new JButton ("MR");
		mr.setBounds(70, 120, 60, 30);
		mr.setToolTipText("Recuperar de memoria");
		mr.setOpaque(false);
		mr.setContentAreaFilled(false);
		mr.setBorderPainted(false);
		panel.add(mr);
		
		JButton mm=new JButton ("M+");
		mm.setBounds(130, 120, 60, 30);
		mm.setToolTipText("Sumar a memoria");
		mm.setOpaque(false);
		mm.setContentAreaFilled(false);
		mm.setBorderPainted(false);
		panel.add(mm);
		
		JButton mmm=new JButton ("M-");
		mmm.setBounds(190, 120, 60, 30);
		mmm.setToolTipText("Restar de memoria");
		mmm.setOpaque(false);
		mmm.setContentAreaFilled(false);
		mmm.setBorderPainted(false);
		panel.add(mmm);
		
		JButton ms=new JButton ("MS");
		ms.setBounds(250, 120, 60, 30);
		ms.setToolTipText("Almacenar en memoria");
		ms.setOpaque(false);
		ms.setContentAreaFilled(false);
		ms.setBorderPainted(false);
		panel.add(ms);
		
		JButton mf=new JButton ("M^");
		mf.setBounds(310, 120, 60, 30);
		mf.setToolTipText("Memoria");
		mf.setOpaque(false);
		mf.setContentAreaFilled(false);
		mf.setBorderPainted(false);
		panel.add(mf);
		
		
		JLabel sep=new JLabel("<html><font color=\"gray\">___________________________________________________</font></html>");
		sep.setBounds(10,122,400,30);
		panel.add(sep);
		
		//---------------------------------
		JLabel texto1= new JLabel("  %");
		texto1.setFont(new Font("Arial",Font.BOLD,24));
		residuo=new JButton();
		residuo.setBounds(10, 150, 90,60);
		residuo.setOpaque(false);
		residuo.setContentAreaFilled(false);
		residuo.setBorderPainted(false);
		residuo.add(texto1);
		residuo.addActionListener(this);
		panel.add(residuo);
		
		JLabel texto2 = new JLabel("  √");
		texto2.setFont(new Font("Arial",Font.BOLD,24));
		raiz=new JButton();
		raiz.setBounds(100, 150, 90, 60);
		raiz.setOpaque(false);
		raiz.setContentAreaFilled(false);
		raiz.setBorderPainted(false);
		raiz.add(texto2);
		raiz.addActionListener(this);
		panel.add(raiz);
		
		JLabel texto3 = new JLabel("  χ²");
		texto3.setFont(new Font("Arial",Font.BOLD,24));
		potencia=new JButton();
		potencia.setBounds(190, 150, 90, 60);
		potencia.setOpaque(false);
		potencia.setContentAreaFilled(false);
		potencia.setBorderPainted(false);
		potencia.add(texto3);
		potencia.addActionListener(this);
		panel.add(potencia);
		
		JLabel texto4 = new JLabel("  1/x");
		texto4.setFont(new Font("Arial",Font.BOLD,24));
		fraccion=new JButton();
		fraccion.setBounds(280, 150, 90, 60);
		fraccion.setOpaque(false);
		fraccion.setContentAreaFilled(false);
		fraccion.setBorderPainted(false);
		fraccion.add(texto4);
		fraccion.addActionListener(this);
		panel.add(fraccion);
		
		//---------------------------
		JLabel texto5= new JLabel("  CE");
		texto5.setFont(new Font("Arial",Font.BOLD,20));
		ce=new JButton();
		ce.setBounds(10, 210, 90,60);
		ce.setBackground(Color.LIGHT_GRAY);
		ce.setBorderPainted(false);
		ce.add(texto5);
		ce.addActionListener(this);
		panel.add(ce);
		
		JLabel texto6= new JLabel("  C");
		texto6.setFont(new Font("Arial",Font.BOLD,20));
		c=new JButton();
		c.setBounds(100, 210, 90, 60);
		c.setBackground(Color.LIGHT_GRAY);
		c.setBorderPainted(false);
		c.add(texto6);
		c.addActionListener(this);
		panel.add(c);
		
		JLabel texto7= new JLabel(" <---");
		texto7.setFont(new Font("Arial",Font.BOLD,20));
		borrar=new JButton();
		borrar.setBounds(190, 210, 90, 60);
		borrar.setBackground(Color.LIGHT_GRAY);
		borrar.setBorderPainted(false);
		borrar.add(texto7);
		borrar.addActionListener(this);
		panel.add(borrar);
		
		JLabel texto8= new JLabel("  ÷");
		texto8.setFont(new Font("Arial",Font.BOLD,30));
		division=new JButton();
		division.setBounds(280, 210, 90, 60);
		division.setBackground(Color.LIGHT_GRAY);
		division.setBorderPainted(false);
		division.add(texto8);
		division.addActionListener(this);
		panel.add(division);
		
		//----------------------------------
		JLabel texto9= new JLabel("  7");
		texto9.setFont(new Font("Arial",Font.BOLD,30));
		siete=new JButton();
		siete.setBounds(10, 270, 90,60);
		siete.setBackground(Color.LIGHT_GRAY);
		siete.setBorderPainted(false);
		siete.add(texto9);
		siete.addActionListener(this);
		panel.add(siete);
		
		JLabel texto10= new JLabel("  8");
		texto10.setFont(new Font("Arial",Font.BOLD,30));
		ocho=new JButton();
		ocho.setBounds(100, 270, 90, 60);
		ocho.setBackground(Color.LIGHT_GRAY);
		ocho.setBorderPainted(false);
		ocho.add(texto10);
		ocho.addActionListener(this);
		panel.add(ocho);
		
		JLabel texto11= new JLabel("  9");
		texto11.setFont(new Font("Arial",Font.BOLD,30));
		nueve=new JButton();
		nueve.setBounds(190, 270, 90, 60);
		nueve.setBackground(Color.LIGHT_GRAY);
		nueve.setBorderPainted(false);
		nueve.add(texto11);
		nueve.addActionListener(this);
		panel.add(nueve);
		
		JLabel texto12= new JLabel("  X");
		texto12.setFont(new Font("Arial",Font.BOLD,26));
		multiplicacion=new JButton();
		multiplicacion.setBounds(280, 270, 90, 60);
		multiplicacion.setBackground(Color.LIGHT_GRAY);
		multiplicacion.setBorderPainted(false);
		multiplicacion.add(texto12);
		multiplicacion.addActionListener(this);
		panel.add(multiplicacion);
		
		//------------------------------------
		JLabel texto13= new JLabel("  4");
		texto13.setFont(new Font("Arial",Font.BOLD,30));
		cuatro=new JButton();
		cuatro.setBounds(10, 330, 90,60);
		cuatro.setBackground(Color.LIGHT_GRAY);
		cuatro.setBorderPainted(false);
		cuatro.add(texto13);
		cuatro.addActionListener(this);
		panel.add(cuatro);
		
		JLabel texto14= new JLabel("  5");
		texto14.setFont(new Font("Arial",Font.BOLD,30));
		cinco=new JButton();
		cinco.setBounds(100, 330, 90, 60);
		cinco.setBackground(Color.LIGHT_GRAY);
		cinco.setBorderPainted(false);
		cinco.add(texto14);
		cinco.addActionListener(this);
		panel.add(cinco);
		
		JLabel texto15= new JLabel("  6");
		texto15.setFont(new Font("Arial",Font.BOLD,30));
		seis=new JButton();
		seis.setBounds(190, 330, 90, 60);
		seis.setBackground(Color.LIGHT_GRAY);
		seis.setBorderPainted(false);
		seis.add(texto15);
		seis.addActionListener(this);
		panel.add(seis);
		
		JLabel texto16= new JLabel("   -");
		texto16.setFont(new Font("Arial",Font.BOLD,26));
		resta=new JButton();
		resta.setBounds(280, 330, 90, 60);
		resta.setBackground(Color.LIGHT_GRAY);
		resta.setBorderPainted(false);
		resta.add(texto16);
		resta.addActionListener(this);
		panel.add(resta);
		
		//-----------------------------------
		JLabel texto17= new JLabel("  1");
		texto17.setFont(new Font("Arial",Font.BOLD,30));
		uno=new JButton();
		uno.setBounds(10, 390, 90,60);
		uno.setBackground(Color.LIGHT_GRAY);
		uno.setBorderPainted(false);
		uno.add(texto17);
		uno.addActionListener(this);
		panel.add(uno);
		
		JLabel texto18= new JLabel("  2");
		texto18.setFont(new Font("Arial",Font.BOLD,30));
		dos=new JButton();
		dos.setBounds(100, 390, 90, 60);
		dos.setBackground(Color.LIGHT_GRAY);
		dos.setBorderPainted(false);
		dos.add(texto18);
		dos.addActionListener(this);
		panel.add(dos);
		
		JLabel texto19= new JLabel("  3");
		texto19.setFont(new Font("Arial",Font.BOLD,30));
		tres=new JButton();
		tres.setBounds(190, 390, 90, 60);
		tres.setBackground(Color.LIGHT_GRAY);
		tres.setBorderPainted(false);
		tres.add(texto19);
		tres.addActionListener(this);
		panel.add(tres);
		
		JLabel texto20= new JLabel("   +");
		texto20.setFont(new Font("Arial",Font.BOLD,26));
		suma=new JButton();
		suma.setBounds(280, 390, 90, 60);
		suma.setBackground(Color.LIGHT_GRAY);
		suma.setBorderPainted(false);
		suma.add(texto20);
		suma.addActionListener(this);
		panel.add(suma);
		
		//----------------------
		JLabel texto21= new JLabel(" +/-");
		texto21.setFont(new Font("Arial",Font.BOLD,28));
		masMenos=new JButton();
		masMenos.setBounds(10, 450, 90,60);
		masMenos.setBackground(Color.LIGHT_GRAY);
		masMenos.setBorderPainted(false);
		masMenos.add(texto21);
		masMenos.addActionListener(this);
		panel.add(masMenos);
		
		JLabel texto22= new JLabel("  0");
		texto22.setFont(new Font("Arial",Font.BOLD,30));
		cero=new JButton();
		cero.setBounds(100, 450, 90, 60);
		cero.setBackground(Color.LIGHT_GRAY);
		cero.setBorderPainted(false);
		cero.add(texto22);
		cero.addActionListener(this);
		panel.add(cero);
		
		JLabel texto23= new JLabel("  .");
		texto23.setFont(new Font("Arial",Font.BOLD,30));
		punto=new JButton();
		punto.setBounds(190, 450, 90, 60);
		punto.setBackground(Color.LIGHT_GRAY);
		punto.setBorderPainted(false);
		punto.add(texto23);
		punto.addActionListener(this);
		panel.add(punto);
		
		JLabel texto24= new JLabel("  =");
		texto24.setFont(new Font("Arial",Font.BOLD,32));
		igual=new JButton();
		igual.setBounds(280, 450, 90, 60);
		igual.setBackground(Color.LIGHT_GRAY);
		igual.setBorderPainted(false);
		igual.add(texto24);
		igual.addActionListener(this);
		panel.add(igual);
		
		add(panel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Operaciones op=new Operaciones();
		entrada.setFont(new Font("Arial",Font.BOLD,40));
		entrada.setHorizontalAlignment(4);
		lectura.setHorizontalAlignment(4);
		double num1=0,num2=0;
		
		try {
		if (e.getSource()==uno) {
			entrada.setText(entrada.getText()+"1");
		}
		if (e.getSource()==dos) {
			entrada.setText(entrada.getText()+"2");
		}
		if (e.getSource()==tres) {
			entrada.setText(entrada.getText()+"3");
		}
		if (e.getSource()==cuatro) {
			entrada.setText(entrada.getText()+"4");
		}
		if (e.getSource()==cinco) {
			entrada.setText(entrada.getText()+"5");
		}
		if (e.getSource()==seis) {
			entrada.setText(entrada.getText()+"6");
		}
		if (e.getSource()==siete) {
			entrada.setText(entrada.getText()+"7");
		}
		if (e.getSource()==ocho) {
			entrada.setText(entrada.getText()+"8");
		}
		if (e.getSource()==nueve) {
			entrada.setText(entrada.getText()+"9");
		}
		if (e.getSource()==cero) {
			entrada.setText(entrada.getText()+"0");
		}
		if (e.getSource()==suma) {
			botonPulsado="suma";
			if(lectura.getText().equals("")) {
				lectura.setText(entrada.getText());
			}else {
				num1=Double.parseDouble(lectura.getText());
			}
			if(entrada.getText().equals("")) {
				num2=0;
			}else {
				num2=Double.parseDouble(entrada.getText());
			}
			lectura.setText(String.valueOf(op.sumar(num1, num2)));
			//entrada.setText(String.valueOf(op.sumar(num1, num2)));
			entrada.setText("");
		}//boton suma
		
		if (e.getSource()==resta) {
			botonPulsado="resta";
			if(lectura.getText().equals("")) {
				lectura.setText(entrada.getText());
			}else {
				num1=Double.parseDouble(lectura.getText());
			}
			if(entrada.getText().equals("")) {
				num2=0;
			}else {
				num2=Double.parseDouble(entrada.getText())*-1;
			}
			lectura.setText(String.valueOf(op.restar(num1, num2)));
			entrada.setText("");
		}//boton resta
		
		if (e.getSource()==multiplicacion) {
			botonPulsado="multiplicacion";
			
			if(lectura.getText().equals("")) {
				num1=1;
			}else {
				num1=Double.parseDouble(lectura.getText());
			}
			if(entrada.getText().equals("")) {
				num2=1;
			}else {
				num2=Double.parseDouble(entrada.getText());
			}
			lectura.setText(String.valueOf(op.multiplicar(num1, num2)));
			entrada.setText("");
		}//boton multiplicacion
		
		
		if (e.getSource()==division) {
			botonPulsado="division";
			
			if(lectura.getText().equals("")) {
				double x=Double.parseDouble(entrada.getText())*Double.parseDouble(entrada.getText());
				lectura.setText(String.valueOf(x));
				entrada.setText(entrada.getText());
			}
			
			num1=Double.parseDouble(lectura.getText());
			num2=Double.parseDouble(entrada.getText());
			lectura.setText(String.valueOf(op.dividir(num1, num2)));
			entrada.setText("");
		}//boton division
		
		if (e.getSource()==raiz) {
			num1=Double.parseDouble(entrada.getText());
			entrada.setText(String.valueOf(op.raiz(num1)));
		}//boton raiz
		
		if(e.getSource()==fraccion) {
			num1=Double.parseDouble(entrada.getText());
			entrada.setText(String.valueOf(op.fraccion(num1)));
		}//boton fraccion
		
		if (e.getSource()==residuo) {
			if(lectura.getText().equals("")) {
				lectura.setText(entrada.getText());
				entrada.setText(entrada.getText());
			}
			
			num1=Double.parseDouble(lectura.getText());
			num2=Double.parseDouble(entrada.getText());
			lectura.setText(String.valueOf(op.residuo(num1, num2)));
			entrada.setText("");
		}//boton residuo
		
		if (e.getSource()==potencia) {
			num1=Double.parseDouble(entrada.getText());
			entrada.setText(String.valueOf(op.potencia(num1)));
		}//Boton potencia
		
		if(e.getSource()==igual) {
			if(botonPulsado.equals("suma")) {
				double n1=Double.parseDouble(lectura.getText());
				double n2=Double.parseDouble(entrada.getText());
				entrada.setText(String.valueOf(op.sumar(n1, n2)));
				lectura.setText("");
			}
			if(botonPulsado.equals("resta")) {
				double n1=Double.parseDouble(lectura.getText());
				double n2=Double.parseDouble(entrada.getText());
				entrada.setText(String.valueOf(op.restar(n1, n2)));
				lectura.setText("");
			}
			if(botonPulsado.equals("multiplicacion")) {
				double n1=Double.parseDouble(lectura.getText());
				double n2=Double.parseDouble(entrada.getText());
				entrada.setText(String.valueOf(op.multiplicar(n1, n2)));
				lectura.setText("");
			}
			
			if(botonPulsado.equals("division")) {
				double n1=Double.parseDouble(lectura.getText());
				double n2=Double.parseDouble(entrada.getText());
				entrada.setText(String.valueOf(op.dividir(n1, n2)));
				lectura.setText("");
			}
		} //Boton igual
		
		if(e.getSource()==punto) {
			
			entrada.setText(entrada.getText()+".");
		}//boton punto
		
		
		if (e.getSource()==borrar) {
			String cadena=entrada.getText();
			cadena=cadena.substring(0, cadena.length()-1);
			entrada.setText(cadena);
		}//boton borrar
		
		if (e.getSource()==masMenos) {
			double num=Double.parseDouble(entrada.getText())*-1;
			entrada.setText(String.valueOf(num));
		}//boton masMenos
		
		if(e.getSource()==c) {
			lectura.setText("");
			entrada.setText("0");
		}//boton c
		
		if(e.getSource()==ce) {
			entrada.setText("0");
		}//boton ce
		
		}catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(this,"Debes ingresar NUMEROS CORRECTOS");
		}catch(StringIndexOutOfBoundsException e2) {
			JOptionPane.showMessageDialog(this,"No hay números que borrar");
		}
		
		
	}//actionPerformed
}//class calculadora

public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Calculadora();
				
			}
		});

	}//main
}//class
