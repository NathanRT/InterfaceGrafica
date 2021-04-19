import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	private int tamanho = 20;


	public MeuLabel(String texto, int tamanho) {
		super(texto);
		this.tamanho = tamanho;		
		init();
	}
		
	public MeuLabel(String texto, Color forcor, Color backCor, int tamanho) {
		super(texto);
		this.tamanho = tamanho;
		init();
	}
	
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setFont(new Font("Arial", Font.BOLD, tamanho));
	}
	
}
