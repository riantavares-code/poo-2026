public class Mago extends Personagem{
    private int mana;
    public Mago(String nome, int vida, int nivel, int forca){
        super(nome, vida, nivel, forca);
        this.mana = 50;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if(mana >= 0){
            this.mana = mana;
        }else{
            System.out.println("Mana nao pode ser negativa.");
        }
    }
    @Override
    public String habilidade(){
        return "Expelliarmus";
    }
    @Override
    public void ficha(){
        System.out.println("Mago");
        super.ficha();
        System.out.println("Mana: " + this.mana);
    }
}