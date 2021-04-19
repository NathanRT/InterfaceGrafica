import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class App {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
		
		JFrame frame = new JFrame();
		JTabbedPane aba = new JTabbedPane();
		JLabel labelImagem = new MeuLabel("Inserir imagem aqui", Color.BLACK, Color.darkGray, 12);
		JLabel labelTitulo = new MeuLabel("Título", 13);
		JLabel labelSinopse = new MeuLabel("Sinopse", 13);
		JLabel labelGenero = new MeuLabel("Gênero", 13);
		JLabel labelOndeAssistir = new MeuLabel("Onde Assistir", 13);
		JLabel labelavaliar = new MeuLabel("Avaliar", 13);
		JPanel panelCadastro = new JPanel(new FlowLayout());
		JPanel panelLista = new JPanel(new FlowLayout());
		JTextField textTitulo = new JTextField();
		JTextField textSinopse = new JTextField();
		JButton botaoSalvar = new JButton("Salvar");
		JButton botaoCancelar = new JButton("Cancelar");
		JButton botaoLista = new JButton("Lista");
		JRadioButton netflix = new Buttons("Netflix", 0);
		JRadioButton primevideo = new Buttons("Primevideo", 0);
		JRadioButton piratebay = new Buttons("Piratebay", 0);
		ButtonGroup GrupoButtom = new ButtonGroup();
		JCheckBox assistido = new JCheckBox("Assistido");
		StarRater StarRater = new StarRater(5, 0f);
		
		
		frame.setSize(525,285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("FIAP MOVIES - Entrega Parcial");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(aba);
		aba.add("Cadastro", panelCadastro);
		aba.add("Lista", panelLista);

		panelCadastro.setLayout(null);
		
		labelImagem.setBackground(Color.yellow);
		labelImagem.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		labelImagem.setOpaque(true);
		labelImagem.setBounds(20, 10, 130, 160);
		panelCadastro.add(labelImagem);
		
		labelTitulo.setBounds(175, 15, 100, 20);
		panelCadastro.add(labelTitulo);
		
		labelSinopse.setBounds(175, 70, 100, 20);
		panelCadastro.add(labelSinopse);
		
		labelGenero.setBounds(175, 122, 100, 20);
		panelCadastro.add(labelGenero);	
		
		labelOndeAssistir.setBounds(345, 15, 100, 20);
		panelCadastro.add(labelOndeAssistir);
		
		labelavaliar.setBounds(345, 137, 100, 20);
		panelCadastro.add(labelavaliar);
		
		textTitulo.setBounds(175, 37, 150,25);
		panelCadastro.add(textTitulo);
		
		textSinopse.setBounds(175, 92, 150,25);
		panelCadastro.add(textSinopse);
		
		botaoSalvar.setBounds(175, 184, 70, 30);
		panelCadastro.add(botaoSalvar);
		
		botaoCancelar.setBounds(247, 184, 80, 30);
		panelCadastro.add(botaoCancelar);
		
		netflix.setBounds(345, 33, 120, 30);	
		panelCadastro.add(netflix);
		
		primevideo.setBounds(345, 58, 120, 30);
		panelCadastro.add(primevideo);
		
		piratebay.setBounds(345, 83, 120, 30);
		panelCadastro.add(piratebay);
		
		GrupoButtom.add(netflix);
		GrupoButtom.add(primevideo);
		GrupoButtom.add(piratebay);
		
		assistido.setFont(new Font("Arial", Font.BOLD, 12));
		assistido.setBounds(345, 106, 120, 30);
		panelCadastro.add(assistido);
				
		StarRater.setBounds(345, 157, 80, 30);
		panelCadastro.add(StarRater);
		
		botaoLista.setBounds(170, 220, 100, 30);
		panelLista.add(botaoLista);
	
		String[] generos = {"Ação", "Aventura", "Comédia", "Comédia de Ação", "Comédia de Terror", "Comédia Romântica", "Dança", "Documentário","Drama", "Espionagem", "Fantasia", "Ficção Científica", "Musical", "Romance","Suspense", "Terror"};
		
		JComboBox<String> cnbGenero = new JComboBox<String>(generos);
		cnbGenero.setVisible(true);
		cnbGenero.setFont(new Font("Arial", Font.PLAIN, 12));
		cnbGenero.setSelectedItem(null);
		panelCadastro.add(cnbGenero);
		cnbGenero.setBounds(175, 145, 150, 25);
		
		botaoSalvar.addActionListener(new BotaoListener(textTitulo, textSinopse, cnbGenero, GrupoButtom));
		
		}	
}

