package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculadora() {
	
		organizarLayout();
		
		setLocationRelativeTo(null); // faz com que a tela apareça centralizada 
		setSize(232, 322); // Largura e Altura
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Para encerrar a RUN clicando no X
		setVisible(true); // inicia e aparece a tela
	}
		
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		new Calculadora();
	}
	
}
