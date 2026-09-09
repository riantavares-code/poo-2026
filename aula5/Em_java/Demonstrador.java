import java.util.ArrayList;
public class Demonstrador{
    public static void main(String[] args){
        Guerreiro g = new Guerreiro("Hagrid", 100, 66, 30);
        Mago m = new Mago("Dumblodore", 100, 78, 85);
        Chefe c = new Chefe("Rabo-Corneo Hungaro");
        Item ig = new Item("Manopla", 3);
        Item im = new Item("Varinha de cedro", 5);
        g.pegar(ig);
        m.pegar(im);
        ArrayList<Personagem> Grupo = new ArrayList<Personagem>();
        Grupo.add(g);
        Grupo.add(m);
        System.out.println("Comeco\n");
        for (Personagem heroi : Grupo){
            heroi.ficha();
           
            System.out.println(heroi.getNome() + "usa" + heroi.habilidade());
            heroi.atacar(c);
        }
        System.out.println("Status final do chefe");
        c.ficha();
        System.err.println("Verificacao do mago");
        for (Personagem heroi : Grupo){
            if (heroi instanceof Mago){
                Mago mago = (Mago) heroi;
                System.out.println("Mago: " + mago.getNome() + "\nMana: " + mago.getMana());
            }
        }
    }
}
// Dentro da batalha não usamos checagem de tipo para respeitar o POLIMORFISMO,
// onde tratamos todos como personagem e a linguagem descobre o método correto sozinha.
// Fora do laço o uso do instanceof é aceitável pois serve para ler um atributo específico
// e exclusivo de Mago mana, que a classe genérica mãe não conhece.