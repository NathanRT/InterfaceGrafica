import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
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
		private JComboBox<String> cnbGenero;
		private JCheckBox assistido;
		private JRadioButton netflix; 
		private JRadioButton primevideo;
		private JRadioButton piratebay;
		private StarRater StarRater;
		
	public BotaoListener(JTextField textTitulo, JTextField textSinopse, JComboBox<String> cnbGenero, JCheckBox assistido,
			JRadioButton netflix, JRadioButton primevideo, JRadioButton piratebay, StarRater StarRater) {
		
		this.textTitulo = textTitulo;
		this.textSinopse = textSinopse;
		this.cnbGenero = cnbGenero;
		this.assistido = assistido;
		this.netflix = netflix;
		this.primevideo = primevideo;
		this.piratebay = piratebay;
		this.StarRater = StarRater;

	}
		
	public void actionPerformed(ActionEvent e) {
		
		if(assistido.isSelected()) {
			assistir = "Sim";
		}
		else {
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
		
		if(textTitulo.getText().equals("") || cnbGenero.getSelectedItem() == null){
			JOptionPane.showMessageDialog(null, "Por favor, preecha todos os campos!");
		} else {
			JOptionPane.showMessageDialog(null, 
				"* FILME *\n" + 
				"-  " + textTitulo.getText() + "\n" +
				"-  " + textSinopse.getText() + "\n " +
				"-  " + cnbGenero.getSelectedItem() + "\n " +
				"-  " + Canal + "\n " +
				"-  " + assistir + "\n " +
				"-  " + StarRater.getSelection() + " Estrelas"
				);
		}

	}
}
