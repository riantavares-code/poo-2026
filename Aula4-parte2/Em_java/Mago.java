public class Mago extends Personagem{
    private int mana;
    public Mago(String nome, int vida, int nivel, int mana){
        super(nome, vida, nivel);
        this.mana = 50;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if(mana >= 0){
            this.mana = mana;
        }else{
            System.out.println("Mana não pode ser negativa.");
        }
    }
    @Override
    public void ficha(){
        System.out.println("Mago");
        super.ficha();
        System.out.println("Mana: " + this.mana);
    }
}