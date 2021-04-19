import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoListener extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
		private JTextField textTitulo;
		private JTextField textSinopse;
		private JComboBox<String> cnbGenero;

		
	public BotaoListener(JTextField textTitulo, JTextField textSinopse, JComboBox<String> cnbGenero, ButtonGroup GrupoButtom) {
		this.textTitulo = textTitulo;
		this.textSinopse = textSinopse;
		this.cnbGenero = cnbGenero;


	}
		
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, 
				"* FILME *\n" + 
				"-  " + textTitulo.getText() + "\n" +
				"-  " + textSinopse.getText() + "\n " +
				"-  " + cnbGenero.getSelectedItem() + "\n ");

		}
	
}
