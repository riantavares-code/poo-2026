import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCriacaoHeroi extends JFrame {
    public TelaCriacaoHeroi() {
        super("IF Quest");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Texto Provisório"); 
        JTextField campoNome = new JTextField( 15);
        JTextField campoVida = new JTextField(15);
        JTextField campoClasse = new JTextField( 15);
        JButton botaoCriar = new JButton("Botão");

        titulo.setText("Criação de Herói"); 
        titulo.setHorizontalAlignment(JLabel.CENTER);
        
        botaoCriar.setText("Criar Herói");   
        botaoCriar.setEnabled(false);

        String valorInicialNome = campoNome.getText(); 
        System.out.println("--------------------------------------------------");
        System.out.println("[Console] Conteúdo consultado do campoNome: " + valorInicialNome);
        System.out.println("[Console] Texto consultado do titulo: " + titulo.getText());
        System.out.println("--------------------------------------------------");

        JPanel painelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        painelFormulario.add(new JLabel("Nome:"));
        painelFormulario.add(campoNome);
        painelFormulario.add(new JLabel("Vida:"));
        painelFormulario.add(campoVida);
        painelFormulario.add(new JLabel("Classe:"));
        painelFormulario.add(campoClasse);

        JPanel painelCentral = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 30));
        painelCentral.add(painelFormulario);

        add(titulo, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.CENTER);
        add(botaoCriar, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
