import java.util.ArrayList;
public abstract class Personagem{
    public abstract String habilidade();
    protected  String nome;
    protected int vida;
    protected int nivel;
    protected int forca;
    private ArrayList<Item> inventario;
    public Personagem(String nome, int vida, int nivel, int forca){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.forca = forca;
        this.inventario = new ArrayList<Item>();
    }
    public String getNome(){return this.nome;}
    public int getVida(){return this.vida;}
    public int getNivel(){return this.nivel;}
    public int getForca(){return this.forca;}
    public void pegar(Item item){
        if(item != null){
            this.inventario.add(item);
        }else{System.out.println("ERRO, item nulo\n");}
    }
    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("ERRO, nome vazio\n");
        }else{this.nome = nome;}
    }
    public void setVida(int vida){
        if (vida >= 0){
        this.vida = vida;
        }else{System.out.println("ERRO, vida fora do limite definido\n");}
    }
    public void setNivel(int nivel){
        if (nivel >= 1){
        this.nivel = nivel;
        }else{
            System.out.println("ERRO, nivel abaixo do minimo\n");
        }
    }public void setForca(int forca){
        if (forca >= 0){
            this.forca = forca;
        }else{
            System.out.println("ERRO, forca negativa\n");
        }
    }
    public void setHabilidade(String habilidade){
    }
    public void atacar(Personagem alvo){
        if (alvo != null) {
            int danoTotal = this.forca;
            for (Item i : this.inventario) {
                danoTotal += i.getBonus();
            }
            alvo.setVida(alvo.getVida() - danoTotal);
            System.out.println(this.nome + " atacou " + alvo.getNome() + " causando " + danoTotal + " de dano total!");
            } else {
                System.out.println("ERRO: Nao ha alvo para atacar.\n");
        }
    }
    public void ficha(){
        System.out.println("\nPersonagem");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Forca: " + this.forca);
        System.out.println("Habilidade: " + habilidade());
        System.out.println("Inventario: ");
        if(inventario.isEmpty()){
            System.out.println("Inventario vazio");
        }else{
            for(Item item : inventario){
                System.out.println(item.Descricao());
            }
        }
    }
}