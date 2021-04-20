import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BotaoListener extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
		
		private String Canal;
		private String assistir;
		private JTextField textTitulo;
		private JTextField textSinopse;
		private JComboBox<String> pctGenero;
		private JCheckBox assistido;
		private JRadioButton netflix; 
		private JRadioButton primevideo;
		private JRadioButton piratebay;
		private StarRater StarRater;
		
	public BotaoListener(JTextField textTitulo, JTextField textSinopse, JComboBox<String> pctGenero, JCheckBox assistido,
			JRadioButton netflix, JRadioButton primevideo, JRadioButton piratebay, StarRater StarRater) {
		
		this.textTitulo = textTitulo;
		this.textSinopse = textSinopse;
		this.pctGenero = pctGenero;
		this.assistido = assistido;
		this.netflix = netflix;
		this.primevideo = primevideo;
		this.piratebay = piratebay;
		this.StarRater = StarRater;

	}
		
	public void actionPerformed(ActionEvent e) {
		
		Filme filme = new Filme();
		filme.setTitulo(textTitulo.getText());
		filme.setSinopse(textSinopse.getText());
		filme.setGenero((String) pctGenero.getSelectedItem());		
		filme.setavaliacao(StarRater.getSelection());
		
		if(assistido.isSelected()) {
			assistir = "Sim";
		} else {
			assistir = "Não";
		}
		
		if(netflix.isSelected()) {
			Canal = "Netflix";
		} else if (primevideo.isSelected()){
			Canal = "Primevideo";
		} else if (piratebay.isSelected()) {
			Canal = "Piratebay";
		} else {
			Canal = "Não definido";
		}
		
		if(textTitulo.getText().equals("") || pctGenero.getSelectedItem() == null){
			JOptionPane.showMessageDialog(null, "Por favor, preecha todos os campos!");
		} else {
		JOptionPane.showMessageDialog(null, 
				
				"Titulo: " + filme.getTitulo()
				+ "\nSinopse: " + filme.getSinopse()
				+ "\nGenero: " + filme.getGenero()
				+ "\nOnde assistir: " + Canal 
				+ "\nAssistido: " + assistir
				+ "\nAvaliaçãor: " + filme.getavaliacao()
				);
		}	

	}
}
