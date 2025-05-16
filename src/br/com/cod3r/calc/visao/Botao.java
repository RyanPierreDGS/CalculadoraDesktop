package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String text, Color cor) {
		
		setText(text);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("courier", Font.PLAIN, 25)); // definindo estilo da fonte e tamnho
		setForeground(Color.white); // cor da fonte
		setBorder(BorderFactory.createLineBorder(Color.black)); // alterando cor da borda
	}
	
}
