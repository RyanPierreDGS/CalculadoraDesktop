package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;
	
	public Display() {
		Memoria.getinstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getinstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);
	}
	
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
