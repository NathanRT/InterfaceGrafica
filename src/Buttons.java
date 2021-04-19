import java.awt.Font;



import javax.swing.JRadioButton;

public class Buttons extends JRadioButton{
	
	private static final long serialVersionUID = 1L;

	public Buttons(String texto, int tamanho) {
		super(texto);	
		init();
	}
		
	private void init() {
		this.setFont(new Font("Arial", Font.BOLD, 12));
	}
	
}

