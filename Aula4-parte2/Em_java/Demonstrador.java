public class Demonstrador{
    public static void main(String[] args){
        Guerreiro g = new Guerreiro("Rei Arthur", 100, 1, 5);
        Mago m = new Mago("Dumblodore", 100, 1, 100);
        Item ig = new Item("Espada de fogo", 3);
        Item im = new Item("Varinha de cedro", 5);

        g.pegar(ig);
        m.pegar(im);
        g.ficha();
        m.ficha();
    }
}