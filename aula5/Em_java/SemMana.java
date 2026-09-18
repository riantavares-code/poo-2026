public class SemMana extends Exception{
    private int manatual;

    public int getMana(){
        return this.manatual;
    }
    public SemMana(int manatual){
        super("mana insuficiente: " + manatual + ", precisa de pelo menos 10 de mana");
    this.manatual = manatual;
    }
}