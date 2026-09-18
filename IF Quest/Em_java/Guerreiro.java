public class Guerreiro extends Personagem{
    private int defesa;
    public Guerreiro(String nome, int vida, int nivel, int forca){
        super(nome, vida, nivel, forca);
        this.setDefesa(5);
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa){
        if(defesa < 0){
            throw new IllegalArgumentException("Defesa nao pode ser negativa: " + defesa);
        }
        this.defesa = defesa;
    }
    @Override
    public String habilidade(){
        return "Soco poderoso";
    }
    @Override
    public void atacar(Personagem alvo) throws SemMana{
        super.atacar(alvo);
    }
    @Override
    public void ficha(){
        System.out.println("\nGuerreiro");
        super.ficha();
        System.out.println("Defesa: " + this.defesa);
    }
}