public class Mago extends Personagem{
    private int mana;
    public Mago(String nome, int vida, int nivel, int forca){
        super(nome, vida, nivel, forca);
        this.setMana(50);
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if(mana < 0){
            throw new IllegalArgumentException("Mana nao pode ser negativa: " + mana);
        }
        this.mana = mana;
    }
    @Override
    public String habilidade(){
        return "Expelliarmus";
    }
    @Override
    public void atacar(Personagem alvo) throws SemMana{
        if(this.mana < 10) throw new SemMana(this.mana);
        this.mana -= 10;
        super.atacar(alvo);
    }
    @Override
    public void ficha(){
        System.out.println("\nMago");
        super.ficha();
        System.out.println("Mana: " + this.mana);
    }
}
