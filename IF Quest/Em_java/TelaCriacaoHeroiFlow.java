import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCriacaoHeroiFlow extends JFrame {
    public TelaCriacaoHeroiFlow() {
        super("IF Quest - Versão FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        JLabel titulo = new JLabel("Criação de Herói"); 
        JTextField campoNome = new JTextField("Digite o nome aqui", 15);
        JTextField campoVida = new JTextField(15);
        JTextField campoClasse = new JTextField(15);
        JButton botaoCriar = new JButton("Criar Herói");

        botaoCriar.setEnabled(false);

        add(titulo);
        add(new JLabel("Nome:"));
        add(campoNome);
        add(new JLabel("Vida:"));
        add(campoVida);
        add(new JLabel("Classe:"));
        add(campoClasse);
        add(botaoCriar);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
