public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    public void receber_dano(int dano){
        this.vida -= dano;
        if(this.vida < 0)this.vida = 0;
    }
    public boolean esta_vivo(){
        return this.vida > 0;
    }
    public void ficha(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Forca: " + this.forca);
    }
    public void atacar(Personagem alvo){
        alvo.receber_dano(this.forca);
    }
    public static void main(String[] args){
        Personagem heroi = new Personagem("Heroi", 100, 10);
        Personagem chefe = new Personagem("Chefe",  150, 15);
        System.out.println("\n----Ficha de Personagem----\n");
        heroi.ficha();
        System.out.println();
        chefe.ficha();
        while (heroi.esta_vivo() && chefe.esta_vivo()){
            heroi.atacar(chefe);
            if (chefe.esta_vivo()){
                chefe.atacar(heroi);
            }
        }
        System.out.println("----Apos a luta----\n");
        heroi.ficha();
        System.out.println();
        chefe.ficha();
        if (heroi.esta_vivo()){
            System.out.println("Vitoria do heroi\n");
        }else{
            System.out.println("Vitoria do chefe");
        }
    }
}
