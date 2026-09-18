import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new TelaCriacaoHeroi();
            
            TelaCriacaoHeroiFlow telaFlow = new TelaCriacaoHeroiFlow();
            telaFlow.setLocation(telaFlow.getX() + 420, telaFlow.getY());
        });

        Guerreiro g = null;
        Mago mvalido = null;
        Mago minvalido = null;
        Chefe c = null;
        Item ig = null;
        Item im = null;
        System.out.println("teste de invalido");
        try {
            minvalido = new Mago("Hermione", -100, 33, 44);
        } catch (IllegalArgumentException e) {
            System.out.println("Captura de erro com sucesso: " + e.getMessage());
        }
        System.out.println("criacao de personagem");
        try {
            ig = new Item("Manopla", 3);
            im = new Item("Varinha de cedro", 5);
            c = new Chefe("Rabo-Corneo Hungaro");
            mvalido = new Mago("Dumblodore", 100, 78, 65);
            g = new Guerreiro("Hagrid", 100, 66, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no personagem: " + e.getMessage());
        }
        if (g != null && c != null && mvalido != null) {
            g.pegar(ig);
            mvalido.pegar(im);
            ArrayList<Personagem> Grupo = new ArrayList<Personagem>();
            Grupo.add(g);
            Grupo.add(mvalido);
            System.out.println("Comeco\n");
            while (c.getVida() > 0) {

                for (Personagem heroi : Grupo) {
                    if (c.getVida() <= 0) {
                        break;
                    }
                    heroi.ficha();
                    System.out.println(heroi.getNome() + " usa" + heroi.habilidade());
                    try {
                        heroi.atacar(c);
                    } catch (SemMana e) {
                        System.out.println(heroi.getNome() + " Falha: " + e.getMessage());
                        System.out.println(heroi.getNome() + " Turno passado");
                    } finally {
                        if (c.getVida() < 0) {
                            c.setVida(0);
                        }
                        System.out.println("Final do turno");
                    }
                }
                System.out.println("\nStatus final do ");
                c.ficha();
                System.err.println("\nVerificacao de mago");
                for (Personagem heroi : Grupo) {
                    if (heroi instanceof Mago) {
                        Mago mago = (Mago) heroi;
                        System.out.println("Mago: " + mago.getNome() + "\nMana: " + mago.getMana());
                    }
                }
            }
        }
    }
}

// Dentro da batalha não usamos checagem de tipo para respeitar o POLIMORFISMO,
// onde tratamos todos como personagem e a linguagem descobre o método correto sozinha.
// Fora do laço o uso do instanceof é aceitável pois serve para ler um atributo específico
// e exclusivo de Mago mana, que a classe genérica mãe não conhece.
