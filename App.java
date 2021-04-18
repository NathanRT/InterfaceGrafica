import java.awt.Color;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;


public class App {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
		JFrame frame = new JFrame();
		
		JPanel janela = new JPanel();
		janela.setLayout(new FlowLayout());

		//JPanel panel = new JPanel(new GridLayout(2,2));
		MeuTextField nameTextField = new MeuTextField();
		janela.add(new MeuLabel("Bem Vindo", Color.BLACK));
		janela.add(nameTextField);
		janela.add(new MeuTextArea());
		
		janela.add(new JCheckBox("Aceito os termos do contrato"));
		
		List<String> listaDeOpcoes = List.of("Boleto", "Cartão");
		MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
		janela.add(group);
		
		MeuRadioGroup group2 = new MeuRadioGroup(List.of("Residencial", "Comercial", "Celular"));
		janela.add(group2);
		
		String[] cidades = {"São Paulo", "Osasco", "Diadema"};
		janela.add(new JComboBox<String>(cidades));
		
		janela.add(new StarRater(10, 3.5f));
		
		JButton botao = new JButton("Salvar");
		botao.addActionListener(new BotaoListener(nameTextField));
		//botao.addMouseListener(new BotaoListener());
		JPanel painelBotao = new JPanel(new FlowLayout());
		janela.add(botao);
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Inicio", janela);
		abas.add("Cadastro", painelBotao);
		abas.add("Perfil", new JPanel());
		
		frame.add(abas);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
		
	}


}
