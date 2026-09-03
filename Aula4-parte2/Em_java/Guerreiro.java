public class Guerreiro extends Personagem{
    private int defesa;
    public Guerreiro(String nome, int vida, int nivel, int defesa){
        super(nome, vida, nivel);
        this.defesa = 5;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa){
        if(defesa >= 0){
            this.defesa = defesa;
        }else{
            System.out.println("Defesa não pode ser negativa.");
        }
    }
    @Override
    public void ficha(){
        System.out.println("Guerreiro");
        super.ficha();
        System.out.println("Defesa: " + this.defesa);
    }
}